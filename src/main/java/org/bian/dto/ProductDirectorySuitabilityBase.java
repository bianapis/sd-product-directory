package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectorySuitabilityBase
 */
public class ProductDirectorySuitabilityBase   {
  private String productSuitabilityGuide = null;

  private String productServiceEligibilityType = null;

  private String productServiceEligibilityDescription = null;


  /**
   * general-info: Lists properties of matched customer types - bank defined `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productSuitabilityGuide
  **/

  public String getProductSuitabilityGuide() {
    return productSuitabilityGuide;
  }

  public void setProductSuitabilityGuide(String productSuitabilityGuide) {
    this.productSuitabilityGuide = productSuitabilityGuide;
  }


  /**
   * general-info: Legal or regulatory requirement governing eligibility `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceEligibilityType
  **/

  public String getProductServiceEligibilityType() {
    return productServiceEligibilityType;
  }

  public void setProductServiceEligibilityType(String productServiceEligibilityType) {
    this.productServiceEligibilityType = productServiceEligibilityType;
  }


  /**
   * general-info: Description of eligibility requirements `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceEligibilityDescription
  **/

  public String getProductServiceEligibilityDescription() {
    return productServiceEligibilityDescription;
  }

  public void setProductServiceEligibilityDescription(String productServiceEligibilityDescription) {
    this.productServiceEligibilityDescription = productServiceEligibilityDescription;
  }


}

