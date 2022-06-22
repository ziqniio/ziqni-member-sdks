/*
 * Ziqni Gamification Cloud API
 * This is the gamification cloud for Ziqni
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  MessageRequest.JSON_PROPERTY_MEMBER_REF_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessageRequest {
  public static final String JSON_PROPERTY_MEMBER_REF_ID = "memberRefId";
  private String memberRefId;

  public MessageRequest() { 
  }

  public MessageRequest memberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
    return this;
  }

   /**
   * 
   * @return memberRefId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberRefId() {
    return memberRefId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
  }


  /**
   * Return true if this MessageRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRequest messageRequest = (MessageRequest) o;
    return Objects.equals(this.memberRefId, messageRequest.memberRefId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberRefId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequest {\n");
    sb.append("    memberRefId: ").append(toIndentedString(memberRefId)).append("\n");
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

