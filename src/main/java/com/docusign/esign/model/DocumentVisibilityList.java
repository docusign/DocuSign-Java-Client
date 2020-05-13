package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocumentVisibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentVisibilityList
 */

public class DocumentVisibilityList {
  @JsonProperty("documentVisibility")
  private java.util.List<DocumentVisibility> documentVisibility = null;

  public DocumentVisibilityList documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

  public DocumentVisibilityList addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    if (this.documentVisibility == null) {
      this.documentVisibility = new java.util.ArrayList<DocumentVisibility>();
    }
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

   /**
   * 
   * @return documentVisibility
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentVisibilityList documentVisibilityList = (DocumentVisibilityList) o;
    return Objects.equals(this.documentVisibility, documentVisibilityList.documentVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentVisibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVisibilityList {\n");
    
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
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

