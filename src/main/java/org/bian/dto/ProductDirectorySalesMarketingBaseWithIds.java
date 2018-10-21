package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectorySalesMarketingBaseWithIds
 */
public class ProductDirectorySalesMarketingBaseWithIds   {
  private String productServiceDirectoryEntryReference = null;

  private String productServiceSalesMarketingDirectoryEntryReference = null;

  private String productServiceSalesMaterial = null;

  private String productServicesFeaturesAndOptions = null;

  private String productServicePricingTable = null;

  private String productServiceFeesPenaltiesTable = null;


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
   * @return productServiceSalesMarketingDirectoryEntryReference
  **/

  public String getProductServiceSalesMarketingDirectoryEntryReference() {
    return productServiceSalesMarketingDirectoryEntryReference;
  }

  public void setProductServiceSalesMarketingDirectoryEntryReference(String productServiceSalesMarketingDirectoryEntryReference) {
    this.productServiceSalesMarketingDirectoryEntryReference = productServiceSalesMarketingDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceSalesMaterial
  **/

  public String getProductServiceSalesMaterial() {
    return productServiceSalesMaterial;
  }

  public void setProductServiceSalesMaterial(String productServiceSalesMaterial) {
    this.productServiceSalesMaterial = productServiceSalesMaterial;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServicesFeaturesAndOptions
  **/

  public String getProductServicesFeaturesAndOptions() {
    return productServicesFeaturesAndOptions;
  }

  public void setProductServicesFeaturesAndOptions(String productServicesFeaturesAndOptions) {
    this.productServicesFeaturesAndOptions = productServicesFeaturesAndOptions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServicePricingTable
  **/

  public String getProductServicePricingTable() {
    return productServicePricingTable;
  }

  public void setProductServicePricingTable(String productServicePricingTable) {
    this.productServicePricingTable = productServicePricingTable;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceFeesPenaltiesTable
  **/

  public String getProductServiceFeesPenaltiesTable() {
    return productServiceFeesPenaltiesTable;
  }

  public void setProductServiceFeesPenaltiesTable(String productServiceFeesPenaltiesTable) {
    this.productServiceFeesPenaltiesTable = productServiceFeesPenaltiesTable;
  }


}

