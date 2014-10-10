

/* First created by JCasGen Tue Oct 07 13:41:53 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 07 13:41:53 EDT 2014
 * XML source: /home/anurag/git/hw2-alnu/hw2-alnu-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class NamedTS extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NamedTS.class);
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
  protected NamedTS() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NamedTS(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NamedTS(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NamedTS(JCas jcas, int begin, int end) {
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
  //* Feature: Begin

  /** getter for Begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "NamedTS");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NamedTS_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "NamedTS");
    jcasType.ll_cas.ll_setIntValue(addr, ((NamedTS_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "NamedTS");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NamedTS_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "NamedTS");
    jcasType.ll_cas.ll_setIntValue(addr, ((NamedTS_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: NE

  /** getter for NE - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNE() {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_NE == null)
      jcasType.jcas.throwFeatMissing("NE", "NamedTS");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedTS_Type)jcasType).casFeatCode_NE);}
    
  /** setter for NE - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNE(String v) {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_NE == null)
      jcasType.jcas.throwFeatMissing("NE", "NamedTS");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedTS_Type)jcasType).casFeatCode_NE, v);}    
  }

    