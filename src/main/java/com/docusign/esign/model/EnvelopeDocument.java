package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.Page;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SignatureType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeDocument
 */

public class EnvelopeDocument {
  @JsonProperty("addedRecipientIds")
  private java.util.List<String> addedRecipientIds = null;

  @JsonProperty("attachmentTabId")
  private String attachmentTabId = null;

  @JsonProperty("authoritativeCopy")
  private String authoritativeCopy = null;

  @JsonProperty("authoritativeCopyMetadata")
  private PropertyMetadata authoritativeCopyMetadata = null;

  @JsonProperty("availableDocumentTypes")
  private java.util.List<SignatureType> availableDocumentTypes = null;

  @JsonProperty("containsPdfFormFields")
  private String containsPdfFormFields = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("displayMetadata")
  private PropertyMetadata displayMetadata = null;

  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdGuid")
  private String documentIdGuid = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("includeInDownload")
  private String includeInDownload = null;

  @JsonProperty("includeInDownloadMetadata")
  private PropertyMetadata includeInDownloadMetadata = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("pages")
  private java.util.List<Page> pages = null;

  @JsonProperty("signerMustAcknowledge")
  private String signerMustAcknowledge = null;

  @JsonProperty("signerMustAcknowledgeMetadata")
  private PropertyMetadata signerMustAcknowledgeMetadata = null;

  @JsonProperty("sizeBytes")
  private String sizeBytes = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  public EnvelopeDocument addedRecipientIds(java.util.List<String> addedRecipientIds) {
    this.addedRecipientIds = addedRecipientIds;
    return this;
  }

  public EnvelopeDocument addAddedRecipientIdsItem(String addedRecipientIdsItem) {
    if (this.addedRecipientIds == null) {
      this.addedRecipientIds = new java.util.ArrayList<String>();
    }
    this.addedRecipientIds.add(addedRecipientIdsItem);
    return this;
  }

   /**
   * 
   * @return addedRecipientIds
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getAddedRecipientIds() {
    return addedRecipientIds;
  }

  public void setAddedRecipientIds(java.util.List<String> addedRecipientIds) {
    this.addedRecipientIds = addedRecipientIds;
  }

  public EnvelopeDocument attachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
    return this;
  }

   /**
   * 
   * @return attachmentTabId
  **/
  @ApiModelProperty(value = "")
  public String getAttachmentTabId() {
    return attachmentTabId;
  }

  public void setAttachmentTabId(String attachmentTabId) {
    this.attachmentTabId = attachmentTabId;
  }

  public EnvelopeDocument authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

   /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
   * @return authoritativeCopy
  **/
  @ApiModelProperty(value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }

  public EnvelopeDocument authoritativeCopyMetadata(PropertyMetadata authoritativeCopyMetadata) {
    this.authoritativeCopyMetadata = authoritativeCopyMetadata;
    return this;
  }

   /**
   * Get authoritativeCopyMetadata
   * @return authoritativeCopyMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAuthoritativeCopyMetadata() {
    return authoritativeCopyMetadata;
  }

  public void setAuthoritativeCopyMetadata(PropertyMetadata authoritativeCopyMetadata) {
    this.authoritativeCopyMetadata = authoritativeCopyMetadata;
  }

  public EnvelopeDocument availableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
    return this;
  }

  public EnvelopeDocument addAvailableDocumentTypesItem(SignatureType availableDocumentTypesItem) {
    if (this.availableDocumentTypes == null) {
      this.availableDocumentTypes = new java.util.ArrayList<SignatureType>();
    }
    this.availableDocumentTypes.add(availableDocumentTypesItem);
    return this;
  }

   /**
   * 
   * @return availableDocumentTypes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SignatureType> getAvailableDocumentTypes() {
    return availableDocumentTypes;
  }

  public void setAvailableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
    this.availableDocumentTypes = availableDocumentTypes;
  }

  public EnvelopeDocument containsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
    return this;
  }

   /**
   * 
   * @return containsPdfFormFields
  **/
  @ApiModelProperty(value = "")
  public String getContainsPdfFormFields() {
    return containsPdfFormFields;
  }

  public void setContainsPdfFormFields(String containsPdfFormFields) {
    this.containsPdfFormFields = containsPdfFormFields;
  }

  public EnvelopeDocument display(String display) {
    this.display = display;
    return this;
  }

   /**
   * 
   * @return display
  **/
  @ApiModelProperty(value = "")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public EnvelopeDocument displayMetadata(PropertyMetadata displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

   /**
   * Get displayMetadata
   * @return displayMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getDisplayMetadata() {
    return displayMetadata;
  }

  public void setDisplayMetadata(PropertyMetadata displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  public EnvelopeDocument documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }

  public EnvelopeDocument addDocumentFieldsItem(NameValue documentFieldsItem) {
    if (this.documentFields == null) {
      this.documentFields = new java.util.ArrayList<NameValue>();
    }
    this.documentFields.add(documentFieldsItem);
    return this;
  }

   /**
   * 
   * @return documentFields
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }

  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }

  public EnvelopeDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public EnvelopeDocument documentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
    return this;
  }

   /**
   * 
   * @return documentIdGuid
  **/
  @ApiModelProperty(value = "")
  public String getDocumentIdGuid() {
    return documentIdGuid;
  }

  public void setDocumentIdGuid(String documentIdGuid) {
    this.documentIdGuid = documentIdGuid;
  }

  public EnvelopeDocument errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public EnvelopeDocument includeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
    return this;
  }

   /**
   * 
   * @return includeInDownload
  **/
  @ApiModelProperty(value = "")
  public String getIncludeInDownload() {
    return includeInDownload;
  }

