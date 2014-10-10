package edu.cmu.deiis.types;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

import org.apache.uima.UIMARuntimeException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.resource.ResourceProcessException;

public class CASConsumer extends CasConsumer_ImplBase {
  
  BufferedWriter bfrw = null;
  HashSet<String> fout = null;
  @Override
  
  public void initialize(){
    String fnm = (String)getConfigParameterValue("outputfilename");
    File fl = new File(fnm);
    try {
      /*
       * Buffered reader for writing the final output file..outputfilename specifies the name of output file 
       */
    bfrw = new BufferedWriter(new FileWriter(fl));
    } catch (FileNotFoundException e) {
    throw new UIMARuntimeException(e);
    } catch (IOException e){
      throw new UIMARuntimeException(e);
    }
    fout = new HashSet<String>();
  }
  public void processCas(CAS arg0) throws ResourceProcessException {
    // TODO Auto-generated method stub
    /* @param CAS arg0
     * Gets sentence id from from "Annotated"
     * Gets begin , end and Named Entity from "stringN"
     * Writes them through the created buffered writer
     */
    JCas jacas = null;
    try {
      jacas =arg0.getJCas();
    } catch (CASException e) {
      throw new UIMARuntimeException(e);
    }
    try {
      
      
      FSIterator iter_anno = jacas.getJFSIndexRepository().getAllIndexedFS(SentTS.type);
      
      String sntid = ((SentTS) iter_anno.next()).getSentId();
      
      FSIterator iter_stringN = jacas.getJFSIndexRepository().getAllIndexedFS(NamedTS.type);
      
      //stringN NE = ((stringN) iterator2.get());
      //SentTS senta = ((SentTS) iter_anno.next());
      
      //String sentid = senta.getSentId();
      
      while (iter_stringN.hasNext()) {
      NamedTS NE = ((NamedTS) iter_stringN.next());
      String newstr = sntid + "|" + NE.getBegin() + " " + NE.getEnd() + "|" + NE.getNE() + '\n';
      if (!fout.contains(newstr)){
        bfrw.write(newstr);
        fout.add(newstr);
      }
     }
      bfrw.flush();
      } catch (Exception e) {
      throw new UIMARuntimeException(e);
      }
  }

}

