package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectoryProductionBase
 */
public class ProductDirectoryProductionBase   {
  private String productServiceFeature = null;

  private String productServiceLocationAvailability = null;

  private String productServiceTimeAvailability = null;

  private String productServiceAccessAvailability = null;


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
   * general=info: Locations where product/service supported `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceLocationAvailability
  **/

  public String getProductServiceLocationAvailability() {
    return productServiceLocationAvailability;
  }

  public void setProductServiceLocationAvailability(String productServiceLocationAvailability) {
    this.productServiceLocationAvailability = productServiceLocationAvailability;
  }


  /**
   * Get productServiceTimeAvailability
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

