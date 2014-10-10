
/* First created by JCasGen Wed Oct 08 19:37:08 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Oct 08 19:37:08 EDT 2014
 *  */
public class NamedTS_Type extends Annotation_Type {
  /**  
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /**  */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NamedTS_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NamedTS_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NamedTS(addr, NamedTS_Type.this);
  			   NamedTS_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NamedTS(addr, NamedTS_Type.this);
  	  }
    };
  /**  */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NamedTS.typeIndexID;
  /**  
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.NamedTS");
 
  /**  */
  final Feature casFeat_NE;
  /**  */
  final int     casFeatCode_NE;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNE(int addr) {
        if (featOkTst && casFeat_NE == null)
      jcas.throwFeatMissing("NE", "edu.cmu.deiis.types.NamedTS");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NE);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNE(int addr, String v) {
        if (featOkTst && casFeat_NE == null)
      jcas.throwFeatMissing("NE", "edu.cmu.deiis.types.NamedTS");
    ll_cas.ll_setStringValue(addr, casFeatCode_NE, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * 
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NamedTS_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NE = jcas.getRequiredFeatureDE(casType, "NE", "uima.cas.String", featOkTst);
    casFeatCode_NE  = (null == casFeat_NE) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NE).getCode();

  }
}



    