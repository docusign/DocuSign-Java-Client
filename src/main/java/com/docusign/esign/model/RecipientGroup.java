package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientGroup
 */

public class RecipientGroup {
  @JsonProperty("groupMessage")
  private String groupMessage = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("recipients")
  private java.util.List<RecipientOption> recipients = null;

  public RecipientGroup groupMessage(String groupMessage) {
    this.groupMessage = groupMessage;
    return this;
  }

   /**
   * 
   * @return groupMessage
  **/
  @ApiModelProperty(value = "")
  public String getGroupMessage() {
    return groupMessage;
  }

  public void setGroupMessage(String groupMessage) {
    this.groupMessage = groupMessage;
  }

  public RecipientGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group.
   * @return groupName
  **/
  @ApiModelProperty(value = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public RecipientGroup recipients(java.util.List<RecipientOption> recipients) {
    this.recipients = recipients;
    return this;
  }

  public RecipientGroup addRecipientsItem(RecipientOption recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<RecipientOption>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * An array of powerform recipients.
   * @return recipients
  **/
  @ApiModelProperty(value = "An array of powerform recipients.")
  public java.util.List<RecipientOption> getRecipients() {
    return recipients;
  }

  public void setRecipients(java.util.List<RecipientOption> recipients) {
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
    RecipientGroup recipientGroup = (RecipientGroup) o;
    return Objects.equals(this.groupMessage, recipientGroup.groupMessage) &&
        Objects.equals(this.groupName, recipientGroup.groupName) &&
        Objects.equals(this.recipients, recipientGroup.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupMessage, groupName, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientGroup {\n");
    
    sb.append("    groupMessage: ").append(toIndentedString(groupMessage)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

