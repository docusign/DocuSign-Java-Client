package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FeatureAvailableMetadata;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientIdentityVerification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientProofFile;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CertifiedDelivery
 */

public class CertifiedDelivery {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("accessCodeMetadata")
  private PropertyMetadata accessCodeMetadata = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("agentCanEditEmail")
  private String agentCanEditEmail = null;

  @JsonProperty("agentCanEditName")
  private String agentCanEditName = null;

  @JsonProperty("allowSystemOverrideForLockedRecipient")
  private String allowSystemOverrideForLockedRecipient = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("completedCount")
  private String completedCount = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = new java.util.ArrayList<String>();

  @JsonProperty("declinedDateTime")
  private String declinedDateTime = null;

  @JsonProperty("declinedReason")
  private String declinedReason = null;

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
  private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();

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
  private java.util.List<String> excludedDocuments = new java.util.ArrayList<String>();

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  @JsonProperty("faxNumberMetadata")
  private PropertyMetadata faxNumberMetadata = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("firstNameMetadata")
  private PropertyMetadata firstNameMetadata = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("fullNameMetadata")
  private PropertyMetadata fullNameMetadata = null;

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

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("lastNameMetadata")
  private PropertyMetadata lastNameMetadata = null;

  @JsonProperty("lockedRecipientPhoneAuthEditable")
  private String lockedRecipientPhoneAuthEditable = null;

  @JsonProperty("lockedRecipientSmsEditable")
  private String lockedRecipientSmsEditable = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("noteMetadata")
  private PropertyMetadata noteMetadata = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("proofFile")
  private RecipientProofFile proofFile = null;

  @JsonProperty("recipientAttachments")
  private java.util.List<RecipientAttachment> recipientAttachments = new java.util.ArrayList<RecipientAttachment>();

  @JsonProperty("recipientAuthenticationStatus")
  private AuthenticationStatus recipientAuthenticationStatus = null;

  @JsonProperty("recipientFeatureMetadata")
  private java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata = new java.util.ArrayList<FeatureAvailableMetadata>();

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("recipientTypeMetadata")
  private PropertyMetadata recipientTypeMetadata = null;

  @JsonProperty("requireIdLookup")
  private String requireIdLookup = null;

  @JsonProperty("requireIdLookupMetadata")
  private PropertyMetadata requireIdLookupMetadata = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("routingOrderMetadata")
  private PropertyMetadata routingOrderMetadata = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("signedDateTime")
  private String signedDateTime = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("signingGroupIdMetadata")
  private PropertyMetadata signingGroupIdMetadata = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  @JsonProperty("signingGroupUsers")
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();

  @JsonProperty("smsAuthentication")
  private RecipientSMSAuthentication smsAuthentication = null;

  @JsonProperty("socialAuthentications")
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("suppressEmails")
  private String suppressEmails = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("totalTabCount")
  private String totalTabCount = null;

  @JsonProperty("userId")
  private String userId = null;

  public CertifiedDelivery accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.
   * @return accessCode
  **/
  @ApiModelProperty(example = "null", value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public CertifiedDelivery accessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
    return this;
  }

