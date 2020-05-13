package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingCopyCustomField;
import com.docusign.esign.model.BulkSendingCopyRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendingCopy
 */

public class BulkSendingCopy {
  @JsonProperty("customFields")
  private java.util.List<BulkSendingCopyCustomField> customFields = null;

  @JsonProperty("emailBlurb")
  private String emailBlurb = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("recipients")
  private java.util.List<BulkSendingCopyRecipient> recipients = null;

  public BulkSendingCopy customFields(java.util.List<BulkSendingCopyCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public BulkSendingCopy addCustomFieldsItem(BulkSendingCopyCustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<BulkSendingCopyCustomField>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   * @return customFields
  **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<BulkSendingCopyCustomField> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(java.util.List<BulkSendingCopyCustomField> customFields) {
    this.customFields = customFields;
  }

  public BulkSendingCopy emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }

   /**
   * 
   * @return emailBlurb
  **/
  @ApiModelProperty(value = "")
  public String getEmailBlurb() {
    return emailBlurb;
  }

  public void setEmailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
  }

  public BulkSendingCopy emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   * @return emailSubject
  **/
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public BulkSendingCopy recipients(java.util.List<BulkSendingCopyRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public BulkSendingCopy addRecipientsItem(BulkSendingCopyRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<BulkSendingCopyRecipient>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * An array of powerform recipients.
   * @return recipients
  **/
  @ApiModelProperty(value = "An array of powerform recipients.")
  public java.util.List<BulkSendingCopyRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(java.util.List<BulkSendingCopyRecipient> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendingCopy bulkSendingCopy = (BulkSendingCopy) o;
    return Objects.equals(this.customFields, bulkSendingCopy.customFields) &&
        Objects.equals(this.emailBlurb, bulkSendingCopy.emailBlurb) &&
        Objects.equals(this.emailSubject, bulkSendingCopy.emailSubject) &&
        Objects.equals(this.recipients, bulkSendingCopy.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, emailBlurb, emailSubject, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingCopy {\n");
    
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

