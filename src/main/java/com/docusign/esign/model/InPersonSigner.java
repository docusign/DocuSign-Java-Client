package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FeatureAvailableMetadata;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.NotaryHost;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientIdentityVerification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.RecipientSignatureInformation;
import com.docusign.esign.model.RecipientSignatureProvider;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InPersonSigner
 */

public class InPersonSigner {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeMetadata")
  private PropertyMetadata accessCodeMetadata = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("allowSystemOverrideForLockedRecipient")
  private String allowSystemOverrideForLockedRecipient = null;

  @JsonProperty("autoNavigation")
  private String autoNavigation = null;

  @JsonProperty("canSignOffline")
  private String canSignOffline = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("completedCount")
  private String completedCount = null;

  @JsonProperty("creationReason")
  private String creationReason = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = null;

  @JsonProperty("declinedDateTime")
  private String declinedDateTime = null;

  @JsonProperty("declinedReason")
  private String declinedReason = null;

  @JsonProperty("defaultRecipient")
  private String defaultRecipient = null;

  @JsonProperty("deliveredDateTime")
  private String deliveredDateTime = null;

  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  @JsonProperty("deliveryMethodMetadata")
  private PropertyMetadata deliveryMethodMetadata = null;

  @JsonProperty("designatorId")
  private String designatorId = null;

  @JsonProperty("designatorIdGuid")
  private String designatorIdGuid = null;

  @JsonProperty("documentVisibility")
  private java.util.List<DocumentVisibility> documentVisibility = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailMetadata")
  private PropertyMetadata emailMetadata = null;

  @JsonProperty("emailNotification")
  private RecipientEmailNotification emailNotification = null;

  @JsonProperty("embeddedRecipientStartURL")
  private String embeddedRecipientStartURL = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("excludedDocuments")
  private java.util.List<String> excludedDocuments = null;

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  @JsonProperty("faxNumberMetadata")
  private PropertyMetadata faxNumberMetadata = null;

  @JsonProperty("hostEmail")
  private String hostEmail = null;

  @JsonProperty("hostEmailMetadata")
  private PropertyMetadata hostEmailMetadata = null;

  @JsonProperty("hostName")
  private String hostName = null;

  @JsonProperty("hostNameMetadata")
  private PropertyMetadata hostNameMetadata = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckConfigurationNameMetadata")
  private PropertyMetadata idCheckConfigurationNameMetadata = null;

  @JsonProperty("idCheckInformationInput")
  private IdCheckInformationInput idCheckInformationInput = null;

  @JsonProperty("identityVerification")
  private RecipientIdentityVerification identityVerification = null;

  @JsonProperty("inheritEmailNotificationConfiguration")
  private String inheritEmailNotificationConfiguration = null;

  @JsonProperty("inPersonSigningType")
  private String inPersonSigningType = null;

  @JsonProperty("inPersonSigningTypeMetadata")
  private PropertyMetadata inPersonSigningTypeMetadata = null;

  @JsonProperty("lockedRecipientPhoneAuthEditable")
  private String lockedRecipientPhoneAuthEditable = null;

  @JsonProperty("lockedRecipientSmsEditable")
  private String lockedRecipientSmsEditable = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("notaryHost")
  private NotaryHost notaryHost = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("noteMetadata")
  private PropertyMetadata noteMetadata = null;

  @JsonProperty("offlineAttributes")
  private OfflineAttributes offlineAttributes = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("recipientAttachments")
  private java.util.List<RecipientAttachment> recipientAttachments = null;

  @JsonProperty("recipientAuthenticationStatus")
  private AuthenticationStatus recipientAuthenticationStatus = null;

  @JsonProperty("recipientFeatureMetadata")
  private java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientSignatureProviders")
  private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = null;

  @JsonProperty("recipientSuppliesTabs")
  private String recipientSuppliesTabs = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("recipientTypeMetadata")
  private PropertyMetadata recipientTypeMetadata = null;

  @JsonProperty("requireIdLookup")
  private String requireIdLookup = null;

  @JsonProperty("requireIdLookupMetadata")
  private PropertyMetadata requireIdLookupMetadata = null;

  @JsonProperty("requireSignerCertificate")
  private String requireSignerCertificate = null;

  @JsonProperty("requireSignOnPaper")
  private String requireSignOnPaper = null;

  @JsonProperty("requireUploadSignature")
  private String requireUploadSignature = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("routingOrderMetadata")
  private PropertyMetadata routingOrderMetadata = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("signatureInfo")
  private RecipientSignatureInformation signatureInfo = null;

  @JsonProperty("signedDateTime")
  private String signedDateTime = null;

  @JsonProperty("signerEmail")
  private String signerEmail = null;

  @JsonProperty("signerEmailMetadata")
  private PropertyMetadata signerEmailMetadata = null;

