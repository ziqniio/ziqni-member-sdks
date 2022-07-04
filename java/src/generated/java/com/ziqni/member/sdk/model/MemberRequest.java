/*
 * Ziqni Member API
 * The ZIQNI Member-API is the primary resource used to build services and widgets for your members [customers, players, patients, etc]. The service is Stomp websokets with SOCK.js even though the system is decribed using OpenApi schema for convenience.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.member.sdk.model;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  MemberRequest.JSON_PROPERTY_INCLUDE_FIELDS,
  MemberRequest.JSON_PROPERTY_INCLUDE_CUSTOM_FIELDS,
  MemberRequest.JSON_PROPERTY_INCLUDE_META_DATA_FIELDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberRequest {
  public static final String JSON_PROPERTY_INCLUDE_FIELDS = "includeFields";
  private List<String> includeFields = null;

  public static final String JSON_PROPERTY_INCLUDE_CUSTOM_FIELDS = "includeCustomFields";
  private List<String> includeCustomFields = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDE_META_DATA_FIELDS = "includeMetaDataFields";
  private List<String> includeMetaDataFields = null;

  public MemberRequest() { 
  }

  public MemberRequest includeFields(List<String> includeFields) {
    this.includeFields = includeFields;
    return this;
  }

  public MemberRequest addIncludeFieldsItem(String includeFieldsItem) {
    if (this.includeFields == null) {
      this.includeFields = new ArrayList<>();
    }
    this.includeFields.add(includeFieldsItem);
    return this;
  }

   /**
   * ALL, or else the name of the top level fields you want to include
   * @return includeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ALL, or else the name of the top level fields you want to include")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIncludeFields() {
    return includeFields;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
  }


  public MemberRequest includeCustomFields(List<String> includeCustomFields) {
    this.includeCustomFields = includeCustomFields;
    return this;
  }

  public MemberRequest addIncludeCustomFieldsItem(String includeCustomFieldsItem) {
    this.includeCustomFields.add(includeCustomFieldsItem);
    return this;
  }

   /**
   * Only include custom fields that have these keys
   * @return includeCustomFields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Only include custom fields that have these keys")
  @JsonProperty(JSON_PROPERTY_INCLUDE_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIncludeCustomFields() {
    return includeCustomFields;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeCustomFields(List<String> includeCustomFields) {
    this.includeCustomFields = includeCustomFields;
  }


  public MemberRequest includeMetaDataFields(List<String> includeMetaDataFields) {
    this.includeMetaDataFields = includeMetaDataFields;
    return this;
  }

  public MemberRequest addIncludeMetaDataFieldsItem(String includeMetaDataFieldsItem) {
    if (this.includeMetaDataFields == null) {
      this.includeMetaDataFields = new ArrayList<>();
    }
    this.includeMetaDataFields.add(includeMetaDataFieldsItem);
    return this;
  }

   /**
   * Only include metadata that have these keys
   * @return includeMetaDataFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include metadata that have these keys")
  @JsonProperty(JSON_PROPERTY_INCLUDE_META_DATA_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIncludeMetaDataFields() {
    return includeMetaDataFields;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_META_DATA_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeMetaDataFields(List<String> includeMetaDataFields) {
    this.includeMetaDataFields = includeMetaDataFields;
  }


  /**
   * Return true if this MemberRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberRequest memberRequest = (MemberRequest) o;
    return Objects.equals(this.includeFields, memberRequest.includeFields) &&
        Objects.equals(this.includeCustomFields, memberRequest.includeCustomFields) &&
        Objects.equals(this.includeMetaDataFields, memberRequest.includeMetaDataFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeFields, includeCustomFields, includeMetaDataFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberRequest {\n");
    sb.append("    includeFields: ").append(toIndentedString(includeFields)).append("\n");
    sb.append("    includeCustomFields: ").append(toIndentedString(includeCustomFields)).append("\n");
    sb.append("    includeMetaDataFields: ").append(toIndentedString(includeMetaDataFields)).append("\n");
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

