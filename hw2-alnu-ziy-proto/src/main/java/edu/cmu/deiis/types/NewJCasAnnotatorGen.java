package edu.cmu.deiis.types;
import java.io.File;
import java.util.Set;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.Annotator_ImplBase;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.AbstractCas;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.internal.util.StringUtils;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.util.AbstractExternalizable;

public class NewJCasAnnotatorGen extends JCasAnnotator_ImplBase {

  Chunker mdl;
  public void initialize(UimaContext aContext) throws ResourceInitializationException{
    
    /* @param UimaContext aContext
     * Initialize lingpipe Chunker from the modelfilename in aeDescriptor.xml
     */
    
    try{
      
      File fl =new File((String)aContext.getConfigParameterValue("modelfilename2"));
      mdl = (Chunker) AbstractExternalizable.readObject(fl);      
    } catch (Exception e){
      e.printStackTrace();
    }
    
  }
  
  
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub

    /* @param JCas arg0
     * creating Named Entities using lingpipe..model chunks the sentence into named entities..
     * For all the chunks the start and end of characters and the named entity are stored
     */
    
    FSIterator iterator = arg0.getJFSIndexRepository().getAllIndexedFS(SentTS.type);
    SentTS sent = (SentTS) iterator.next();
    Set<Chunk> AllNe = mdl.chunk((String)sent.getSentence()).chunkSet();
    
    for(Chunk chunk : AllNe) {
    NamedTS newne = new NamedTS(arg0);
    
    int st = chunk.start();
    int ed = chunk.end();
    
    //newne.setBegin(st);
    //newne.setEnd(ed);
    
    int bgn = nonwhitespace((String)sent.getSentence(), st);
    int nd  = nonwhitespace((String)sent.getSentence(), ed);
    
    newne.setBegin(bgn);
    newne.setEnd(nd-1);
    newne.setNE((String)sent.getSentence().substring(st, ed));
    newne.addToIndexes();
    
    }
    
  }
  
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