  @JsonProperty("signerFirstName")
  private String signerFirstName = null;

  @JsonProperty("signerFirstNameMetadata")
  private PropertyMetadata signerFirstNameMetadata = null;

  @JsonProperty("signerLastName")
  private String signerLastName = null;

  @JsonProperty("signerLastNameMetadata")
  private PropertyMetadata signerLastNameMetadata = null;

  @JsonProperty("signerName")
  private String signerName = null;

  @JsonProperty("signerNameMetadata")
  private PropertyMetadata signerNameMetadata = null;

  @JsonProperty("signInEachLocation")
  private String signInEachLocation = null;

  @JsonProperty("signInEachLocationMetadata")
  private PropertyMetadata signInEachLocationMetadata = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("signingGroupIdMetadata")
  private PropertyMetadata signingGroupIdMetadata = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  @JsonProperty("signingGroupUsers")
  private java.util.List<UserInfo> signingGroupUsers = null;

  @JsonProperty("smsAuthentication")
  private RecipientSMSAuthentication smsAuthentication = null;

  @JsonProperty("socialAuthentications")
  private java.util.List<SocialAuthentication> socialAuthentications = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("suppressEmails")
  private String suppressEmails = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("totalTabCount")
  private String totalTabCount = null;

  @JsonProperty("userId")
  private String userId = null;

