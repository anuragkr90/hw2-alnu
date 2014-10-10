package edu.cmu.deiis.types;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Set;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;

import org.apache.uima.UIMARuntimeException;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;

import abner.Tagger;

public class NewJCasAnnotatorAb extends JCasAnnotator_ImplBase {

  Tagger mdl;
  @Override
  public void initialize(UimaContext aContext) throws ResourceInitializationException{
    try{
      /*
       * Initialize the abner tagger
       */
      mdl = new Tagger();
    } catch(Exception e) {
      throw new UIMARuntimeException(e);
    }
  }
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub

    
    FSIterator iterator = arg0.getJFSIndexRepository().getAllIndexedFS(SentTS.type);
    SentTS sent = (SentTS) iterator.next();
    
    String actSent = sent.getSentence();
    
    String[][] recEnt = mdl.getEntities(actSent);
    
    for(String ent : recEnt[0]){
      
      Pattern pt = Pattern.compile(Pattern.quote(ent));
      Matcher mt = pt.matcher(actSent);
      
      while(mt.find()){
        
        NamedTS newne = new NamedTS(arg0);
        int st = mt.start();
        int ed = st+ent.length();
        
        int bgn = nonwhitespace((String)sent.getSentence(), st);
        int nd  = nonwhitespace((String)sent.getSentence(), ed);
        
        //String actner =  (String)sent.getSentence().substring(st, ed);
        
        newne.setBegin(bgn);
        newne.setEnd(nd-1);
        newne.setNE((String)sent.getSentence().substring(st, ed));
        /*
         * Consider only if the length of named entity is more than 8
         */
        if(newne.getNE().length() >= 8)
          newne.addToIndexes();
        
      }
      
    }
    
  }
  //private static String manghyph(String str){
   // String editstr = str.charAt[0];
  //  int i = 1;
   //while(i <= str.length()-2){
   //   if(((str.charAt(i) == '-') && (str.charAt(i-1) == ' ')) || ((str.charAt(i) == '-') && (str.charAt(i-1) == ' ')))
    //    editstr =editstr + '-';
   // }
  //}
  private static int nonwhitespace(String str, int id) {
    /*
     * finding number of characters before whitespace
     */
    
    int idx_notspace = 0;
    for(int i = 0; i < id; i++) {
    if(str.charAt(i) != ' ')
    idx_notspace++;
    }
    return idx_notspace;
    }

}
