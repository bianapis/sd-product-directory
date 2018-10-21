package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProductDirectoryOperationBase
 */
public class ProductDirectoryOperationBase   {
  private String productServiceOperatingSchedule = null;

  private String productServiceConfigurationParameterType = null;

  private String productServiceConfigurationParameterDescription = null;

  private String productServiceConfigurationParameterSetting = null;


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

