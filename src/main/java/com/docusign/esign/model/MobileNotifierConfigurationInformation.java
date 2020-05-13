package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.MobileNotifierConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MobileNotifierConfigurationInformation
 */

public class MobileNotifierConfigurationInformation {
  @JsonProperty("mobileNotifierConfigurations")
  private java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations = null;

  public MobileNotifierConfigurationInformation mobileNotifierConfigurations(java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations) {
    this.mobileNotifierConfigurations = mobileNotifierConfigurations;
    return this;
  }

  public MobileNotifierConfigurationInformation addMobileNotifierConfigurationsItem(MobileNotifierConfiguration mobileNotifierConfigurationsItem) {
    if (this.mobileNotifierConfigurations == null) {
      this.mobileNotifierConfigurations = new java.util.ArrayList<MobileNotifierConfiguration>();
    }
    this.mobileNotifierConfigurations.add(mobileNotifierConfigurationsItem);
    return this;
  }

   /**
   * 
   * @return mobileNotifierConfigurations
  **/
  @ApiModelProperty(value = "")
  public java.util.List<MobileNotifierConfiguration> getMobileNotifierConfigurations() {
    return mobileNotifierConfigurations;
  }

  public void setMobileNotifierConfigurations(java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations) {
    this.mobileNotifierConfigurations = mobileNotifierConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation = (MobileNotifierConfigurationInformation) o;
    return Objects.equals(this.mobileNotifierConfigurations, mobileNotifierConfigurationInformation.mobileNotifierConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNotifierConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNotifierConfigurationInformation {\n");
    
    sb.append("    mobileNotifierConfigurations: ").append(toIndentedString(mobileNotifierConfigurations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