  public void setIncludeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
  }

  public EnvelopeDocument includeInDownloadMetadata(PropertyMetadata includeInDownloadMetadata) {
    this.includeInDownloadMetadata = includeInDownloadMetadata;
    return this;
  }

   /**
   * Get includeInDownloadMetadata
   * @return includeInDownloadMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getIncludeInDownloadMetadata() {
    return includeInDownloadMetadata;
  }

  public void setIncludeInDownloadMetadata(PropertyMetadata includeInDownloadMetadata) {
    this.includeInDownloadMetadata = includeInDownloadMetadata;
  }

  public EnvelopeDocument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvelopeDocument nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

   /**
   * Get nameMetadata
   * @return nameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  public EnvelopeDocument order(String order) {
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @ApiModelProperty(value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public EnvelopeDocument pages(java.util.List<Page> pages) {
    this.pages = pages;
    return this;
  }

  public EnvelopeDocument addPagesItem(Page pagesItem) {
    if (this.pages == null) {
      this.pages = new java.util.ArrayList<Page>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * 
   * @return pages
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Page> getPages() {
    return pages;
  }

  public void setPages(java.util.List<Page> pages) {
    this.pages = pages;
  }

  public EnvelopeDocument signerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
    return this;
  }

   /**
   * 
   * @return signerMustAcknowledge
  **/
  @ApiModelProperty(value = "")
  public String getSignerMustAcknowledge() {
    return signerMustAcknowledge;
  }

  public void setSignerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
  }

  public EnvelopeDocument signerMustAcknowledgeMetadata(PropertyMetadata signerMustAcknowledgeMetadata) {
    this.signerMustAcknowledgeMetadata = signerMustAcknowledgeMetadata;
    return this;
  }

   /**
   * Get signerMustAcknowledgeMetadata
   * @return signerMustAcknowledgeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignerMustAcknowledgeMetadata() {
    return signerMustAcknowledgeMetadata;
  }

  public void setSignerMustAcknowledgeMetadata(PropertyMetadata signerMustAcknowledgeMetadata) {
    this.signerMustAcknowledgeMetadata = signerMustAcknowledgeMetadata;
  }

  public EnvelopeDocument sizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * 
   * @return sizeBytes
  **/
  @ApiModelProperty(value = "")
  public String getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public EnvelopeDocument templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public EnvelopeDocument templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public EnvelopeDocument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EnvelopeDocument uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeDocument envelopeDocument = (EnvelopeDocument) o;
    return Objects.equals(this.addedRecipientIds, envelopeDocument.addedRecipientIds) &&
        Objects.equals(this.attachmentTabId, envelopeDocument.attachmentTabId) &&
        Objects.equals(this.authoritativeCopy, envelopeDocument.authoritativeCopy) &&
        Objects.equals(this.authoritativeCopyMetadata, envelopeDocument.authoritativeCopyMetadata) &&
        Objects.equals(this.availableDocumentTypes, envelopeDocument.availableDocumentTypes) &&
        Objects.equals(this.containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
        Objects.equals(this.display, envelopeDocument.display) &&
        Objects.equals(this.displayMetadata, envelopeDocument.displayMetadata) &&
        Objects.equals(this.documentFields, envelopeDocument.documentFields) &&
        Objects.equals(this.documentId, envelopeDocument.documentId) &&
        Objects.equals(this.documentIdGuid, envelopeDocument.documentIdGuid) &&
        Objects.equals(this.errorDetails, envelopeDocument.errorDetails) &&
        Objects.equals(this.includeInDownload, envelopeDocument.includeInDownload) &&
        Objects.equals(this.includeInDownloadMetadata, envelopeDocument.includeInDownloadMetadata) &&
        Objects.equals(this.name, envelopeDocument.name) &&
        Objects.equals(this.nameMetadata, envelopeDocument.nameMetadata) &&
        Objects.equals(this.order, envelopeDocument.order) &&
        Objects.equals(this.pages, envelopeDocument.pages) &&
        Objects.equals(this.signerMustAcknowledge, envelopeDocument.signerMustAcknowledge) &&
        Objects.equals(this.signerMustAcknowledgeMetadata, envelopeDocument.signerMustAcknowledgeMetadata) &&
        Objects.equals(this.sizeBytes, envelopeDocument.sizeBytes) &&
        Objects.equals(this.templateLocked, envelopeDocument.templateLocked) &&
        Objects.equals(this.templateRequired, envelopeDocument.templateRequired) &&
        Objects.equals(this.type, envelopeDocument.type) &&
        Objects.equals(this.uri, envelopeDocument.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedRecipientIds, attachmentTabId, authoritativeCopy, authoritativeCopyMetadata, availableDocumentTypes, containsPdfFormFields, display, displayMetadata, documentFields, documentId, documentIdGuid, errorDetails, includeInDownload, includeInDownloadMetadata, name, nameMetadata, order, pages, signerMustAcknowledge, signerMustAcknowledgeMetadata, sizeBytes, templateLocked, templateRequired, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDocument {\n");
    
    sb.append("    addedRecipientIds: ").append(toIndentedString(addedRecipientIds)).append("\n");
    sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    authoritativeCopyMetadata: ").append(toIndentedString(authoritativeCopyMetadata)).append("\n");
    sb.append("    availableDocumentTypes: ").append(toIndentedString(availableDocumentTypes)).append("\n");
    sb.append("    containsPdfFormFields: ").append(toIndentedString(containsPdfFormFields)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    displayMetadata: ").append(toIndentedString(displayMetadata)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdGuid: ").append(toIndentedString(documentIdGuid)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    sb.append("    includeInDownloadMetadata: ").append(toIndentedString(includeInDownloadMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
    sb.append("    signerMustAcknowledgeMetadata: ").append(toIndentedString(signerMustAcknowledgeMetadata)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

