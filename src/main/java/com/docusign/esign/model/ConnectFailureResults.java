package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectFailureResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectFailureResults.
 *
 */

public class ConnectFailureResults implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("retryQueue")
  private java.util.List<ConnectFailureResult> retryQueue = null;


  /**
   * retryQueue.
   *
   * @return ConnectFailureResults
   **/
  public ConnectFailureResults retryQueue(java.util.List<ConnectFailureResult> retryQueue) {
    this.retryQueue = retryQueue;
    return this;
  }
  
  /**
   * addRetryQueueItem.
   *
   * @return ConnectFailureResults
   **/
  public ConnectFailureResults addRetryQueueItem(ConnectFailureResult retryQueueItem) {
    if (this.retryQueue == null) {
      this.retryQueue = new java.util.ArrayList<>();
    }
    this.retryQueue.add(retryQueueItem);
    return this;
  }

  /**
   * .
   * @return retryQueue
   **/
  @Schema(description = "")
  public java.util.List<ConnectFailureResult> getRetryQueue() {
    return retryQueue;
  }

  /**
   * setRetryQueue.
   **/
  public void setRetryQueue(java.util.List<ConnectFailureResult> retryQueue) {
    this.retryQueue = retryQueue;
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
    ConnectFailureResults connectFailureResults = (ConnectFailureResults) o;
    return Objects.equals(this.retryQueue, connectFailureResults.retryQueue);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(retryQueue);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectFailureResults {\n");
    
    sb.append("    retryQueue: ").append(toIndentedString(retryQueue)).append("\n");
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

