/*
 * Ziqni Gamification Cloud API
 * This is the gamification cloud for Ziqni
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.gamification.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ziqni.gamification.client.model.ContestFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This is a request to get Contest
 */
@ApiModel(description = "This is a request to get Contest")
@JsonPropertyOrder({
  ContestRequest.JSON_PROPERTY_CONTEST_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContestRequest {
  public static final String JSON_PROPERTY_CONTEST_FILTER = "contestFilter";
  private ContestFilter contestFilter;

  public ContestRequest() { 
  }

  public ContestRequest contestFilter(ContestFilter contestFilter) {
    this.contestFilter = contestFilter;
    return this;
  }

   /**
   * Get contestFilter
   * @return contestFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTEST_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContestFilter getContestFilter() {
    return contestFilter;
  }


  @JsonProperty(JSON_PROPERTY_CONTEST_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContestFilter(ContestFilter contestFilter) {
    this.contestFilter = contestFilter;
  }


  /**
   * Return true if this ContestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestRequest contestRequest = (ContestRequest) o;
    return Objects.equals(this.contestFilter, contestRequest.contestFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contestFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestRequest {\n");
    sb.append("    contestFilter: ").append(toIndentedString(contestFilter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