  public InPersonSigner accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.
   * @return accessCode
  **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public InPersonSigner accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
    return this;
  }

   /**
   * Get accessCodeMetadata
   * @return accessCodeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getAccessCodeMetadata() {
    return accessCodeMetadata;
  }

  public void setAccessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
  }

  public InPersonSigner addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

   /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
   * @return addAccessCodeToEmail
  **/
  @ApiModelProperty(value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }

  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }

  public InPersonSigner allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
    return this;
  }

   /**
   * 
   * @return allowSystemOverrideForLockedRecipient
  **/
  @ApiModelProperty(value = "")
  public String getAllowSystemOverrideForLockedRecipient() {
    return allowSystemOverrideForLockedRecipient;
  }

  public void setAllowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
  }

  public InPersonSigner autoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
    return this;
  }

   /**
   * 
   * @return autoNavigation
  **/
  @ApiModelProperty(value = "")
  public String getAutoNavigation() {
    return autoNavigation;
  }

  public void setAutoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
  }

  public InPersonSigner canSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
    return this;
  }

   /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline.
   * @return canSignOffline
  **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
  public String getCanSignOffline() {
    return canSignOffline;
  }

  public void setCanSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
  }

  public InPersonSigner clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. 
   * @return clientUserId
  **/
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public InPersonSigner completedCount(String completedCount) {
    this.completedCount = completedCount;
    return this;
  }

   /**
   * 
   * @return completedCount
  **/
  @ApiModelProperty(value = "")
  public String getCompletedCount() {
    return completedCount;
  }

  public void setCompletedCount(String completedCount) {
    this.completedCount = completedCount;
  }

  public InPersonSigner creationReason(String creationReason) {
    this.creationReason = creationReason;
    return this;
  }

   /**
   * 
   * @return creationReason
  **/
  @ApiModelProperty(value = "")
  public String getCreationReason() {
    return creationReason;
  }

  public void setCreationReason(String creationReason) {
    this.creationReason = creationReason;
  }

  public InPersonSigner customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InPersonSigner addCustomFieldsItem(String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<String>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   * @return customFields
  **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  public InPersonSigner declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

   /**
   * The date and time the recipient declined the document.
   * @return declinedDateTime
  **/
  @ApiModelProperty(value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }

  public InPersonSigner declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

   /**
   * The reason the recipient declined the document.
   * @return declinedReason
  **/
  @ApiModelProperty(value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  public InPersonSigner defaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }

   /**
   * 
   * @return defaultRecipient
  **/
  @ApiModelProperty(value = "")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }

  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }

  public InPersonSigner deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveredDateTime
  **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  public InPersonSigner deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public InPersonSigner deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
    return this;
  }

   /**
   * Get deliveryMethodMetadata
   * @return deliveryMethodMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getDeliveryMethodMetadata() {
    return deliveryMethodMetadata;
  }

  public void setDeliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
  }

  public InPersonSigner designatorId(String designatorId) {
    this.designatorId = designatorId;
    return this;
  }

   /**
   * 
   * @return designatorId
  **/
  @ApiModelProperty(value = "")
  public String getDesignatorId() {
    return designatorId;
  }

  public void setDesignatorId(String designatorId) {
    this.designatorId = designatorId;
  }

  public InPersonSigner designatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
    return this;
  }

   /**
   * 
   * @return designatorIdGuid
  **/
  @ApiModelProperty(value = "")
  public String getDesignatorIdGuid() {
    return designatorIdGuid;
  }

  public void setDesignatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
  }

  public InPersonSigner documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

  public InPersonSigner addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
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

  public InPersonSigner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InPersonSigner emailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
    return this;
  }

   /**
   * Get emailMetadata
   * @return emailMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getEmailMetadata() {
    return emailMetadata;
  }

  public void setEmailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
  }

  public InPersonSigner emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

   /**
   * Get emailNotification
   * @return emailNotification
  **/
  @ApiModelProperty(value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  public InPersonSigner embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

   /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` 
   * @return embeddedRecipientStartURL
  **/
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  public InPersonSigner errorDetails(ErrorDetails errorDetails) {
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

  public InPersonSigner excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }

  public InPersonSigner addExcludedDocumentsItem(String excludedDocumentsItem) {
    if (this.excludedDocuments == null) {
      this.excludedDocuments = new java.util.ArrayList<String>();
    }
    this.excludedDocuments.add(excludedDocumentsItem);
    return this;
  }

   /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.
   * @return excludedDocuments
  **/
  @ApiModelProperty(value = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
  public java.util.List<String> getExcludedDocuments() {
    return excludedDocuments;
  }

  public void setExcludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
  }

  public InPersonSigner faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Reserved:
   * @return faxNumber
  **/
  @ApiModelProperty(value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public InPersonSigner faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
    return this;
  }

   /**
   * Get faxNumberMetadata
   * @return faxNumberMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getFaxNumberMetadata() {
    return faxNumberMetadata;
  }

  public void setFaxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
  }

  public InPersonSigner hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }

   /**
   * 
   * @return hostEmail
  **/
  @ApiModelProperty(value = "")
  public String getHostEmail() {
    return hostEmail;
  }

  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }

  public InPersonSigner hostEmailMetadata(PropertyMetadata hostEmailMetadata) {
    this.hostEmailMetadata = hostEmailMetadata;
    return this;
  }

   /**
   * Get hostEmailMetadata
   * @return hostEmailMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getHostEmailMetadata() {
    return hostEmailMetadata;
  }

  public void setHostEmailMetadata(PropertyMetadata hostEmailMetadata) {
    this.hostEmailMetadata = hostEmailMetadata;
  }

  public InPersonSigner hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Specifies the name of the signing host. It is a required element for In Person Signers recipient Type.  Maximum Length: 100 characters.
   * @return hostName
  **/
  @ApiModelProperty(value = "Specifies the name of the signing host. It is a required element for In Person Signers recipient Type.  Maximum Length: 100 characters.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public InPersonSigner hostNameMetadata(PropertyMetadata hostNameMetadata) {
    this.hostNameMetadata = hostNameMetadata;
    return this;
  }

   /**
   * Get hostNameMetadata
   * @return hostNameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getHostNameMetadata() {
    return hostNameMetadata;
  }

  public void setHostNameMetadata(PropertyMetadata hostNameMetadata) {
    this.hostNameMetadata = hostNameMetadata;
  }

  public InPersonSigner idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

   /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   * @return idCheckConfigurationName
  **/
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  public InPersonSigner idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
    return this;
  }

   /**
   * Get idCheckConfigurationNameMetadata
   * @return idCheckConfigurationNameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getIdCheckConfigurationNameMetadata() {
    return idCheckConfigurationNameMetadata;
  }

  public void setIdCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
  }

  public InPersonSigner idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

   /**
   * Get idCheckInformationInput
   * @return idCheckInformationInput
  **/
  @ApiModelProperty(value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  public InPersonSigner identityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

   /**
   * Get identityVerification
   * @return identityVerification
  **/
  @ApiModelProperty(value = "")
  public RecipientIdentityVerification getIdentityVerification() {
    return identityVerification;
  }

  public void setIdentityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
  }

  public InPersonSigner inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

   /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. 
   * @return inheritEmailNotificationConfiguration
  **/
  @ApiModelProperty(value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }

  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }

  public InPersonSigner inPersonSigningType(String inPersonSigningType) {
    this.inPersonSigningType = inPersonSigningType;
    return this;
  }

   /**
   * 
   * @return inPersonSigningType
  **/
  @ApiModelProperty(value = "")
  public String getInPersonSigningType() {
    return inPersonSigningType;
  }

  public void setInPersonSigningType(String inPersonSigningType) {
    this.inPersonSigningType = inPersonSigningType;
  }

  public InPersonSigner inPersonSigningTypeMetadata(PropertyMetadata inPersonSigningTypeMetadata) {
    this.inPersonSigningTypeMetadata = inPersonSigningTypeMetadata;
    return this;
  }

   /**
   * Get inPersonSigningTypeMetadata
   * @return inPersonSigningTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getInPersonSigningTypeMetadata() {
    return inPersonSigningTypeMetadata;
  }

  public void setInPersonSigningTypeMetadata(PropertyMetadata inPersonSigningTypeMetadata) {
    this.inPersonSigningTypeMetadata = inPersonSigningTypeMetadata;
  }

  public InPersonSigner lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
    return this;
  }

   /**
   * 
   * @return lockedRecipientPhoneAuthEditable
  **/
  @ApiModelProperty(value = "")
  public String getLockedRecipientPhoneAuthEditable() {
    return lockedRecipientPhoneAuthEditable;
  }

  public void setLockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
  }

  public InPersonSigner lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
    return this;
  }

   /**
   * 
   * @return lockedRecipientSmsEditable
  **/
  @ApiModelProperty(value = "")
  public String getLockedRecipientSmsEditable() {
    return lockedRecipientSmsEditable;
  }

  public void setLockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
  }

  public InPersonSigner name(String name) {
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

  public InPersonSigner nameMetadata(PropertyMetadata nameMetadata) {
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

  public InPersonSigner notaryHost(NotaryHost notaryHost) {
    this.notaryHost = notaryHost;
    return this;
  }

   /**
   * Get notaryHost
   * @return notaryHost
  **/
  @ApiModelProperty(value = "")
  public NotaryHost getNotaryHost() {
    return notaryHost;
  }

  public void setNotaryHost(NotaryHost notaryHost) {
    this.notaryHost = notaryHost;
  }

  public InPersonSigner note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.
   * @return note
  **/
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public InPersonSigner noteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
    return this;
  }

   /**
   * Get noteMetadata
   * @return noteMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getNoteMetadata() {
    return noteMetadata;
  }

  public void setNoteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
  }

  public InPersonSigner offlineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
    return this;
  }

   /**
   * Get offlineAttributes
   * @return offlineAttributes
  **/
  @ApiModelProperty(value = "")
  public OfflineAttributes getOfflineAttributes() {
    return offlineAttributes;
  }

  public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
  }

  public InPersonSigner phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

   /**
   * Get phoneAuthentication
   * @return phoneAuthentication
  **/
  @ApiModelProperty(value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  public InPersonSigner recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }

  public InPersonSigner addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    if (this.recipientAttachments == null) {
      this.recipientAttachments = new java.util.ArrayList<RecipientAttachment>();
    }
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

   /**
   * Reserved:
   * @return recipientAttachments
  **/
  @ApiModelProperty(value = "Reserved:")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }

  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  public InPersonSigner recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

   /**
   * Get recipientAuthenticationStatus
   * @return recipientAuthenticationStatus
  **/
  @ApiModelProperty(value = "")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }

  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  public InPersonSigner recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }

  public InPersonSigner addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
    if (this.recipientFeatureMetadata == null) {
      this.recipientFeatureMetadata = new java.util.ArrayList<FeatureAvailableMetadata>();
    }
    this.recipientFeatureMetadata.add(recipientFeatureMetadataItem);
    return this;
  }

   /**
   * 
   * @return recipientFeatureMetadata
  **/
  @ApiModelProperty(value = "")
  public java.util.List<FeatureAvailableMetadata> getRecipientFeatureMetadata() {
    return recipientFeatureMetadata;
  }

  public void setRecipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
  }

  public InPersonSigner recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public InPersonSigner recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

   /**
   * 
   * @return recipientIdGuid
  **/
  @ApiModelProperty(value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  public InPersonSigner recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }

  public InPersonSigner addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
    if (this.recipientSignatureProviders == null) {
      this.recipientSignatureProviders = new java.util.ArrayList<RecipientSignatureProvider>();
    }
    this.recipientSignatureProviders.add(recipientSignatureProvidersItem);
    return this;
  }

   /**
   * 
   * @return recipientSignatureProviders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
    return recipientSignatureProviders;
  }

  public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
  }

  public InPersonSigner recipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
    return this;
  }

   /**
   * 
   * @return recipientSuppliesTabs
  **/
  @ApiModelProperty(value = "")
  public String getRecipientSuppliesTabs() {
    return recipientSuppliesTabs;
  }

  public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
  }

  public InPersonSigner recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * 
   * @return recipientType
  **/
  @ApiModelProperty(value = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public InPersonSigner recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
    return this;
  }

   /**
   * Get recipientTypeMetadata
   * @return recipientTypeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRecipientTypeMetadata() {
    return recipientTypeMetadata;
  }

  public void setRecipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
  }

  public InPersonSigner requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

   /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. 
   * @return requireIdLookup
  **/
  @ApiModelProperty(value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }

  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  public InPersonSigner requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
    return this;
  }

   /**
   * Get requireIdLookupMetadata
   * @return requireIdLookupMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRequireIdLookupMetadata() {
    return requireIdLookupMetadata;
  }

  public void setRequireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
  }

  public InPersonSigner requireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
    return this;
  }

   /**
   * 
   * @return requireSignerCertificate
  **/
  @ApiModelProperty(value = "")
  public String getRequireSignerCertificate() {
    return requireSignerCertificate;
  }

  public void setRequireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
  }

  public InPersonSigner requireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
    return this;
  }

   /**
   * 
   * @return requireSignOnPaper
  **/
  @ApiModelProperty(value = "")
  public String getRequireSignOnPaper() {
    return requireSignOnPaper;
  }

  public void setRequireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
  }

  public InPersonSigner requireUploadSignature(String requireUploadSignature) {
    this.requireUploadSignature = requireUploadSignature;
    return this;
  }

   /**
   * 
   * @return requireUploadSignature
  **/
  @ApiModelProperty(value = "")
  public String getRequireUploadSignature() {
    return requireUploadSignature;
  }

  public void setRequireUploadSignature(String requireUploadSignature) {
    this.requireUploadSignature = requireUploadSignature;
  }

  public InPersonSigner roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   * @return roleName
  **/
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public InPersonSigner routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

   /**
   * Specifies the routing order of the recipient in the envelope. 
   * @return routingOrder
  **/
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  public InPersonSigner routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
    return this;
  }

   /**
   * Get routingOrderMetadata
   * @return routingOrderMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getRoutingOrderMetadata() {
    return routingOrderMetadata;
  }

  public void setRoutingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
  }

  public InPersonSigner sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public InPersonSigner signatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }

   /**
   * Get signatureInfo
   * @return signatureInfo
  **/
  @ApiModelProperty(value = "")
  public RecipientSignatureInformation getSignatureInfo() {
    return signatureInfo;
  }

  public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
  }

  public InPersonSigner signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only. 
   * @return signedDateTime
  **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only. ")
  public String getSignedDateTime() {
    return signedDateTime;
  }

  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  public InPersonSigner signerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
    return this;
  }

   /**
   * The email address for an InPersonSigner recipient Type.   Maximum Length: 100 characters. 
   * @return signerEmail
  **/
  @ApiModelProperty(value = "The email address for an InPersonSigner recipient Type.   Maximum Length: 100 characters. ")
  public String getSignerEmail() {
    return signerEmail;
  }

  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }

  public InPersonSigner signerEmailMetadata(PropertyMetadata signerEmailMetadata) {
    this.signerEmailMetadata = signerEmailMetadata;
    return this;
  }

   /**
   * Get signerEmailMetadata
   * @return signerEmailMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignerEmailMetadata() {
    return signerEmailMetadata;
  }

  public void setSignerEmailMetadata(PropertyMetadata signerEmailMetadata) {
    this.signerEmailMetadata = signerEmailMetadata;
  }

  public InPersonSigner signerFirstName(String signerFirstName) {
    this.signerFirstName = signerFirstName;
    return this;
  }

   /**
   * 
   * @return signerFirstName
  **/
  @ApiModelProperty(value = "")
  public String getSignerFirstName() {
    return signerFirstName;
  }

  public void setSignerFirstName(String signerFirstName) {
    this.signerFirstName = signerFirstName;
  }

  public InPersonSigner signerFirstNameMetadata(PropertyMetadata signerFirstNameMetadata) {
    this.signerFirstNameMetadata = signerFirstNameMetadata;
    return this;
  }

   /**
   * Get signerFirstNameMetadata
   * @return signerFirstNameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignerFirstNameMetadata() {
    return signerFirstNameMetadata;
  }

  public void setSignerFirstNameMetadata(PropertyMetadata signerFirstNameMetadata) {
    this.signerFirstNameMetadata = signerFirstNameMetadata;
  }

  public InPersonSigner signerLastName(String signerLastName) {
    this.signerLastName = signerLastName;
    return this;
  }

   /**
   * 
   * @return signerLastName
  **/
  @ApiModelProperty(value = "")
  public String getSignerLastName() {
    return signerLastName;
  }

  public void setSignerLastName(String signerLastName) {
    this.signerLastName = signerLastName;
  }

  public InPersonSigner signerLastNameMetadata(PropertyMetadata signerLastNameMetadata) {
    this.signerLastNameMetadata = signerLastNameMetadata;
    return this;
  }

   /**
   * Get signerLastNameMetadata
   * @return signerLastNameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignerLastNameMetadata() {
    return signerLastNameMetadata;
  }

  public void setSignerLastNameMetadata(PropertyMetadata signerLastNameMetadata) {
    this.signerLastNameMetadata = signerLastNameMetadata;
  }

  public InPersonSigner signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

   /**
   * Required. The full legal name of a signer for the envelope.   Maximum Length: 100 characters.   
   * @return signerName
  **/
  @ApiModelProperty(value = "Required. The full legal name of a signer for the envelope.   Maximum Length: 100 characters.   ")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }

  public InPersonSigner signerNameMetadata(PropertyMetadata signerNameMetadata) {
    this.signerNameMetadata = signerNameMetadata;
    return this;
  }

   /**
   * Get signerNameMetadata
   * @return signerNameMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignerNameMetadata() {
    return signerNameMetadata;
  }

  public void setSignerNameMetadata(PropertyMetadata signerNameMetadata) {
    this.signerNameMetadata = signerNameMetadata;
  }

  public InPersonSigner signInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
    return this;
  }

   /**
   * When set to **true**, specifies that the signer must sign in all locations.
   * @return signInEachLocation
  **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer must sign in all locations.")
  public String getSignInEachLocation() {
    return signInEachLocation;
  }

  public void setSignInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
  }

  public InPersonSigner signInEachLocationMetadata(PropertyMetadata signInEachLocationMetadata) {
    this.signInEachLocationMetadata = signInEachLocationMetadata;
    return this;
  }

   /**
   * Get signInEachLocationMetadata
   * @return signInEachLocationMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSignInEachLocationMetadata() {
    return signInEachLocationMetadata;
  }

  public void setSignInEachLocationMetadata(PropertyMetadata signInEachLocationMetadata) {
    this.signInEachLocationMetadata = signInEachLocationMetadata;
  }

  public InPersonSigner signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public InPersonSigner signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
    return this;
  }

   /**
   * Get signingGroupIdMetadata
   * @return signingGroupIdMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getSigningGroupIdMetadata() {
    return signingGroupIdMetadata;
  }

  public void setSigningGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
  }

  public InPersonSigner signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

   /**
   * The display name for the signing group.   Maximum Length: 100 characters. 
   * @return signingGroupName
  **/
  @ApiModelProperty(value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  public InPersonSigner signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }

  public InPersonSigner addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    if (this.signingGroupUsers == null) {
      this.signingGroupUsers = new java.util.ArrayList<UserInfo>();
    }
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

   /**
   * A complex type that contains information about users in the signing group.
   * @return signingGroupUsers
  **/
  @ApiModelProperty(value = "A complex type that contains information about users in the signing group.")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }

  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  public InPersonSigner smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

   /**
   * Get smsAuthentication
   * @return smsAuthentication
  **/
  @ApiModelProperty(value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  public InPersonSigner socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }

  public InPersonSigner addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    if (this.socialAuthentications == null) {
      this.socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
    }
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

   /**
   *  Lists the social ID type that can be used for recipient authentication.
   * @return socialAuthentications
  **/
  @ApiModelProperty(value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  public InPersonSigner status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InPersonSigner statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public InPersonSigner suppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
    return this;
  }

   /**
   * 
   * @return suppressEmails
  **/
  @ApiModelProperty(value = "")
  public String getSuppressEmails() {
    return suppressEmails;
  }

  public void setSuppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
  }

  public InPersonSigner tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

   /**
   * Get tabs
   * @return tabs
  **/
  @ApiModelProperty(value = "")
  public Tabs getTabs() {
    return tabs;
  }

  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  public InPersonSigner templateLocked(String templateLocked) {
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

  public InPersonSigner templateRequired(String templateRequired) {
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

  public InPersonSigner totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

   /**
   * 
   * @return totalTabCount
  **/
  @ApiModelProperty(value = "")
  public String getTotalTabCount() {
    return totalTabCount;
  }

  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  public InPersonSigner userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InPersonSigner inPersonSigner = (InPersonSigner) o;
    return Objects.equals(this.accessCode, inPersonSigner.accessCode) &&
        Objects.equals(this.accessCodeMetadata, inPersonSigner.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, inPersonSigner.addAccessCodeToEmail) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, inPersonSigner.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.autoNavigation, inPersonSigner.autoNavigation) &&
        Objects.equals(this.canSignOffline, inPersonSigner.canSignOffline) &&
        Objects.equals(this.clientUserId, inPersonSigner.clientUserId) &&
        Objects.equals(this.completedCount, inPersonSigner.completedCount) &&
        Objects.equals(this.creationReason, inPersonSigner.creationReason) &&
        Objects.equals(this.customFields, inPersonSigner.customFields) &&
        Objects.equals(this.declinedDateTime, inPersonSigner.declinedDateTime) &&
        Objects.equals(this.declinedReason, inPersonSigner.declinedReason) &&
        Objects.equals(this.defaultRecipient, inPersonSigner.defaultRecipient) &&
        Objects.equals(this.deliveredDateTime, inPersonSigner.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, inPersonSigner.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, inPersonSigner.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, inPersonSigner.designatorId) &&
        Objects.equals(this.designatorIdGuid, inPersonSigner.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, inPersonSigner.documentVisibility) &&
        Objects.equals(this.email, inPersonSigner.email) &&
        Objects.equals(this.emailMetadata, inPersonSigner.emailMetadata) &&
        Objects.equals(this.emailNotification, inPersonSigner.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, inPersonSigner.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, inPersonSigner.errorDetails) &&
        Objects.equals(this.excludedDocuments, inPersonSigner.excludedDocuments) &&
        Objects.equals(this.faxNumber, inPersonSigner.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, inPersonSigner.faxNumberMetadata) &&
        Objects.equals(this.hostEmail, inPersonSigner.hostEmail) &&
        Objects.equals(this.hostEmailMetadata, inPersonSigner.hostEmailMetadata) &&
        Objects.equals(this.hostName, inPersonSigner.hostName) &&
        Objects.equals(this.hostNameMetadata, inPersonSigner.hostNameMetadata) &&
        Objects.equals(this.idCheckConfigurationName, inPersonSigner.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, inPersonSigner.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, inPersonSigner.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, inPersonSigner.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, inPersonSigner.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.inPersonSigningType, inPersonSigner.inPersonSigningType) &&
        Objects.equals(this.inPersonSigningTypeMetadata, inPersonSigner.inPersonSigningTypeMetadata) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, inPersonSigner.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, inPersonSigner.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, inPersonSigner.name) &&
        Objects.equals(this.nameMetadata, inPersonSigner.nameMetadata) &&
        Objects.equals(this.notaryHost, inPersonSigner.notaryHost) &&
        Objects.equals(this.note, inPersonSigner.note) &&
        Objects.equals(this.noteMetadata, inPersonSigner.noteMetadata) &&
        Objects.equals(this.offlineAttributes, inPersonSigner.offlineAttributes) &&
        Objects.equals(this.phoneAuthentication, inPersonSigner.phoneAuthentication) &&
        Objects.equals(this.recipientAttachments, inPersonSigner.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, inPersonSigner.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, inPersonSigner.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, inPersonSigner.recipientId) &&
        Objects.equals(this.recipientIdGuid, inPersonSigner.recipientIdGuid) &&
        Objects.equals(this.recipientSignatureProviders, inPersonSigner.recipientSignatureProviders) &&
        Objects.equals(this.recipientSuppliesTabs, inPersonSigner.recipientSuppliesTabs) &&
        Objects.equals(this.recipientType, inPersonSigner.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, inPersonSigner.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, inPersonSigner.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, inPersonSigner.requireIdLookupMetadata) &&
        Objects.equals(this.requireSignerCertificate, inPersonSigner.requireSignerCertificate) &&
        Objects.equals(this.requireSignOnPaper, inPersonSigner.requireSignOnPaper) &&
        Objects.equals(this.requireUploadSignature, inPersonSigner.requireUploadSignature) &&
        Objects.equals(this.roleName, inPersonSigner.roleName) &&
        Objects.equals(this.routingOrder, inPersonSigner.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, inPersonSigner.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, inPersonSigner.sentDateTime) &&
        Objects.equals(this.signatureInfo, inPersonSigner.signatureInfo) &&
        Objects.equals(this.signedDateTime, inPersonSigner.signedDateTime) &&
        Objects.equals(this.signerEmail, inPersonSigner.signerEmail) &&
        Objects.equals(this.signerEmailMetadata, inPersonSigner.signerEmailMetadata) &&
        Objects.equals(this.signerFirstName, inPersonSigner.signerFirstName) &&
        Objects.equals(this.signerFirstNameMetadata, inPersonSigner.signerFirstNameMetadata) &&
        Objects.equals(this.signerLastName, inPersonSigner.signerLastName) &&
        Objects.equals(this.signerLastNameMetadata, inPersonSigner.signerLastNameMetadata) &&
        Objects.equals(this.signerName, inPersonSigner.signerName) &&
        Objects.equals(this.signerNameMetadata, inPersonSigner.signerNameMetadata) &&
        Objects.equals(this.signInEachLocation, inPersonSigner.signInEachLocation) &&
        Objects.equals(this.signInEachLocationMetadata, inPersonSigner.signInEachLocationMetadata) &&
        Objects.equals(this.signingGroupId, inPersonSigner.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, inPersonSigner.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, inPersonSigner.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, inPersonSigner.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, inPersonSigner.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, inPersonSigner.socialAuthentications) &&
        Objects.equals(this.status, inPersonSigner.status) &&
        Objects.equals(this.statusCode, inPersonSigner.statusCode) &&
        Objects.equals(this.suppressEmails, inPersonSigner.suppressEmails) &&
        Objects.equals(this.tabs, inPersonSigner.tabs) &&
        Objects.equals(this.templateLocked, inPersonSigner.templateLocked) &&
        Objects.equals(this.templateRequired, inPersonSigner.templateRequired) &&
        Objects.equals(this.totalTabCount, inPersonSigner.totalTabCount) &&
        Objects.equals(this.userId, inPersonSigner.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, allowSystemOverrideForLockedRecipient, autoNavigation, canSignOffline, clientUserId, completedCount, creationReason, customFields, declinedDateTime, declinedReason, defaultRecipient, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, faxNumberMetadata, hostEmail, hostEmailMetadata, hostName, hostNameMetadata, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, inPersonSigningType, inPersonSigningTypeMetadata, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, notaryHost, note, noteMetadata, offlineAttributes, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, requireSignerCertificate, requireSignOnPaper, requireUploadSignature, roleName, routingOrder, routingOrderMetadata, sentDateTime, signatureInfo, signedDateTime, signerEmail, signerEmailMetadata, signerFirstName, signerFirstNameMetadata, signerLastName, signerLastNameMetadata, signerName, signerNameMetadata, signInEachLocation, signInEachLocationMetadata, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, tabs, templateLocked, templateRequired, totalTabCount, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InPersonSigner {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeMetadata: ").append(toIndentedString(accessCodeMetadata)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    allowSystemOverrideForLockedRecipient: ").append(toIndentedString(allowSystemOverrideForLockedRecipient)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    creationReason: ").append(toIndentedString(creationReason)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryMethodMetadata: ").append(toIndentedString(deliveryMethodMetadata)).append("\n");
    sb.append("    designatorId: ").append(toIndentedString(designatorId)).append("\n");
    sb.append("    designatorIdGuid: ").append(toIndentedString(designatorIdGuid)).append("\n");
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailMetadata: ").append(toIndentedString(emailMetadata)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    excludedDocuments: ").append(toIndentedString(excludedDocuments)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    faxNumberMetadata: ").append(toIndentedString(faxNumberMetadata)).append("\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    hostEmailMetadata: ").append(toIndentedString(hostEmailMetadata)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostNameMetadata: ").append(toIndentedString(hostNameMetadata)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckConfigurationNameMetadata: ").append(toIndentedString(idCheckConfigurationNameMetadata)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    inPersonSigningType: ").append(toIndentedString(inPersonSigningType)).append("\n");
    sb.append("    inPersonSigningTypeMetadata: ").append(toIndentedString(inPersonSigningTypeMetadata)).append("\n");
    sb.append("    lockedRecipientPhoneAuthEditable: ").append(toIndentedString(lockedRecipientPhoneAuthEditable)).append("\n");
    sb.append("    lockedRecipientSmsEditable: ").append(toIndentedString(lockedRecipientSmsEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    notaryHost: ").append(toIndentedString(notaryHost)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteMetadata: ").append(toIndentedString(noteMetadata)).append("\n");
    sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    recipientFeatureMetadata: ").append(toIndentedString(recipientFeatureMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
    sb.append("    recipientSuppliesTabs: ").append(toIndentedString(recipientSuppliesTabs)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    recipientTypeMetadata: ").append(toIndentedString(recipientTypeMetadata)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    requireIdLookupMetadata: ").append(toIndentedString(requireIdLookupMetadata)).append("\n");
    sb.append("    requireSignerCertificate: ").append(toIndentedString(requireSignerCertificate)).append("\n");
    sb.append("    requireSignOnPaper: ").append(toIndentedString(requireSignOnPaper)).append("\n");
    sb.append("    requireUploadSignature: ").append(toIndentedString(requireUploadSignature)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    routingOrderMetadata: ").append(toIndentedString(routingOrderMetadata)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
    sb.append("    signerEmailMetadata: ").append(toIndentedString(signerEmailMetadata)).append("\n");
    sb.append("    signerFirstName: ").append(toIndentedString(signerFirstName)).append("\n");
    sb.append("    signerFirstNameMetadata: ").append(toIndentedString(signerFirstNameMetadata)).append("\n");
    sb.append("    signerLastName: ").append(toIndentedString(signerLastName)).append("\n");
    sb.append("    signerLastNameMetadata: ").append(toIndentedString(signerLastNameMetadata)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    signerNameMetadata: ").append(toIndentedString(signerNameMetadata)).append("\n");
    sb.append("    signInEachLocation: ").append(toIndentedString(signInEachLocation)).append("\n");
    sb.append("    signInEachLocationMetadata: ").append(toIndentedString(signInEachLocationMetadata)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupIdMetadata: ").append(toIndentedString(signingGroupIdMetadata)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    suppressEmails: ").append(toIndentedString(suppressEmails)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    totalTabCount: ").append(toIndentedString(totalTabCount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