   /**
   * Get accessCodeMetadata
   * @return accessCodeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getAccessCodeMetadata() {
    return accessCodeMetadata;
  }

  public void setAccessCodeMetadata(PropertyMetadata accessCodeMetadata) {
    this.accessCodeMetadata = accessCodeMetadata;
  }

  public CertifiedDelivery addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

   /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
   * @return addAccessCodeToEmail
  **/
  @ApiModelProperty(example = "null", value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }

  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }

  public CertifiedDelivery agentCanEditEmail(String agentCanEditEmail) {
    this.agentCanEditEmail = agentCanEditEmail;
    return this;
  }

   /**
   * 
   * @return agentCanEditEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgentCanEditEmail() {
    return agentCanEditEmail;
  }

  public void setAgentCanEditEmail(String agentCanEditEmail) {
    this.agentCanEditEmail = agentCanEditEmail;
  }

  public CertifiedDelivery agentCanEditName(String agentCanEditName) {
    this.agentCanEditName = agentCanEditName;
    return this;
  }

   /**
   * 
   * @return agentCanEditName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgentCanEditName() {
    return agentCanEditName;
  }

  public void setAgentCanEditName(String agentCanEditName) {
    this.agentCanEditName = agentCanEditName;
  }

  public CertifiedDelivery allowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
    return this;
  }

   /**
   * 
   * @return allowSystemOverrideForLockedRecipient
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllowSystemOverrideForLockedRecipient() {
    return allowSystemOverrideForLockedRecipient;
  }

  public void setAllowSystemOverrideForLockedRecipient(String allowSystemOverrideForLockedRecipient) {
    this.allowSystemOverrideForLockedRecipient = allowSystemOverrideForLockedRecipient;
  }

  public CertifiedDelivery clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. 
   * @return clientUserId
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public CertifiedDelivery completedCount(String completedCount) {
    this.completedCount = completedCount;
    return this;
  }

   /**
   * 
   * @return completedCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompletedCount() {
    return completedCount;
  }

  public void setCompletedCount(String completedCount) {
    this.completedCount = completedCount;
  }

  public CertifiedDelivery customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CertifiedDelivery addCustomFieldsItem(String customFieldsItem) {
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   * @return customFields
  **/
  @ApiModelProperty(example = "null", value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  public CertifiedDelivery declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

   /**
   * The date and time the recipient declined the document.
   * @return declinedDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }

  public CertifiedDelivery declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

   /**
   * The reason the recipient declined the document.
   * @return declinedReason
  **/
  @ApiModelProperty(example = "null", value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  public CertifiedDelivery deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveredDateTime
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  public CertifiedDelivery deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveryMethod
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public CertifiedDelivery deliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
    return this;
  }

   /**
   * Get deliveryMethodMetadata
   * @return deliveryMethodMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getDeliveryMethodMetadata() {
    return deliveryMethodMetadata;
  }

  public void setDeliveryMethodMetadata(PropertyMetadata deliveryMethodMetadata) {
    this.deliveryMethodMetadata = deliveryMethodMetadata;
  }

  public CertifiedDelivery designatorId(String designatorId) {
    this.designatorId = designatorId;
    return this;
  }

   /**
   * 
   * @return designatorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDesignatorId() {
    return designatorId;
  }

  public void setDesignatorId(String designatorId) {
    this.designatorId = designatorId;
  }

  public CertifiedDelivery designatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
    return this;
  }

   /**
   * 
   * @return designatorIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDesignatorIdGuid() {
    return designatorIdGuid;
  }

  public void setDesignatorIdGuid(String designatorIdGuid) {
    this.designatorIdGuid = designatorIdGuid;
  }

  public CertifiedDelivery documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

  public CertifiedDelivery addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

   /**
   * 
   * @return documentVisibility
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }

  public CertifiedDelivery email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CertifiedDelivery emailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
    return this;
  }

   /**
   * Get emailMetadata
   * @return emailMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getEmailMetadata() {
    return emailMetadata;
  }

  public void setEmailMetadata(PropertyMetadata emailMetadata) {
    this.emailMetadata = emailMetadata;
  }

  public CertifiedDelivery emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

   /**
   * Get emailNotification
   * @return emailNotification
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  public CertifiedDelivery embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

   /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` 
   * @return embeddedRecipientStartURL
  **/
  @ApiModelProperty(example = "null", value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  public CertifiedDelivery errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public CertifiedDelivery excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }

  public CertifiedDelivery addExcludedDocumentsItem(String excludedDocumentsItem) {
    this.excludedDocuments.add(excludedDocumentsItem);
    return this;
  }

   /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.
   * @return excludedDocuments
  **/
  @ApiModelProperty(example = "null", value = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
  public java.util.List<String> getExcludedDocuments() {
    return excludedDocuments;
  }

  public void setExcludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
  }

  public CertifiedDelivery faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Reserved:
   * @return faxNumber
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public CertifiedDelivery faxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
    return this;
  }

   /**
   * Get faxNumberMetadata
   * @return faxNumberMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFaxNumberMetadata() {
    return faxNumberMetadata;
  }

  public void setFaxNumberMetadata(PropertyMetadata faxNumberMetadata) {
    this.faxNumberMetadata = faxNumberMetadata;
  }

  public CertifiedDelivery firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user's first name.  Maximum Length: 50 characters.
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CertifiedDelivery firstNameMetadata(PropertyMetadata firstNameMetadata) {
    this.firstNameMetadata = firstNameMetadata;
    return this;
  }

   /**
   * Get firstNameMetadata
   * @return firstNameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFirstNameMetadata() {
    return firstNameMetadata;
  }

  public void setFirstNameMetadata(PropertyMetadata firstNameMetadata) {
    this.firstNameMetadata = firstNameMetadata;
  }

  public CertifiedDelivery fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * 
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CertifiedDelivery fullNameMetadata(PropertyMetadata fullNameMetadata) {
    this.fullNameMetadata = fullNameMetadata;
    return this;
  }

   /**
   * Get fullNameMetadata
   * @return fullNameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getFullNameMetadata() {
    return fullNameMetadata;
  }

  public void setFullNameMetadata(PropertyMetadata fullNameMetadata) {
    this.fullNameMetadata = fullNameMetadata;
  }

  public CertifiedDelivery idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

   /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   * @return idCheckConfigurationName
  **/
  @ApiModelProperty(example = "null", value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  public CertifiedDelivery idCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
    return this;
  }

   /**
   * Get idCheckConfigurationNameMetadata
   * @return idCheckConfigurationNameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getIdCheckConfigurationNameMetadata() {
    return idCheckConfigurationNameMetadata;
  }

  public void setIdCheckConfigurationNameMetadata(PropertyMetadata idCheckConfigurationNameMetadata) {
    this.idCheckConfigurationNameMetadata = idCheckConfigurationNameMetadata;
  }

  public CertifiedDelivery idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

   /**
   * Get idCheckInformationInput
   * @return idCheckInformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  public CertifiedDelivery identityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

   /**
   * Get identityVerification
   * @return identityVerification
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientIdentityVerification getIdentityVerification() {
    return identityVerification;
  }

  public void setIdentityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
  }

  public CertifiedDelivery inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

   /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. 
   * @return inheritEmailNotificationConfiguration
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }

  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }

  public CertifiedDelivery lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * 
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CertifiedDelivery lastNameMetadata(PropertyMetadata lastNameMetadata) {
    this.lastNameMetadata = lastNameMetadata;
    return this;
  }

   /**
   * Get lastNameMetadata
   * @return lastNameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getLastNameMetadata() {
    return lastNameMetadata;
  }

  public void setLastNameMetadata(PropertyMetadata lastNameMetadata) {
    this.lastNameMetadata = lastNameMetadata;
  }

  public CertifiedDelivery lockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
    return this;
  }

   /**
   * 
   * @return lockedRecipientPhoneAuthEditable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLockedRecipientPhoneAuthEditable() {
    return lockedRecipientPhoneAuthEditable;
  }

  public void setLockedRecipientPhoneAuthEditable(String lockedRecipientPhoneAuthEditable) {
    this.lockedRecipientPhoneAuthEditable = lockedRecipientPhoneAuthEditable;
  }

  public CertifiedDelivery lockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
    return this;
  }

   /**
   * 
   * @return lockedRecipientSmsEditable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLockedRecipientSmsEditable() {
    return lockedRecipientSmsEditable;
  }

  public void setLockedRecipientSmsEditable(String lockedRecipientSmsEditable) {
    this.lockedRecipientSmsEditable = lockedRecipientSmsEditable;
  }

  public CertifiedDelivery name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CertifiedDelivery nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

   /**
   * Get nameMetadata
   * @return nameMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  public CertifiedDelivery note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public CertifiedDelivery noteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
    return this;
  }

   /**
   * Get noteMetadata
   * @return noteMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getNoteMetadata() {
    return noteMetadata;
  }

  public void setNoteMetadata(PropertyMetadata noteMetadata) {
    this.noteMetadata = noteMetadata;
  }

  public CertifiedDelivery phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

   /**
   * Get phoneAuthentication
   * @return phoneAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  public CertifiedDelivery proofFile(RecipientProofFile proofFile) {
    this.proofFile = proofFile;
    return this;
  }

   /**
   * Get proofFile
   * @return proofFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientProofFile getProofFile() {
    return proofFile;
  }

  public void setProofFile(RecipientProofFile proofFile) {
    this.proofFile = proofFile;
  }

  public CertifiedDelivery recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }

  public CertifiedDelivery addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

   /**
   * Reserved:
   * @return recipientAttachments
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }

  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  public CertifiedDelivery recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

   /**
   * Get recipientAuthenticationStatus
   * @return recipientAuthenticationStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }

  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  public CertifiedDelivery recipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
    return this;
  }

  public CertifiedDelivery addRecipientFeatureMetadataItem(FeatureAvailableMetadata recipientFeatureMetadataItem) {
    this.recipientFeatureMetadata.add(recipientFeatureMetadataItem);
    return this;
  }

   /**
   * 
   * @return recipientFeatureMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<FeatureAvailableMetadata> getRecipientFeatureMetadata() {
    return recipientFeatureMetadata;
  }

  public void setRecipientFeatureMetadata(java.util.List<FeatureAvailableMetadata> recipientFeatureMetadata) {
    this.recipientFeatureMetadata = recipientFeatureMetadata;
  }

  public CertifiedDelivery recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public CertifiedDelivery recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

   /**
   * 
   * @return recipientIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  public CertifiedDelivery recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * 
   * @return recipientType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public CertifiedDelivery recipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
    return this;
  }

   /**
   * Get recipientTypeMetadata
   * @return recipientTypeMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRecipientTypeMetadata() {
    return recipientTypeMetadata;
  }

  public void setRecipientTypeMetadata(PropertyMetadata recipientTypeMetadata) {
    this.recipientTypeMetadata = recipientTypeMetadata;
  }

  public CertifiedDelivery requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

   /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. 
   * @return requireIdLookup
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }

  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  public CertifiedDelivery requireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
    return this;
  }

   /**
   * Get requireIdLookupMetadata
   * @return requireIdLookupMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRequireIdLookupMetadata() {
    return requireIdLookupMetadata;
  }

  public void setRequireIdLookupMetadata(PropertyMetadata requireIdLookupMetadata) {
    this.requireIdLookupMetadata = requireIdLookupMetadata;
  }

  public CertifiedDelivery roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   * @return roleName
  **/
  @ApiModelProperty(example = "null", value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public CertifiedDelivery routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

   /**
   * Specifies the routing order of the recipient in the envelope. 
   * @return routingOrder
  **/
  @ApiModelProperty(example = "null", value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  public CertifiedDelivery routingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
    return this;
  }

   /**
   * Get routingOrderMetadata
   * @return routingOrderMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getRoutingOrderMetadata() {
    return routingOrderMetadata;
  }

  public void setRoutingOrderMetadata(PropertyMetadata routingOrderMetadata) {
    this.routingOrderMetadata = routingOrderMetadata;
  }

  public CertifiedDelivery sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public CertifiedDelivery signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only. 
   * @return signedDateTime
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only. ")
  public String getSignedDateTime() {
    return signedDateTime;
  }

  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  public CertifiedDelivery signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public CertifiedDelivery signingGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
    return this;
  }

   /**
   * Get signingGroupIdMetadata
   * @return signingGroupIdMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public PropertyMetadata getSigningGroupIdMetadata() {
    return signingGroupIdMetadata;
  }

  public void setSigningGroupIdMetadata(PropertyMetadata signingGroupIdMetadata) {
    this.signingGroupIdMetadata = signingGroupIdMetadata;
  }

  public CertifiedDelivery signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

   /**
   * The display name for the signing group.   Maximum Length: 100 characters. 
   * @return signingGroupName
  **/
  @ApiModelProperty(example = "null", value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  public CertifiedDelivery signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }

  public CertifiedDelivery addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

   /**
   * A complex type that contains information about users in the signing group.
   * @return signingGroupUsers
  **/
  @ApiModelProperty(example = "null", value = "A complex type that contains information about users in the signing group.")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }

  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  public CertifiedDelivery smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

   /**
   * Get smsAuthentication
   * @return smsAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  public CertifiedDelivery socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }

  public CertifiedDelivery addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

   /**
   *  Lists the social ID type that can be used for recipient authentication.
   * @return socialAuthentications
  **/
  @ApiModelProperty(example = "null", value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  public CertifiedDelivery status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CertifiedDelivery statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public CertifiedDelivery suppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
    return this;
  }

   /**
   * 
   * @return suppressEmails
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuppressEmails() {
    return suppressEmails;
  }

  public void setSuppressEmails(String suppressEmails) {
    this.suppressEmails = suppressEmails;
  }

  public CertifiedDelivery templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public CertifiedDelivery templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public CertifiedDelivery totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

   /**
   * 
   * @return totalTabCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalTabCount() {
    return totalTabCount;
  }

  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  public CertifiedDelivery userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
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
    CertifiedDelivery certifiedDelivery = (CertifiedDelivery) o;
    return Objects.equals(this.accessCode, certifiedDelivery.accessCode) &&
        Objects.equals(this.accessCodeMetadata, certifiedDelivery.accessCodeMetadata) &&
        Objects.equals(this.addAccessCodeToEmail, certifiedDelivery.addAccessCodeToEmail) &&
        Objects.equals(this.agentCanEditEmail, certifiedDelivery.agentCanEditEmail) &&
        Objects.equals(this.agentCanEditName, certifiedDelivery.agentCanEditName) &&
        Objects.equals(this.allowSystemOverrideForLockedRecipient, certifiedDelivery.allowSystemOverrideForLockedRecipient) &&
        Objects.equals(this.clientUserId, certifiedDelivery.clientUserId) &&
        Objects.equals(this.completedCount, certifiedDelivery.completedCount) &&
        Objects.equals(this.customFields, certifiedDelivery.customFields) &&
        Objects.equals(this.declinedDateTime, certifiedDelivery.declinedDateTime) &&
        Objects.equals(this.declinedReason, certifiedDelivery.declinedReason) &&
        Objects.equals(this.deliveredDateTime, certifiedDelivery.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, certifiedDelivery.deliveryMethod) &&
        Objects.equals(this.deliveryMethodMetadata, certifiedDelivery.deliveryMethodMetadata) &&
        Objects.equals(this.designatorId, certifiedDelivery.designatorId) &&
        Objects.equals(this.designatorIdGuid, certifiedDelivery.designatorIdGuid) &&
        Objects.equals(this.documentVisibility, certifiedDelivery.documentVisibility) &&
        Objects.equals(this.email, certifiedDelivery.email) &&
        Objects.equals(this.emailMetadata, certifiedDelivery.emailMetadata) &&
        Objects.equals(this.emailNotification, certifiedDelivery.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, certifiedDelivery.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, certifiedDelivery.errorDetails) &&
        Objects.equals(this.excludedDocuments, certifiedDelivery.excludedDocuments) &&
        Objects.equals(this.faxNumber, certifiedDelivery.faxNumber) &&
        Objects.equals(this.faxNumberMetadata, certifiedDelivery.faxNumberMetadata) &&
        Objects.equals(this.firstName, certifiedDelivery.firstName) &&
        Objects.equals(this.firstNameMetadata, certifiedDelivery.firstNameMetadata) &&
        Objects.equals(this.fullName, certifiedDelivery.fullName) &&
        Objects.equals(this.fullNameMetadata, certifiedDelivery.fullNameMetadata) &&
        Objects.equals(this.idCheckConfigurationName, certifiedDelivery.idCheckConfigurationName) &&
        Objects.equals(this.idCheckConfigurationNameMetadata, certifiedDelivery.idCheckConfigurationNameMetadata) &&
        Objects.equals(this.idCheckInformationInput, certifiedDelivery.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, certifiedDelivery.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, certifiedDelivery.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.lastName, certifiedDelivery.lastName) &&
        Objects.equals(this.lastNameMetadata, certifiedDelivery.lastNameMetadata) &&
        Objects.equals(this.lockedRecipientPhoneAuthEditable, certifiedDelivery.lockedRecipientPhoneAuthEditable) &&
        Objects.equals(this.lockedRecipientSmsEditable, certifiedDelivery.lockedRecipientSmsEditable) &&
        Objects.equals(this.name, certifiedDelivery.name) &&
        Objects.equals(this.nameMetadata, certifiedDelivery.nameMetadata) &&
        Objects.equals(this.note, certifiedDelivery.note) &&
        Objects.equals(this.noteMetadata, certifiedDelivery.noteMetadata) &&
        Objects.equals(this.phoneAuthentication, certifiedDelivery.phoneAuthentication) &&
        Objects.equals(this.proofFile, certifiedDelivery.proofFile) &&
        Objects.equals(this.recipientAttachments, certifiedDelivery.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, certifiedDelivery.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientFeatureMetadata, certifiedDelivery.recipientFeatureMetadata) &&
        Objects.equals(this.recipientId, certifiedDelivery.recipientId) &&
        Objects.equals(this.recipientIdGuid, certifiedDelivery.recipientIdGuid) &&
        Objects.equals(this.recipientType, certifiedDelivery.recipientType) &&
        Objects.equals(this.recipientTypeMetadata, certifiedDelivery.recipientTypeMetadata) &&
        Objects.equals(this.requireIdLookup, certifiedDelivery.requireIdLookup) &&
        Objects.equals(this.requireIdLookupMetadata, certifiedDelivery.requireIdLookupMetadata) &&
        Objects.equals(this.roleName, certifiedDelivery.roleName) &&
        Objects.equals(this.routingOrder, certifiedDelivery.routingOrder) &&
        Objects.equals(this.routingOrderMetadata, certifiedDelivery.routingOrderMetadata) &&
        Objects.equals(this.sentDateTime, certifiedDelivery.sentDateTime) &&
        Objects.equals(this.signedDateTime, certifiedDelivery.signedDateTime) &&
        Objects.equals(this.signingGroupId, certifiedDelivery.signingGroupId) &&
        Objects.equals(this.signingGroupIdMetadata, certifiedDelivery.signingGroupIdMetadata) &&
        Objects.equals(this.signingGroupName, certifiedDelivery.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, certifiedDelivery.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, certifiedDelivery.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, certifiedDelivery.socialAuthentications) &&
        Objects.equals(this.status, certifiedDelivery.status) &&
        Objects.equals(this.statusCode, certifiedDelivery.statusCode) &&
        Objects.equals(this.suppressEmails, certifiedDelivery.suppressEmails) &&
        Objects.equals(this.templateLocked, certifiedDelivery.templateLocked) &&
        Objects.equals(this.templateRequired, certifiedDelivery.templateRequired) &&
        Objects.equals(this.totalTabCount, certifiedDelivery.totalTabCount) &&
        Objects.equals(this.userId, certifiedDelivery.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, accessCodeMetadata, addAccessCodeToEmail, agentCanEditEmail, agentCanEditName, allowSystemOverrideForLockedRecipient, clientUserId, completedCount, customFields, declinedDateTime, declinedReason, deliveredDateTime, deliveryMethod, deliveryMethodMetadata, designatorId, designatorIdGuid, documentVisibility, email, emailMetadata, emailNotification, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, faxNumberMetadata, firstName, firstNameMetadata, fullName, fullNameMetadata, idCheckConfigurationName, idCheckConfigurationNameMetadata, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, lastName, lastNameMetadata, lockedRecipientPhoneAuthEditable, lockedRecipientSmsEditable, name, nameMetadata, note, noteMetadata, phoneAuthentication, proofFile, recipientAttachments, recipientAuthenticationStatus, recipientFeatureMetadata, recipientId, recipientIdGuid, recipientType, recipientTypeMetadata, requireIdLookup, requireIdLookupMetadata, roleName, routingOrder, routingOrderMetadata, sentDateTime, signedDateTime, signingGroupId, signingGroupIdMetadata, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, statusCode, suppressEmails, templateLocked, templateRequired, totalTabCount, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertifiedDelivery {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessCodeMetadata: ").append(toIndentedString(accessCodeMetadata)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    agentCanEditEmail: ").append(toIndentedString(agentCanEditEmail)).append("\n");
    sb.append("    agentCanEditName: ").append(toIndentedString(agentCanEditName)).append("\n");
    sb.append("    allowSystemOverrideForLockedRecipient: ").append(toIndentedString(allowSystemOverrideForLockedRecipient)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
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
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    firstNameMetadata: ").append(toIndentedString(firstNameMetadata)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    fullNameMetadata: ").append(toIndentedString(fullNameMetadata)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckConfigurationNameMetadata: ").append(toIndentedString(idCheckConfigurationNameMetadata)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastNameMetadata: ").append(toIndentedString(lastNameMetadata)).append("\n");
    sb.append("    lockedRecipientPhoneAuthEditable: ").append(toIndentedString(lockedRecipientPhoneAuthEditable)).append("\n");
    sb.append("    lockedRecipientSmsEditable: ").append(toIndentedString(lockedRecipientSmsEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteMetadata: ").append(toIndentedString(noteMetadata)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    proofFile: ").append(toIndentedString(proofFile)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    recipientFeatureMetadata: ").append(toIndentedString(recipientFeatureMetadata)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    recipientTypeMetadata: ").append(toIndentedString(recipientTypeMetadata)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    requireIdLookupMetadata: ").append(toIndentedString(requireIdLookupMetadata)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    routingOrderMetadata: ").append(toIndentedString(routingOrderMetadata)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupIdMetadata: ").append(toIndentedString(signingGroupIdMetadata)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    suppressEmails: ").append(toIndentedString(suppressEmails)).append("\n");
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

