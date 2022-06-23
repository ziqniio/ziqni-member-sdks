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
  QueryMultipleFields.JSON_PROPERTY_QUERY_FIELDS,
  QueryMultipleFields.JSON_PROPERTY_QUERY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryMultipleFields {
  public static final String JSON_PROPERTY_QUERY_FIELDS = "queryFields";
  private List<String> queryFields = null;

  public static final String JSON_PROPERTY_QUERY_VALUE = "queryValue";
  private String queryValue;

  public QueryMultipleFields() { 
  }

  public QueryMultipleFields queryFields(List<String> queryFields) {
    this.queryFields = queryFields;
    return this;
  }

  public QueryMultipleFields addQueryFieldsItem(String queryFieldsItem) {
    if (this.queryFields == null) {
      this.queryFields = new ArrayList<>();
    }
    this.queryFields.add(queryFieldsItem);
    return this;
  }

   /**
   * Multiple fields to be included in search for the given value.
   * @return queryFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Multiple fields to be included in search for the given value.")
  @JsonProperty(JSON_PROPERTY_QUERY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getQueryFields() {
    return queryFields;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryFields(List<String> queryFields) {
    this.queryFields = queryFields;
  }


  public QueryMultipleFields queryValue(String queryValue) {
    this.queryValue = queryValue;
    return this;
  }

   /**
   * The value to search for across given fields.
   * @return queryValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value to search for across given fields.")
  @JsonProperty(JSON_PROPERTY_QUERY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQueryValue() {
    return queryValue;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryValue(String queryValue) {
    this.queryValue = queryValue;
  }


  /**
   * Return true if this QueryMultipleFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryMultipleFields queryMultipleFields = (QueryMultipleFields) o;
    return Objects.equals(this.queryFields, queryMultipleFields.queryFields) &&
        Objects.equals(this.queryValue, queryMultipleFields.queryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryFields, queryValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMultipleFields {\n");
    sb.append("    queryFields: ").append(toIndentedString(queryFields)).append("\n");
    sb.append("    queryValue: ").append(toIndentedString(queryValue)).append("\n");
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

