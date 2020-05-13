package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CommentPublish
 */

public class CommentPublish {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mentions")
  private java.util.List<String> mentions = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("threadAnchorKeys")
  private java.util.Map<String, String> threadAnchorKeys = null;

  @JsonProperty("threadId")
  private String threadId = null;

  @JsonProperty("visibleTo")
  private java.util.List<String> visibleTo = null;

  public CommentPublish id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentPublish mentions(java.util.List<String> mentions) {
    this.mentions = mentions;
    return this;
  }

  public CommentPublish addMentionsItem(String mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new java.util.ArrayList<String>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

   /**
   * 
   * @return mentions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getMentions() {
    return mentions;
  }

  public void setMentions(java.util.List<String> mentions) {
    this.mentions = mentions;
  }

  public CommentPublish text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CommentPublish threadAnchorKeys(java.util.Map<String, String> threadAnchorKeys) {
    this.threadAnchorKeys = threadAnchorKeys;
    return this;
  }

  public CommentPublish putThreadAnchorKeysItem(String key, String threadAnchorKeysItem) {
    if (this.threadAnchorKeys == null) {
      this.threadAnchorKeys = new java.util.HashMap<String, String>();
    }
    this.threadAnchorKeys.put(key, threadAnchorKeysItem);
    return this;
  }

   /**
   * 
   * @return threadAnchorKeys
  **/
  @ApiModelProperty(value = "")
  public java.util.Map<String, String> getThreadAnchorKeys() {
    return threadAnchorKeys;
  }

  public void setThreadAnchorKeys(java.util.Map<String, String> threadAnchorKeys) {
    this.threadAnchorKeys = threadAnchorKeys;
  }

  public CommentPublish threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * 
   * @return threadId
  **/
  @ApiModelProperty(value = "")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public CommentPublish visibleTo(java.util.List<String> visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }

  public CommentPublish addVisibleToItem(String visibleToItem) {
    if (this.visibleTo == null) {
      this.visibleTo = new java.util.ArrayList<String>();
    }
    this.visibleTo.add(visibleToItem);
    return this;
  }

   /**
   * 
   * @return visibleTo
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getVisibleTo() {
    return visibleTo;
  }

  public void setVisibleTo(java.util.List<String> visibleTo) {
    this.visibleTo = visibleTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentPublish commentPublish = (CommentPublish) o;
    return Objects.equals(this.id, commentPublish.id) &&
        Objects.equals(this.mentions, commentPublish.mentions) &&
        Objects.equals(this.text, commentPublish.text) &&
        Objects.equals(this.threadAnchorKeys, commentPublish.threadAnchorKeys) &&
        Objects.equals(this.threadId, commentPublish.threadId) &&
        Objects.equals(this.visibleTo, commentPublish.visibleTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mentions, text, threadAnchorKeys, threadId, visibleTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentPublish {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    threadAnchorKeys: ").append(toIndentedString(threadAnchorKeys)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
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

