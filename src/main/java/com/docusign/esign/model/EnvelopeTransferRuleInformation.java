package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeTransferRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeTransferRuleInformation
 */

public class EnvelopeTransferRuleInformation {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("envelopeTransferRules")
  private java.util.List<EnvelopeTransferRule> envelopeTransferRules = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  public EnvelopeTransferRuleInformation endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * The last position in the result set. 
   * @return endPosition
  **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  public EnvelopeTransferRuleInformation envelopeTransferRules(java.util.List<EnvelopeTransferRule> envelopeTransferRules) {
    this.envelopeTransferRules = envelopeTransferRules;
    return this;
  }

  public EnvelopeTransferRuleInformation addEnvelopeTransferRulesItem(EnvelopeTransferRule envelopeTransferRulesItem) {
    if (this.envelopeTransferRules == null) {
      this.envelopeTransferRules = new java.util.ArrayList<EnvelopeTransferRule>();
    }
    this.envelopeTransferRules.add(envelopeTransferRulesItem);
    return this;
  }

   /**
   * 
   * @return envelopeTransferRules
  **/
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeTransferRule> getEnvelopeTransferRules() {
    return envelopeTransferRules;
  }

  public void setEnvelopeTransferRules(java.util.List<EnvelopeTransferRule> envelopeTransferRules) {
    this.envelopeTransferRules = envelopeTransferRules;
  }

  public EnvelopeTransferRuleInformation nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

   /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. 
   * @return nextUri
  **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public EnvelopeTransferRuleInformation previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

   /**
   * The postal code for the billing address.
   * @return previousUri
  **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  public EnvelopeTransferRuleInformation resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * The number of results returned in this response. 
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public EnvelopeTransferRuleInformation startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public EnvelopeTransferRuleInformation totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   * @return totalSetSize
  **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeTransferRuleInformation envelopeTransferRuleInformation = (EnvelopeTransferRuleInformation) o;
    return Objects.equals(this.endPosition, envelopeTransferRuleInformation.endPosition) &&
        Objects.equals(this.envelopeTransferRules, envelopeTransferRuleInformation.envelopeTransferRules) &&
        Objects.equals(this.nextUri, envelopeTransferRuleInformation.nextUri) &&
        Objects.equals(this.previousUri, envelopeTransferRuleInformation.previousUri) &&
        Objects.equals(this.resultSetSize, envelopeTransferRuleInformation.resultSetSize) &&
        Objects.equals(this.startPosition, envelopeTransferRuleInformation.startPosition) &&
        Objects.equals(this.totalSetSize, envelopeTransferRuleInformation.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, envelopeTransferRules, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTransferRuleInformation {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    envelopeTransferRules: ").append(toIndentedString(envelopeTransferRules)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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

