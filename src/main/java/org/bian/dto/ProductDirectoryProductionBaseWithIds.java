package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectoryProductionBaseWithIds
 */
public class ProductDirectoryProductionBaseWithIds   {
  private String productServiceDirectoryEntryReference = null;

  private String productServiceProductionDirectoryEntryReference = null;

  private String productServiceFeature = null;

  private String productServiceLocationAvailability = null;

  private String productServiceTimeAvailability = null;

  private String productServiceAccessAvailability = null;


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
   * @return productServiceProductionDirectoryEntryReference
  **/

  public String getProductServiceProductionDirectoryEntryReference() {
    return productServiceProductionDirectoryEntryReference;
  }

  public void setProductServiceProductionDirectoryEntryReference(String productServiceProductionDirectoryEntryReference) {
    this.productServiceProductionDirectoryEntryReference = productServiceProductionDirectoryEntryReference;
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
   * general-info: Locations where product/service supported `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceLocationAvailability
  **/

  public String getProductServiceLocationAvailability() {
    return productServiceLocationAvailability;
  }

  public void setProductServiceLocationAvailability(String productServiceLocationAvailability) {
    this.productServiceLocationAvailability = productServiceLocationAvailability;
  }


  /**
   * general-info: Dates and times product/service is available `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return productServiceTimeAvailability
  **/

  public String getProductServiceTimeAvailability() {
    return productServiceTimeAvailability;
  }

  public void setProductServiceTimeAvailability(String productServiceTimeAvailability) {
    this.productServiceTimeAvailability = productServiceTimeAvailability;
  }


  /**
   * general-info: Access channels/devices supported by the product/service `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceAccessAvailability
  **/

  public String getProductServiceAccessAvailability() {
    return productServiceAccessAvailability;
  }

  public void setProductServiceAccessAvailability(String productServiceAccessAvailability) {
    this.productServiceAccessAvailability = productServiceAccessAvailability;
  }


}

