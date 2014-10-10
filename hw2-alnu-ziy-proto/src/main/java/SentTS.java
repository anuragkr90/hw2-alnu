

/* First created by JCasGen Tue Oct 07 13:41:53 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 07 13:41:53 EDT 2014
 * XML source: /home/anurag/git/hw2-alnu/hw2-alnu-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class SentTS extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentTS.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SentTS() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentTS(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentTS(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentTS(JCas jcas, int begin, int end) {
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
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: SentId

  /** getter for SentId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentId() {
    if (SentTS_Type.featOkTst && ((SentTS_Type)jcasType).casFeat_SentId == null)
      jcasType.jcas.throwFeatMissing("SentId", "SentTS");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentTS_Type)jcasType).casFeatCode_SentId);}
    
  /** setter for SentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentId(String v) {
    if (SentTS_Type.featOkTst && ((SentTS_Type)jcasType).casFeat_SentId == null)
      jcasType.jcas.throwFeatMissing("SentId", "SentTS");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentTS_Type)jcasType).casFeatCode_SentId, v);}    
   
    
  //*--------------*
  //* Feature: Sentence

  /** getter for Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentence() {
    if (SentTS_Type.featOkTst && ((SentTS_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "SentTS");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentTS_Type)jcasType).casFeatCode_Sentence);}
    
  /** setter for Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(String v) {
    if (SentTS_Type.featOkTst && ((SentTS_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "SentTS");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentTS_Type)jcasType).casFeatCode_Sentence, v);}    
  }

    