

/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Oct 08 19:37:08 EDT 2014
 * XML source: /home/anurag/git/hw2-alnu/hw2-alnu-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 *  */
public class Question extends Annotation {
  /** 
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
  /** 
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /**   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   *  */
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   *  */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /**  */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /**  */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   *  modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
}

    