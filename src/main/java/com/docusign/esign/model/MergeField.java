package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PathExtendedElement;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information for transfering values between Salesforce data fields and DocuSign Tabs.
 */
@ApiModel(description = "Contains information for transfering values between Salesforce data fields and DocuSign Tabs.")

public class MergeField {
  @JsonProperty("allowSenderToEdit")
  private String allowSenderToEdit = null;

  @JsonProperty("allowSenderToEditMetadata")
  private PropertyMetadata allowSenderToEditMetadata = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("configurationTypeMetadata")
  private PropertyMetadata configurationTypeMetadata = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("pathExtended")
  private java.util.List<PathExtendedElement> pathExtended = null;

  @JsonProperty("pathExtendedMetadata")
  private PropertyMetadata pathExtendedMetadata = null;

  @JsonProperty("pathMetadata")
  private PropertyMetadata pathMetadata = null;

  @JsonProperty("row")
  private String row = null;

  @JsonProperty("rowMetadata")
  private PropertyMetadata rowMetadata = null;

  @JsonProperty("writeBack")
  private String writeBack = null;

  @JsonProperty("writeBackMetadata")
  private PropertyMetadata writeBackMetadata = null;

  public MergeField allowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
    return this;
  }

   /**
   * When set to **true**, the sender can modify the value of the custom tab during the sending process.
   * @return allowSenderToEdit
  **/
  @ApiModelProperty(value = "When set to **true**, the sender can modify the value of the custom tab during the sending process.")
  public String getAllowSenderToEdit() {
    return allowSenderToEdit;
  }

  public void setAllowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
  }

  public MergeField allowSenderToEditMetadata(PropertyMetadata allowSenderToEditMetadata) {
    this.allowSenderToEditMetadata = allowSenderToEditMetadata;
    return this;
  }

   /**
   * Get allowSenderToEditMetadata
   * @return allowSenderToEditMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAllowSenderToEditMetadata() {
    return allowSenderToEditMetadata;
  }

  public void setAllowSenderToEditMetadata(PropertyMetadata allowSenderToEditMetadata) {
    this.allowSenderToEditMetadata = allowSenderToEditMetadata;
  }

  public MergeField configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   * @return configurationType
  **/
  @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  public MergeField configurationTypeMetadata(PropertyMetadata configurationTypeMetadata) {
    this.configurationTypeMetadata = configurationTypeMetadata;
    return this;
  }

   /**
   * Get configurationTypeMetadata
   * @return configurationTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getConfigurationTypeMetadata() {
    return configurationTypeMetadata;
  }

  public void setConfigurationTypeMetadata(PropertyMetadata configurationTypeMetadata) {
    this.configurationTypeMetadata = configurationTypeMetadata;
  }

  public MergeField path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Sets the object associated with the custom tab. Currently this is the Salesforce Object.
   * @return path
  **/
  @ApiModelProperty(value = "Sets the object associated with the custom tab. Currently this is the Salesforce Object.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MergeField pathExtended(java.util.List<PathExtendedElement> pathExtended) {
    this.pathExtended = pathExtended;
    return this;
  }

  public MergeField addPathExtendedItem(PathExtendedElement pathExtendedItem) {
    if (this.pathExtended == null) {
      this.pathExtended = new java.util.ArrayList<PathExtendedElement>();
    }
    this.pathExtended.add(pathExtendedItem);
    return this;
  }

   /**
   * 
   * @return pathExtended
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PathExtendedElement> getPathExtended() {
    return pathExtended;
  }

  public void setPathExtended(java.util.List<PathExtendedElement> pathExtended) {
    this.pathExtended = pathExtended;
  }

  public MergeField pathExtendedMetadata(PropertyMetadata pathExtendedMetadata) {
    this.pathExtendedMetadata = pathExtendedMetadata;
    return this;
  }

   /**
   * Get pathExtendedMetadata
   * @return pathExtendedMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getPathExtendedMetadata() {
    return pathExtendedMetadata;
  }

  public void setPathExtendedMetadata(PropertyMetadata pathExtendedMetadata) {
    this.pathExtendedMetadata = pathExtendedMetadata;
  }

  public MergeField pathMetadata(PropertyMetadata pathMetadata) {
    this.pathMetadata = pathMetadata;
    return this;
  }

   /**
   * Get pathMetadata
   * @return pathMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getPathMetadata() {
    return pathMetadata;
  }

  public void setPathMetadata(PropertyMetadata pathMetadata) {
    this.pathMetadata = pathMetadata;
  }

  public MergeField row(String row) {
    this.row = row;
    return this;
  }

   /**
   * Specifies the row number in a Salesforce table that the merge field value corresponds to.
   * @return row
  **/
  @ApiModelProperty(value = "Specifies the row number in a Salesforce table that the merge field value corresponds to.")
  public String getRow() {
    return row;
  }

  public void setRow(String row) {
    this.row = row;
  }

  public MergeField rowMetadata(PropertyMetadata rowMetadata) {
    this.rowMetadata = rowMetadata;
    return this;
  }

   /**
   * Get rowMetadata
   * @return rowMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRowMetadata() {
    return rowMetadata;
  }

  public void setRowMetadata(PropertyMetadata rowMetadata) {
    this.rowMetadata = rowMetadata;
  }

  public MergeField writeBack(String writeBack) {
    this.writeBack = writeBack;
    return this;
  }

   /**
   * When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.
   * @return writeBack
  **/
  @ApiModelProperty(value = "When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.")
  public String getWriteBack() {
    return writeBack;
  }

  public void setWriteBack(String writeBack) {
    this.writeBack = writeBack;
  }

  public MergeField writeBackMetadata(PropertyMetadata writeBackMetadata) {
    this.writeBackMetadata = writeBackMetadata;
    return this;
  }

   /**
   * Get writeBackMetadata
   * @return writeBackMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getWriteBackMetadata() {
    return writeBackMetadata;
  }

  public void setWriteBackMetadata(PropertyMetadata writeBackMetadata) {
    this.writeBackMetadata = writeBackMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeField mergeField = (MergeField) o;
    return Objects.equals(this.allowSenderToEdit, mergeField.allowSenderToEdit) &&
        Objects.equals(this.allowSenderToEditMetadata, mergeField.allowSenderToEditMetadata) &&
        Objects.equals(this.configurationType, mergeField.configurationType) &&
        Objects.equals(this.configurationTypeMetadata, mergeField.configurationTypeMetadata) &&
        Objects.equals(this.path, mergeField.path) &&
        Objects.equals(this.pathExtended, mergeField.pathExtended) &&
        Objects.equals(this.pathExtendedMetadata, mergeField.pathExtendedMetadata) &&
        Objects.equals(this.pathMetadata, mergeField.pathMetadata) &&
        Objects.equals(this.row, mergeField.row) &&
        Objects.equals(this.rowMetadata, mergeField.rowMetadata) &&
        Objects.equals(this.writeBack, mergeField.writeBack) &&
        Objects.equals(this.writeBackMetadata, mergeField.writeBackMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSenderToEdit, allowSenderToEditMetadata, configurationType, configurationTypeMetadata, path, pathExtended, pathExtendedMetadata, pathMetadata, row, rowMetadata, writeBack, writeBackMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    sb.append("    allowSenderToEdit: ").append(toIndentedString(allowSenderToEdit)).append("\n");
    sb.append("    allowSenderToEditMetadata: ").append(toIndentedString(allowSenderToEditMetadata)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    configurationTypeMetadata: ").append(toIndentedString(configurationTypeMetadata)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathExtended: ").append(toIndentedString(pathExtended)).append("\n");
    sb.append("    pathExtendedMetadata: ").append(toIndentedString(pathExtendedMetadata)).append("\n");
    sb.append("    pathMetadata: ").append(toIndentedString(pathMetadata)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    rowMetadata: ").append(toIndentedString(rowMetadata)).append("\n");
    sb.append("    writeBack: ").append(toIndentedString(writeBack)).append("\n");
    sb.append("    writeBackMetadata: ").append(toIndentedString(writeBackMetadata)).append("\n");
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

