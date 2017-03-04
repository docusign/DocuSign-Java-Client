package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ServiceVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-02T23:49:11.300-08:00")
public class ServiceInformation   {
  
  private String buildBranch = null;
  private String buildBranchDeployedDateTime = null;
  private String buildSHA = null;
  private String buildVersion = null;
  private java.util.List<String> linkedSites = new java.util.ArrayList<String>();
  private java.util.List<ServiceVersion> serviceVersions = new java.util.ArrayList<ServiceVersion>();

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildBranch")
  public String getBuildBranch() {
    return buildBranch;
  }
  public void setBuildBranch(String buildBranch) {
    this.buildBranch = buildBranch;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildBranchDeployedDateTime")
  public String getBuildBranchDeployedDateTime() {
    return buildBranchDeployedDateTime;
  }
  public void setBuildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
    this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildSHA")
  public String getBuildSHA() {
    return buildSHA;
  }
  public void setBuildSHA(String buildSHA) {
    this.buildSHA = buildSHA;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("buildVersion")
  public String getBuildVersion() {
    return buildVersion;
  }
  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("linkedSites")
  public java.util.List<String> getLinkedSites() {
    return linkedSites;
  }
  public void setLinkedSites(java.util.List<String> linkedSites) {
    this.linkedSites = linkedSites;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceVersions")
  public java.util.List<ServiceVersion> getServiceVersions() {
    return serviceVersions;
  }
  public void setServiceVersions(java.util.List<ServiceVersion> serviceVersions) {
    this.serviceVersions = serviceVersions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInformation serviceInformation = (ServiceInformation) o;

    return true && Objects.equals(buildBranch, serviceInformation.buildBranch) &&
        Objects.equals(buildBranchDeployedDateTime, serviceInformation.buildBranchDeployedDateTime) &&
        Objects.equals(buildSHA, serviceInformation.buildSHA) &&
        Objects.equals(buildVersion, serviceInformation.buildVersion) &&
        Objects.equals(linkedSites, serviceInformation.linkedSites) &&
        Objects.equals(serviceVersions, serviceInformation.serviceVersions)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildBranch, buildBranchDeployedDateTime, buildSHA, buildVersion, linkedSites, serviceVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInformation {\n");
    
    sb.append("    buildBranch: ").append(toIndentedString(buildBranch)).append("\n");
    sb.append("    buildBranchDeployedDateTime: ").append(toIndentedString(buildBranchDeployedDateTime)).append("\n");
    sb.append("    buildSHA: ").append(toIndentedString(buildSHA)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    linkedSites: ").append(toIndentedString(linkedSites)).append("\n");
    sb.append("    serviceVersions: ").append(toIndentedString(serviceVersions)).append("\n");
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

