
/* First created by JCasGen Tue Oct 07 13:41:53 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 07 13:41:53 EDT 2014
 * @generated */
public class SentTS_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SentTS_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SentTS_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SentTS(addr, SentTS_Type.this);
  			   SentTS_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SentTS(addr, SentTS_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SentTS.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("SentTS");
 
  /** @generated */
  final Feature casFeat_SentId;
  /** @generated */
  final int     casFeatCode_SentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentId(int addr) {
        if (featOkTst && casFeat_SentId == null)
      jcas.throwFeatMissing("SentId", "SentTS");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentId(int addr, String v) {
        if (featOkTst && casFeat_SentId == null)
      jcas.throwFeatMissing("SentId", "SentTS");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Sentence;
  /** @generated */
  final int     casFeatCode_Sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentence(int addr) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "SentTS");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentence(int addr, String v) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "SentTS");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SentTS_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentId = jcas.getRequiredFeatureDE(casType, "SentId", "uima.cas.String", featOkTst);
    casFeatCode_SentId  = (null == casFeat_SentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentId).getCode();

 
    casFeat_Sentence = jcas.getRequiredFeatureDE(casType, "Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Sentence  = (null == casFeat_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence).getCode();

  }
}



    