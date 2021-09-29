package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandResources.
 *
 */

public class BrandResources {
  @JsonProperty("createdByUserInfo")
  private UserInfo createdByUserInfo = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("modifiedByUserInfo")
  private UserInfo modifiedByUserInfo = null;

  @JsonProperty("modifiedDate")
  private String modifiedDate = null;

  @JsonProperty("modifiedTemplates")
  private java.util.List<String> modifiedTemplates = null;

  @JsonProperty("resourcesContentType")
  private String resourcesContentType = null;

  @JsonProperty("resourcesContentUri")
  private String resourcesContentUri = null;


  /**
   * createdByUserInfo.
   *
   * @return BrandResources
   **/
  public BrandResources createdByUserInfo(UserInfo createdByUserInfo) {
    this.createdByUserInfo = createdByUserInfo;
    return this;
  }

  /**
   * Get createdByUserInfo.
   * @return createdByUserInfo
   **/
  @ApiModelProperty(value = "")
  public UserInfo getCreatedByUserInfo() {
    return createdByUserInfo;
  }

  /**
   * setCreatedByUserInfo.
   **/
  public void setCreatedByUserInfo(UserInfo createdByUserInfo) {
    this.createdByUserInfo = createdByUserInfo;
  }


  /**
   * createdDate.
   *
   * @return BrandResources
   **/
  public BrandResources createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * .
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * modifiedByUserInfo.
   *
   * @return BrandResources
   **/
  public BrandResources modifiedByUserInfo(UserInfo modifiedByUserInfo) {
    this.modifiedByUserInfo = modifiedByUserInfo;
    return this;
  }

  /**
   * Get modifiedByUserInfo.
   * @return modifiedByUserInfo
   **/
  @ApiModelProperty(value = "")
  public UserInfo getModifiedByUserInfo() {
    return modifiedByUserInfo;
  }

  /**
   * setModifiedByUserInfo.
   **/
  public void setModifiedByUserInfo(UserInfo modifiedByUserInfo) {
    this.modifiedByUserInfo = modifiedByUserInfo;
  }


  /**
   * modifiedDate.
   *
   * @return BrandResources
   **/
  public BrandResources modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * .
   * @return modifiedDate
   **/
  @ApiModelProperty(value = "")
  public String getModifiedDate() {
    return modifiedDate;
  }

  /**
   * setModifiedDate.
   **/
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   * modifiedTemplates.
   *
   * @return BrandResources
   **/
  public BrandResources modifiedTemplates(java.util.List<String> modifiedTemplates) {
    this.modifiedTemplates = modifiedTemplates;
    return this;
  }
  
  /**
   * addModifiedTemplatesItem.
   *
   * @return BrandResources
   **/
  public BrandResources addModifiedTemplatesItem(String modifiedTemplatesItem) {
    if (this.modifiedTemplates == null) {
      this.modifiedTemplates = new java.util.ArrayList<String>();
    }
    this.modifiedTemplates.add(modifiedTemplatesItem);
    return this;
  }

  /**
   * .
   * @return modifiedTemplates
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getModifiedTemplates() {
    return modifiedTemplates;
  }

  /**
   * setModifiedTemplates.
   **/
  public void setModifiedTemplates(java.util.List<String> modifiedTemplates) {
    this.modifiedTemplates = modifiedTemplates;
  }


  /**
   * resourcesContentType.
   *
   * @return BrandResources
   **/
  public BrandResources resourcesContentType(String resourcesContentType) {
    this.resourcesContentType = resourcesContentType;
    return this;
  }

  /**
   * .
   * @return resourcesContentType
   **/
  @ApiModelProperty(value = "")
  public String getResourcesContentType() {
    return resourcesContentType;
  }

  /**
   * setResourcesContentType.
   **/
  public void setResourcesContentType(String resourcesContentType) {
    this.resourcesContentType = resourcesContentType;
  }


  /**
   * resourcesContentUri.
   *
   * @return BrandResources
   **/
  public BrandResources resourcesContentUri(String resourcesContentUri) {
    this.resourcesContentUri = resourcesContentUri;
    return this;
  }

  /**
   * .
   * @return resourcesContentUri
   **/
  @ApiModelProperty(value = "")
  public String getResourcesContentUri() {
    return resourcesContentUri;
  }

  /**
   * setResourcesContentUri.
   **/
  public void setResourcesContentUri(String resourcesContentUri) {
    this.resourcesContentUri = resourcesContentUri;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandResources brandResources = (BrandResources) o;
    return Objects.equals(this.createdByUserInfo, brandResources.createdByUserInfo) &&
        Objects.equals(this.createdDate, brandResources.createdDate) &&
        Objects.equals(this.modifiedByUserInfo, brandResources.modifiedByUserInfo) &&
        Objects.equals(this.modifiedDate, brandResources.modifiedDate) &&
        Objects.equals(this.modifiedTemplates, brandResources.modifiedTemplates) &&
        Objects.equals(this.resourcesContentType, brandResources.resourcesContentType) &&
        Objects.equals(this.resourcesContentUri, brandResources.resourcesContentUri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(createdByUserInfo, createdDate, modifiedByUserInfo, modifiedDate, modifiedTemplates, resourcesContentType, resourcesContentUri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandResources {\n");
    
    sb.append("    createdByUserInfo: ").append(toIndentedString(createdByUserInfo)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedByUserInfo: ").append(toIndentedString(modifiedByUserInfo)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedTemplates: ").append(toIndentedString(modifiedTemplates)).append("\n");
    sb.append("    resourcesContentType: ").append(toIndentedString(resourcesContentType)).append("\n");
    sb.append("    resourcesContentUri: ").append(toIndentedString(resourcesContentUri)).append("\n");
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

