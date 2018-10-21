package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectorySalesMarketingBase
 */
public class ProductDirectorySalesMarketingBase   {
  private String productServiceSalesMaterial = null;

  private String productServicesFeaturesAndOptions = null;

  private String productServicePricingTable = null;

  private String productServiceFeesPenaltiesTable = null;


  /**
   * general-info: Description of sales material `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceSalesMaterial
  **/

  public String getProductServiceSalesMaterial() {
    return productServiceSalesMaterial;
  }

  public void setProductServiceSalesMaterial(String productServiceSalesMaterial) {
    this.productServiceSalesMaterial = productServiceSalesMaterial;
  }


  /**
   * general-info: Description of product features and options `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServicesFeaturesAndOptions
  **/

  public String getProductServicesFeaturesAndOptions() {
    return productServicesFeaturesAndOptions;
  }

  public void setProductServicesFeaturesAndOptions(String productServicesFeaturesAndOptions) {
    this.productServicesFeaturesAndOptions = productServicesFeaturesAndOptions;
  }


  /**
   * general-info: Allowed price ranges by credit grade/customer type `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServicePricingTable
  **/

  public String getProductServicePricingTable() {
    return productServicePricingTable;
  }

  public void setProductServicePricingTable(String productServicePricingTable) {
    this.productServicePricingTable = productServicePricingTable;
  }


  /**
   * general-info: Applicable fees/penalties `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceFeesPenaltiesTable
  **/

  public String getProductServiceFeesPenaltiesTable() {
    return productServiceFeesPenaltiesTable;
  }

  public void setProductServiceFeesPenaltiesTable(String productServiceFeesPenaltiesTable) {
    this.productServiceFeesPenaltiesTable = productServiceFeesPenaltiesTable;
  }


}

