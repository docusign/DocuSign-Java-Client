package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.NotaryHost;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientIdentityVerification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSAMLAuthentication;
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
 * InPersonSigner.
 *
 */

public class InPersonSigner {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("autoNavigation")
  private String autoNavigation = null;

  @JsonProperty("canSignOffline")
  private String canSignOffline = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

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

  @JsonProperty("documentVisibility")
  private java.util.List<DocumentVisibility> documentVisibility = null;

  @JsonProperty("email")
  private String email = null;

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

  @JsonProperty("hostEmail")
  private String hostEmail = null;

  @JsonProperty("hostName")
  private String hostName = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckInformationInput")
  private IdCheckInformationInput idCheckInformationInput = null;

  @JsonProperty("identityVerification")
  private RecipientIdentityVerification identityVerification = null;

  @JsonProperty("inheritEmailNotificationConfiguration")
  private String inheritEmailNotificationConfiguration = null;

  @JsonProperty("inPersonSigningType")
  private String inPersonSigningType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notaryHost")
  private NotaryHost notaryHost = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("offlineAttributes")
  private OfflineAttributes offlineAttributes = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("recipientAttachments")
  private java.util.List<RecipientAttachment> recipientAttachments = null;

  @JsonProperty("recipientAuthenticationStatus")
  private AuthenticationStatus recipientAuthenticationStatus = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientSignatureProviders")
  private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = null;

  @JsonProperty("recipientSuppliesTabs")
  private String recipientSuppliesTabs = null;

  @JsonProperty("requireIdLookup")
  private String requireIdLookup = null;

  @JsonProperty("requireSignerCertificate")
  private String requireSignerCertificate = null;

  @JsonProperty("requireSignOnPaper")
  private String requireSignOnPaper = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("samlAuthentication")
  private RecipientSAMLAuthentication samlAuthentication = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("signatureInfo")
  private RecipientSignatureInformation signatureInfo = null;

  @JsonProperty("signedDateTime")
  private String signedDateTime = null;

  @JsonProperty("signerEmail")
  private String signerEmail = null;

  @JsonProperty("signerName")
  private String signerName = null;

  @JsonProperty("signInEachLocation")
  private String signInEachLocation = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

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


  /**
   * accessCode.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required..
   * @return accessCode
   **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  /**
   * setAccessCode.
   **/
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  /**
   * addAccessCodeToEmail.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

  /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient..
   * @return addAccessCodeToEmail
   **/
  @ApiModelProperty(value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }

