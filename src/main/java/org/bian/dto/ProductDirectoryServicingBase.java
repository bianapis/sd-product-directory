package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectoryServicingBase
 */
public class ProductDirectoryServicingBase   {
  private String productServiceFeature = null;

  private String productServiceFeatureGuideline = null;

  private String productServiceFeatureProblemDiagnosis = null;

  private String productServiceFeatureProblemResolution = null;


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
   * @return productServiceFeatureGuideline
  **/

  public String getProductServiceFeatureGuideline() {
    return productServiceFeatureGuideline;
  }

  public void setProductServiceFeatureGuideline(String productServiceFeatureGuideline) {
    this.productServiceFeatureGuideline = productServiceFeatureGuideline;
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

