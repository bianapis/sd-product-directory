package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectoryOperationBaseWithIds
 */
public class ProductDirectoryOperationBaseWithIds   {
  private String productServiceDirectoryEntryReference = null;

  private String productServiceOperationsDirectoryEntryReference = null;

  private String productServiceOperatingSchedule = null;

  private String productServiceConfigurationParameterType = null;

  private String productServiceConfigurationParameterDescription = null;

  private String productServiceConfigurationParameterSetting = null;


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
   * @return productServiceOperationsDirectoryEntryReference
  **/

  public String getProductServiceOperationsDirectoryEntryReference() {
    return productServiceOperationsDirectoryEntryReference;
  }

  public void setProductServiceOperationsDirectoryEntryReference(String productServiceOperationsDirectoryEntryReference) {
    this.productServiceOperationsDirectoryEntryReference = productServiceOperationsDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return productServiceOperatingSchedule
  **/

  public String getProductServiceOperatingSchedule() {
    return productServiceOperatingSchedule;
  }

  public void setProductServiceOperatingSchedule(String productServiceOperatingSchedule) {
    this.productServiceOperatingSchedule = productServiceOperatingSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceConfigurationParameterType
  **/

  public String getProductServiceConfigurationParameterType() {
    return productServiceConfigurationParameterType;
  }

  public void setProductServiceConfigurationParameterType(String productServiceConfigurationParameterType) {
    this.productServiceConfigurationParameterType = productServiceConfigurationParameterType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceConfigurationParameterDescription
  **/

  public String getProductServiceConfigurationParameterDescription() {
    return productServiceConfigurationParameterDescription;
  }

  public void setProductServiceConfigurationParameterDescription(String productServiceConfigurationParameterDescription) {
    this.productServiceConfigurationParameterDescription = productServiceConfigurationParameterDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value 
   * @return productServiceConfigurationParameterSetting
  **/

  public String getProductServiceConfigurationParameterSetting() {
    return productServiceConfigurationParameterSetting;
  }

  public void setProductServiceConfigurationParameterSetting(String productServiceConfigurationParameterSetting) {
    this.productServiceConfigurationParameterSetting = productServiceConfigurationParameterSetting;
  }


}

