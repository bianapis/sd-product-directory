package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectoryServicingBaseWithIds
 */
public class ProductDirectoryServicingBaseWithIds   {
  private String productServiceDirectoryEntryReference = null;

  private String productServiceServicingDirectoryEntryReference = null;

  private String productServiceFeature = null;

  private String producServicetFeatureGuideline = null;

  private String productServiceFeatureProblemDiagnosis = null;

  private String productServiceFeatureProblemResolution = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productServiceDirectoryEntryReference
  **/

  public String getProductServiceDirectoryEntryReference() {
    return productServiceDirectoryEntryReference;
  }

  public void setProductServiceDirectoryEntryReference(String productServiceDirectoryEntryReference) {
    this.productServiceDirectoryEntryReference = productServiceDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productServiceServicingDirectoryEntryReference
  **/

  public String getProductServiceServicingDirectoryEntryReference() {
    return productServiceServicingDirectoryEntryReference;
  }

  public void setProductServiceServicingDirectoryEntryReference(String productServiceServicingDirectoryEntryReference) {
    this.productServiceServicingDirectoryEntryReference = productServiceServicingDirectoryEntryReference;
  }


  /**
   * general-info: Collection of features making up product/service `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceFeature
  **/

  public String getProductServiceFeature() {
    return productServiceFeature;
  }

  public void setProductServiceFeature(String productServiceFeature) {
    this.productServiceFeature = productServiceFeature;
  }


  /**
   * general-info: Explanation of guidelines for use of product feature `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return producServicetFeatureGuideline
  **/

  public String getProducServicetFeatureGuideline() {
    return producServicetFeatureGuideline;
  }

  public void setProducServicetFeatureGuideline(String producServicetFeatureGuideline) {
    this.producServicetFeatureGuideline = producServicetFeatureGuideline;
  }


  /**
   * general-info: Servicing guide for addressing reported issues `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceFeatureProblemDiagnosis
  **/

  public String getProductServiceFeatureProblemDiagnosis() {
    return productServiceFeatureProblemDiagnosis;
  }

  public void setProductServiceFeatureProblemDiagnosis(String productServiceFeatureProblemDiagnosis) {
    this.productServiceFeatureProblemDiagnosis = productServiceFeatureProblemDiagnosis;
  }


  /**
   * general-info: Servicing guide for resolving reported issue `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceFeatureProblemResolution
  **/

  public String getProductServiceFeatureProblemResolution() {
    return productServiceFeatureProblemResolution;
  }

  public void setProductServiceFeatureProblemResolution(String productServiceFeatureProblemResolution) {
    this.productServiceFeatureProblemResolution = productServiceFeatureProblemResolution;
  }


}