  /**
   * setAddAccessCodeToEmail.
   **/
  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }


  /**
   * autoNavigation.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner autoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
    return this;
  }

  /**
   * .
   * @return autoNavigation
   **/
  @ApiModelProperty(value = "")
  public String getAutoNavigation() {
    return autoNavigation;
  }

  /**
   * setAutoNavigation.
   **/
  public void setAutoNavigation(String autoNavigation) {
    this.autoNavigation = autoNavigation;
  }


  /**
   * canSignOffline.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner canSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
    return this;
  }

  /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline..
   * @return canSignOffline
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
  public String getCanSignOffline() {
    return canSignOffline;
  }

  /**
   * setCanSignOffline.
   **/
  public void setCanSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
  }


  /**
   * clientUserId.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. .
   * @return clientUserId
   **/
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  /**
   * setClientUserId.
   **/
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  /**
   * creationReason.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner creationReason(String creationReason) {
    this.creationReason = creationReason;
    return this;
  }

  /**
   * .
   * @return creationReason
   **/
  @ApiModelProperty(value = "")
  public String getCreationReason() {
    return creationReason;
  }

  /**
   * setCreationReason.
   **/
  public void setCreationReason(String creationReason) {
    this.creationReason = creationReason;
  }


  /**
   * customFields.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addCustomFieldsItem(String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<String>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters..
   * @return customFields
   **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  /**
   * setCustomFields.
   **/
  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }


  /**
   * declinedDateTime.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

  /**
   * The date and time the recipient declined the document..
   * @return declinedDateTime
   **/
  @ApiModelProperty(value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  /**
   * setDeclinedDateTime.
   **/
  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }


  /**
   * declinedReason.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

  /**
   * The reason the recipient declined the document..
   * @return declinedReason
   **/
  @ApiModelProperty(value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  /**
   * setDeclinedReason.
   **/
  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }


  /**
   * defaultRecipient.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner defaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }

  /**
   * .
   * @return defaultRecipient
   **/
  @ApiModelProperty(value = "")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }

  /**
   * setDefaultRecipient.
   **/
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }


  /**
   * deliveredDateTime.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveredDateTime
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  /**
   * setDeliveredDateTime.
   **/
  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }


  /**
   * deliveryMethod.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Reserved: For DocuSign use only..
   * @return deliveryMethod
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  /**
   * setDeliveryMethod.
   **/
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  /**
   * documentVisibility.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }
  
  /**
   * addDocumentVisibilityItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    if (this.documentVisibility == null) {
      this.documentVisibility = new java.util.ArrayList<DocumentVisibility>();
    }
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

  /**
   * .
   * @return documentVisibility
   **/
  @ApiModelProperty(value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  /**
   * setDocumentVisibility.
   **/
  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }


  /**
   * email.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * emailNotification.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

  /**
   * Get emailNotification.
   * @return emailNotification
   **/
  @ApiModelProperty(value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  /**
   * setEmailNotification.
   **/
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }


  /**
   * embeddedRecipientStartURL.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` .
   * @return embeddedRecipientStartURL
   **/
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  /**
   * setEmbeddedRecipientStartURL.
   **/
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }


  /**
   * errorDetails.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * excludedDocuments.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }
  
  /**
   * addExcludedDocumentsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addExcludedDocumentsItem(String excludedDocumentsItem) {
    if (this.excludedDocuments == null) {
      this.excludedDocuments = new java.util.ArrayList<String>();
    }
    this.excludedDocuments.add(excludedDocumentsItem);
    return this;
  }

  /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent..
   * @return excludedDocuments
   **/
  @ApiModelProperty(value = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
  public java.util.List<String> getExcludedDocuments() {
    return excludedDocuments;
  }

  /**
   * setExcludedDocuments.
   **/
  public void setExcludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
  }


  /**
   * faxNumber.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Reserved:.
   * @return faxNumber
   **/
  @ApiModelProperty(value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  /**
   * setFaxNumber.
   **/
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   * hostEmail.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner hostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
    return this;
  }

  /**
   * .
   * @return hostEmail
   **/
  @ApiModelProperty(value = "")
  public String getHostEmail() {
    return hostEmail;
  }

  /**
   * setHostEmail.
   **/
  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }


  /**
   * hostName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * Specifies the name of the signing host. It is a required element for In Person Signers recipient Type.  Maximum Length: 100 characters..
   * @return hostName
   **/
  @ApiModelProperty(value = "Specifies the name of the signing host. It is a required element for In Person Signers recipient Type.  Maximum Length: 100 characters.")
  public String getHostName() {
    return hostName;
  }

  /**
   * setHostName.
   **/
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  /**
   * idCheckConfigurationName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node..
   * @return idCheckConfigurationName
   **/
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  /**
   * setIdCheckConfigurationName.
   **/
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }


  /**
   * idCheckInformationInput.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

  /**
   * Get idCheckInformationInput.
   * @return idCheckInformationInput
   **/
  @ApiModelProperty(value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  /**
   * setIdCheckInformationInput.
   **/
  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }


  /**
   * identityVerification.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner identityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

  /**
   * Get identityVerification.
   * @return identityVerification
   **/
  @ApiModelProperty(value = "")
  public RecipientIdentityVerification getIdentityVerification() {
    return identityVerification;
  }

  /**
   * setIdentityVerification.
   **/
  public void setIdentityVerification(RecipientIdentityVerification identityVerification) {
    this.identityVerification = identityVerification;
  }


  /**
   * inheritEmailNotificationConfiguration.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

  /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. .
   * @return inheritEmailNotificationConfiguration
   **/
  @ApiModelProperty(value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }

  /**
   * setInheritEmailNotificationConfiguration.
   **/
  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }


  /**
   * inPersonSigningType.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner inPersonSigningType(String inPersonSigningType) {
    this.inPersonSigningType = inPersonSigningType;
    return this;
  }

  /**
   * .
   * @return inPersonSigningType
   **/
  @ApiModelProperty(value = "")
  public String getInPersonSigningType() {
    return inPersonSigningType;
  }

  /**
   * setInPersonSigningType.
   **/
  public void setInPersonSigningType(String inPersonSigningType) {
    this.inPersonSigningType = inPersonSigningType;
  }


  /**
   * name.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * notaryHost.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner notaryHost(NotaryHost notaryHost) {
    this.notaryHost = notaryHost;
    return this;
  }

  /**
   * Get notaryHost.
   * @return notaryHost
   **/
  @ApiModelProperty(value = "")
  public NotaryHost getNotaryHost() {
    return notaryHost;
  }

  /**
   * setNotaryHost.
   **/
  public void setNotaryHost(NotaryHost notaryHost) {
    this.notaryHost = notaryHost;
  }


  /**
   * note.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters..
   * @return note
   **/
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  /**
   * setNote.
   **/
  public void setNote(String note) {
    this.note = note;
  }


  /**
   * offlineAttributes.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner offlineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
    return this;
  }

  /**
   * Get offlineAttributes.
   * @return offlineAttributes
   **/
  @ApiModelProperty(value = "")
  public OfflineAttributes getOfflineAttributes() {
    return offlineAttributes;
  }

  /**
   * setOfflineAttributes.
   **/
  public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
  }


  /**
   * phoneAuthentication.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

  /**
   * Get phoneAuthentication.
   * @return phoneAuthentication
   **/
  @ApiModelProperty(value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  /**
   * setPhoneAuthentication.
   **/
  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }


  /**
   * recipientAttachments.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }
  
  /**
   * addRecipientAttachmentsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    if (this.recipientAttachments == null) {
      this.recipientAttachments = new java.util.ArrayList<RecipientAttachment>();
    }
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

  /**
   * Reserved:.
   * @return recipientAttachments
   **/
  @ApiModelProperty(value = "Reserved:")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }

  /**
   * setRecipientAttachments.
   **/
  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }


  /**
   * recipientAuthenticationStatus.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

  /**
   * Get recipientAuthenticationStatus.
   * @return recipientAuthenticationStatus
   **/
  @ApiModelProperty(value = "")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }

  /**
   * setRecipientAuthenticationStatus.
   **/
  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }


  /**
   * recipientId.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * recipientIdGuid.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   * @return recipientIdGuid
   **/
  @ApiModelProperty(value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /**
   * setRecipientIdGuid.
   **/
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }


  /**
   * recipientSignatureProviders.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
    return this;
  }
  
  /**
   * addRecipientSignatureProvidersItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addRecipientSignatureProvidersItem(RecipientSignatureProvider recipientSignatureProvidersItem) {
    if (this.recipientSignatureProviders == null) {
      this.recipientSignatureProviders = new java.util.ArrayList<RecipientSignatureProvider>();
    }
    this.recipientSignatureProviders.add(recipientSignatureProvidersItem);
    return this;
  }

  /**
   * .
   * @return recipientSignatureProviders
   **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
    return recipientSignatureProviders;
  }

  /**
   * setRecipientSignatureProviders.
   **/
  public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
    this.recipientSignatureProviders = recipientSignatureProviders;
  }


  /**
   * recipientSuppliesTabs.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner recipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
    return this;
  }

  /**
   * .
   * @return recipientSuppliesTabs
   **/
  @ApiModelProperty(value = "")
  public String getRecipientSuppliesTabs() {
    return recipientSuppliesTabs;
  }

  /**
   * setRecipientSuppliesTabs.
   **/
  public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
  }


  /**
   * requireIdLookup.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

  /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. .
   * @return requireIdLookup
   **/
  @ApiModelProperty(value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }

  /**
   * setRequireIdLookup.
   **/
  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }


  /**
   * requireSignerCertificate.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner requireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
    return this;
  }

  /**
   * .
   * @return requireSignerCertificate
   **/
  @ApiModelProperty(value = "")
  public String getRequireSignerCertificate() {
    return requireSignerCertificate;
  }

  /**
   * setRequireSignerCertificate.
   **/
  public void setRequireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
  }


  /**
   * requireSignOnPaper.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner requireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
    return this;
  }

  /**
   * .
   * @return requireSignOnPaper
   **/
  @ApiModelProperty(value = "")
  public String getRequireSignOnPaper() {
    return requireSignOnPaper;
  }

  /**
   * setRequireSignOnPaper.
   **/
  public void setRequireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
  }


  /**
   * roleName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients..
   * @return roleName
   **/
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  /**
   * setRoleName.
   **/
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  /**
   * routingOrder.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

  /**
   * Specifies the routing order of the recipient in the envelope. .
   * @return routingOrder
   **/
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  /**
   * setRoutingOrder.
   **/
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }


  /**
   * samlAuthentication.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner samlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
    return this;
  }

  /**
   * Get samlAuthentication.
   * @return samlAuthentication
   **/
  @ApiModelProperty(value = "")
  public RecipientSAMLAuthentication getSamlAuthentication() {
    return samlAuthentication;
  }

  /**
   * setSamlAuthentication.
   **/
  public void setSamlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
  }


  /**
   * sentDateTime.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

  /**
   * The date and time the envelope was sent..
   * @return sentDateTime
   **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  /**
   * setSentDateTime.
   **/
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }


  /**
   * signatureInfo.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }

  /**
   * Get signatureInfo.
   * @return signatureInfo
   **/
  @ApiModelProperty(value = "")
  public RecipientSignatureInformation getSignatureInfo() {
    return signatureInfo;
  }

  /**
   * setSignatureInfo.
   **/
  public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
  }


  /**
   * signedDateTime.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

  /**
   * Reserved: For DocuSign use only. .
   * @return signedDateTime
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only. ")
  public String getSignedDateTime() {
    return signedDateTime;
  }

  /**
   * setSignedDateTime.
   **/
  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }


  /**
   * signerEmail.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
    return this;
  }

  /**
   * The email address for an InPersonSigner recipient Type.   Maximum Length: 100 characters. .
   * @return signerEmail
   **/
  @ApiModelProperty(value = "The email address for an InPersonSigner recipient Type.   Maximum Length: 100 characters. ")
  public String getSignerEmail() {
    return signerEmail;
  }

  /**
   * setSignerEmail.
   **/
  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }


  /**
   * signerName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * Required. The full legal name of a signer for the envelope.   Maximum Length: 100 characters.   .
   * @return signerName
   **/
  @ApiModelProperty(value = "Required. The full legal name of a signer for the envelope.   Maximum Length: 100 characters.   ")
  public String getSignerName() {
    return signerName;
  }

  /**
   * setSignerName.
   **/
  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  /**
   * signInEachLocation.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
    return this;
  }

  /**
   * When set to **true**, specifies that the signer must sign in all locations..
   * @return signInEachLocation
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer must sign in all locations.")
  public String getSignInEachLocation() {
    return signInEachLocation;
  }

  /**
   * setSignInEachLocation.
   **/
  public void setSignInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
  }


  /**
   * signingGroupId.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  /**
   * setSigningGroupId.
   **/
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }


  /**
   * signingGroupName.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

  /**
   * The display name for the signing group.   Maximum Length: 100 characters. .
   * @return signingGroupName
   **/
  @ApiModelProperty(value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  /**
   * setSigningGroupName.
   **/
  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }


  /**
   * signingGroupUsers.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }
  
  /**
   * addSigningGroupUsersItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    if (this.signingGroupUsers == null) {
      this.signingGroupUsers = new java.util.ArrayList<UserInfo>();
    }
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

  /**
   * A complex type that contains information about users in the signing group..
   * @return signingGroupUsers
   **/
  @ApiModelProperty(value = "A complex type that contains information about users in the signing group.")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }

  /**
   * setSigningGroupUsers.
   **/
  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }


  /**
   * smsAuthentication.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

  /**
   * Get smsAuthentication.
   * @return smsAuthentication
   **/
  @ApiModelProperty(value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  /**
   * setSmsAuthentication.
   **/
  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }


  /**
   * socialAuthentications.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }
  
  /**
   * addSocialAuthenticationsItem.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    if (this.socialAuthentications == null) {
      this.socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
    }
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

  /**
   *  Lists the social ID type that can be used for recipient authentication..
   * @return socialAuthentications
   **/
  @ApiModelProperty(value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  /**
   * setSocialAuthentications.
   **/
  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }


  /**
   * status.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * tabs.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * Get tabs.
   * @return tabs
   **/
  @ApiModelProperty(value = "")
  public Tabs getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }


  /**
   * templateLocked.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
   * @return templateLocked
   **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }


  /**
   * templateRequired.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
   * @return templateRequired
   **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }


  /**
   * totalTabCount.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

  /**
   * .
   * @return totalTabCount
   **/
  @ApiModelProperty(value = "")
  public String getTotalTabCount() {
    return totalTabCount;
  }

  /**
   * setTotalTabCount.
   **/
  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }


  /**
   * userId.
   *
   * @return InPersonSigner
   **/
  public InPersonSigner userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * .
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
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
    InPersonSigner inPersonSigner = (InPersonSigner) o;
    return Objects.equals(this.accessCode, inPersonSigner.accessCode) &&
        Objects.equals(this.addAccessCodeToEmail, inPersonSigner.addAccessCodeToEmail) &&
        Objects.equals(this.autoNavigation, inPersonSigner.autoNavigation) &&
        Objects.equals(this.canSignOffline, inPersonSigner.canSignOffline) &&
        Objects.equals(this.clientUserId, inPersonSigner.clientUserId) &&
        Objects.equals(this.creationReason, inPersonSigner.creationReason) &&
        Objects.equals(this.customFields, inPersonSigner.customFields) &&
        Objects.equals(this.declinedDateTime, inPersonSigner.declinedDateTime) &&
        Objects.equals(this.declinedReason, inPersonSigner.declinedReason) &&
        Objects.equals(this.defaultRecipient, inPersonSigner.defaultRecipient) &&
        Objects.equals(this.deliveredDateTime, inPersonSigner.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, inPersonSigner.deliveryMethod) &&
        Objects.equals(this.documentVisibility, inPersonSigner.documentVisibility) &&
        Objects.equals(this.email, inPersonSigner.email) &&
        Objects.equals(this.emailNotification, inPersonSigner.emailNotification) &&
        Objects.equals(this.embeddedRecipientStartURL, inPersonSigner.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, inPersonSigner.errorDetails) &&
        Objects.equals(this.excludedDocuments, inPersonSigner.excludedDocuments) &&
        Objects.equals(this.faxNumber, inPersonSigner.faxNumber) &&
        Objects.equals(this.hostEmail, inPersonSigner.hostEmail) &&
        Objects.equals(this.hostName, inPersonSigner.hostName) &&
        Objects.equals(this.idCheckConfigurationName, inPersonSigner.idCheckConfigurationName) &&
        Objects.equals(this.idCheckInformationInput, inPersonSigner.idCheckInformationInput) &&
        Objects.equals(this.identityVerification, inPersonSigner.identityVerification) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, inPersonSigner.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.inPersonSigningType, inPersonSigner.inPersonSigningType) &&
        Objects.equals(this.name, inPersonSigner.name) &&
        Objects.equals(this.notaryHost, inPersonSigner.notaryHost) &&
        Objects.equals(this.note, inPersonSigner.note) &&
        Objects.equals(this.offlineAttributes, inPersonSigner.offlineAttributes) &&
        Objects.equals(this.phoneAuthentication, inPersonSigner.phoneAuthentication) &&
        Objects.equals(this.recipientAttachments, inPersonSigner.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, inPersonSigner.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientId, inPersonSigner.recipientId) &&
        Objects.equals(this.recipientIdGuid, inPersonSigner.recipientIdGuid) &&
        Objects.equals(this.recipientSignatureProviders, inPersonSigner.recipientSignatureProviders) &&
        Objects.equals(this.recipientSuppliesTabs, inPersonSigner.recipientSuppliesTabs) &&
        Objects.equals(this.requireIdLookup, inPersonSigner.requireIdLookup) &&
        Objects.equals(this.requireSignerCertificate, inPersonSigner.requireSignerCertificate) &&
        Objects.equals(this.requireSignOnPaper, inPersonSigner.requireSignOnPaper) &&
        Objects.equals(this.roleName, inPersonSigner.roleName) &&
        Objects.equals(this.routingOrder, inPersonSigner.routingOrder) &&
        Objects.equals(this.samlAuthentication, inPersonSigner.samlAuthentication) &&
        Objects.equals(this.sentDateTime, inPersonSigner.sentDateTime) &&
        Objects.equals(this.signatureInfo, inPersonSigner.signatureInfo) &&
        Objects.equals(this.signedDateTime, inPersonSigner.signedDateTime) &&
        Objects.equals(this.signerEmail, inPersonSigner.signerEmail) &&
        Objects.equals(this.signerName, inPersonSigner.signerName) &&
        Objects.equals(this.signInEachLocation, inPersonSigner.signInEachLocation) &&
        Objects.equals(this.signingGroupId, inPersonSigner.signingGroupId) &&
        Objects.equals(this.signingGroupName, inPersonSigner.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, inPersonSigner.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, inPersonSigner.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, inPersonSigner.socialAuthentications) &&
        Objects.equals(this.status, inPersonSigner.status) &&
        Objects.equals(this.tabs, inPersonSigner.tabs) &&
        Objects.equals(this.templateLocked, inPersonSigner.templateLocked) &&
        Objects.equals(this.templateRequired, inPersonSigner.templateRequired) &&
        Objects.equals(this.totalTabCount, inPersonSigner.totalTabCount) &&
        Objects.equals(this.userId, inPersonSigner.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCode, addAccessCodeToEmail, autoNavigation, canSignOffline, clientUserId, creationReason, customFields, declinedDateTime, declinedReason, defaultRecipient, deliveredDateTime, deliveryMethod, documentVisibility, email, emailNotification, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, hostEmail, hostName, idCheckConfigurationName, idCheckInformationInput, identityVerification, inheritEmailNotificationConfiguration, inPersonSigningType, name, notaryHost, note, offlineAttributes, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, requireIdLookup, requireSignerCertificate, requireSignOnPaper, roleName, routingOrder, samlAuthentication, sentDateTime, signatureInfo, signedDateTime, signerEmail, signerName, signInEachLocation, signingGroupId, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, tabs, templateLocked, templateRequired, totalTabCount, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InPersonSigner {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
    sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    creationReason: ").append(toIndentedString(creationReason)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    excludedDocuments: ").append(toIndentedString(excludedDocuments)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    inPersonSigningType: ").append(toIndentedString(inPersonSigningType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notaryHost: ").append(toIndentedString(notaryHost)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
    sb.append("    recipientSuppliesTabs: ").append(toIndentedString(recipientSuppliesTabs)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    requireSignerCertificate: ").append(toIndentedString(requireSignerCertificate)).append("\n");
    sb.append("    requireSignOnPaper: ").append(toIndentedString(requireSignOnPaper)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    samlAuthentication: ").append(toIndentedString(samlAuthentication)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    signInEachLocation: ").append(toIndentedString(signInEachLocation)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

