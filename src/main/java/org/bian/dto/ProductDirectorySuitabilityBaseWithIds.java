package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectorySuitabilityBaseWithIds
 */
public class ProductDirectorySuitabilityBaseWithIds   {
  private String productServiceDirectoryEntryReference = null;

  private String productServiceEligibiltyDirectoryEntryReference = null;

  private String productSuitabilityGuide = null;

  private String productServiceEligibilityType = null;

  private String productServiceEligibilityDescription = null;


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
   * @return productServiceEligibiltyDirectoryEntryReference
  **/

  public String getProductServiceEligibiltyDirectoryEntryReference() {
    return productServiceEligibiltyDirectoryEntryReference;
  }

  public void setProductServiceEligibiltyDirectoryEntryReference(String productServiceEligibiltyDirectoryEntryReference) {
    this.productServiceEligibiltyDirectoryEntryReference = productServiceEligibiltyDirectoryEntryReference;
  }


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

