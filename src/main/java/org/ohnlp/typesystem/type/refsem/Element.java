/*******************************************************************************
 * Copyright: (c)  2013  Mayo Foundation for Medical Education and 
 *  Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 *  triple-shield Mayo logo are trademarks and service marks of MFMER.
 *  
 *  Except as contained in the copyright notice above, or as used to identify 
 *  MFMER as the author of this software, the trade names, trademarks, service
 *  marks, or product names of the copyright holder shall not be used in
 *  advertising, promotion or otherwise in connection with this software without
 *  prior written authorization of the copyright holder.
 *  
 *  MedTime is free software: you can redistribute it and/or modify it under the 
 *  terms of the GNU General Public License as published by the Free Software 
 *  Foundation, either version 3 of the License, or (at your option) any later version.
 *  
 *  MedTime is distributed in the hope that it will be useful, but WITHOUT ANY 
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 *  FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with MedTime.  If not, see http://www.gnu.org/licenses/.
 *
 *******************************************************************************/


/* First created by JCasGen Sun Sep 29 06:04:08 CDT 2013 */
package org.ohnlp.typesystem.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.ohnlp.typesystem.type.textsem.IdentifiedAnnotation;
import org.apache.uima.jcas.cas.TOP;


/** A basic semantic unit that refers to something in the real world, including Entities, Events, Attributes, Dates.  Element inherits from uima.cas.TOP to combine textual mentions of these real-world objects.
 * Updated by JCasGen Sun Sep 29 06:07:11 CDT 2013
 * XML source: /MedTime-1.0/descsrc/org/ohnlp/medtime/types/MedTimeTypes.xml
 * @generated */
public class Element extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Element.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Element() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Element(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Element(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated */
  public int getId() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated */
  public void setId(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: ontologyConcept

  /** getter for ontologyConcept - gets 
   * @generated */
  public OntologyConcept getOntologyConcept() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_ontologyConcept == null)
      jcasType.jcas.throwFeatMissing("ontologyConcept", "org.ohnlp.typesystem.type.refsem.Element");
    return (OntologyConcept)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_ontologyConcept)));}
    
  /** setter for ontologyConcept - sets  
   * @generated */
  public void setOntologyConcept(OntologyConcept v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_ontologyConcept == null)
      jcasType.jcas.throwFeatMissing("ontologyConcept", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setRefValue(addr, ((Element_Type)jcasType).casFeatCode_ontologyConcept, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mentions

  /** getter for mentions - gets 
   * @generated */
  public FSArray getMentions() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.ohnlp.typesystem.type.refsem.Element");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions)));}
    
  /** setter for mentions - sets  
   * @generated */
  public void setMentions(FSArray v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for mentions - gets an indexed value - 
   * @generated */
  public IdentifiedAnnotation getMentions(int i) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i);
    return (IdentifiedAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i)));}

  /** indexed setter for mentions - sets an indexed value - 
   * @generated */
  public void setMentions(int i, IdentifiedAnnotation v) { 
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_mentions == null)
      jcasType.jcas.throwFeatMissing("mentions", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Element_Type)jcasType).casFeatCode_mentions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: discoveryTechnique

  /** getter for discoveryTechnique - gets 
   * @generated */
  public int getDiscoveryTechnique() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_discoveryTechnique);}
    
  /** setter for discoveryTechnique - sets  
   * @generated */
  public void setDiscoveryTechnique(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_discoveryTechnique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Element_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Element_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: conditional

  /** getter for conditional - gets 
   * @generated */
  public boolean getConditional() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_conditional);}
    
  /** setter for conditional - sets  
   * @generated */
  public void setConditional(boolean v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_conditional == null)
      jcasType.jcas.throwFeatMissing("conditional", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_conditional, v);}    
   
    
  //*--------------*
  //* Feature: generic

  /** getter for generic - gets 
   * @generated */
  public boolean getGeneric() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_generic == null)
      jcasType.jcas.throwFeatMissing("generic", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_generic);}
    
  /** setter for generic - sets  
   * @generated */
  public void setGeneric(boolean v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_generic == null)
      jcasType.jcas.throwFeatMissing("generic", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Element_Type)jcasType).casFeatCode_generic, v);}    
   
    
  //*--------------*
  //* Feature: subject

  /** getter for subject - gets 
   * @generated */
  public String getSubject() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_subject == null)
      jcasType.jcas.throwFeatMissing("subject", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Element_Type)jcasType).casFeatCode_subject);}
    
  /** setter for subject - sets  
   * @generated */
  public void setSubject(String v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_subject == null)
      jcasType.jcas.throwFeatMissing("subject", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setStringValue(addr, ((Element_Type)jcasType).casFeatCode_subject, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated */
  public int getPolarity() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated */
  public void setPolarity(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: uncertainty

  /** getter for uncertainty - gets 
   * @generated */
  public int getUncertainty() {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.ohnlp.typesystem.type.refsem.Element");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Element_Type)jcasType).casFeatCode_uncertainty);}
    
  /** setter for uncertainty - sets  
   * @generated */
  public void setUncertainty(int v) {
    if (Element_Type.featOkTst && ((Element_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.ohnlp.typesystem.type.refsem.Element");
    jcasType.ll_cas.ll_setIntValue(addr, ((Element_Type)jcasType).casFeatCode_uncertainty, v);}    
  }

    