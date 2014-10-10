

/* First created by JCasGen Wed Oct 08 19:37:08 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Oct 08 19:37:08 EDT 2014
 * XML source: /home/anurag/git/hw2-alnu/hw2-alnu-ziy-proto/src/main/resources/descriptors/deiis_types.xml
 *  */
public class NamedTS extends Annotation {
  /** 
   *  
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NamedTS.class);
  /** 
   *  
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** 
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   *  */
  protected NamedTS() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * 
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NamedTS(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** 
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NamedTS(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
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
   *  modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: NE

  /** getter for NE - gets 
   * 
   * @return value of the feature 
   */
  public String getNE() {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_NE == null)
      jcasType.jcas.throwFeatMissing("NE", "edu.cmu.deiis.types.NamedTS");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedTS_Type)jcasType).casFeatCode_NE);}
    
  /** setter for NE - sets  
   * 
   * @param v value to set into the feature 
   */
  public void setNE(String v) {
    if (NamedTS_Type.featOkTst && ((NamedTS_Type)jcasType).casFeat_NE == null)
      jcasType.jcas.throwFeatMissing("NE", "edu.cmu.deiis.types.NamedTS");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedTS_Type)jcasType).casFeatCode_NE, v);}    
  }

    