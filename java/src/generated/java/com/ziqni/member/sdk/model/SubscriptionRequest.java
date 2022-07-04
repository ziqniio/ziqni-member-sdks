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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  SubscriptionRequest.JSON_PROPERTY_ENTITY_TYPE,
  SubscriptionRequest.JSON_PROPERTY_CONSTRAINTS,
  SubscriptionRequest.JSON_PROPERTY_CALLBACK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionRequest {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public static final String JSON_PROPERTY_CALLBACK = "callback";
  private JsonNullable<Object> callback = JsonNullable.<Object>of(null);

  public SubscriptionRequest() { 
  }

  public SubscriptionRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * What you are subscribing to, like Competition, Contest, Member, Award etc.
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "What you are subscribing to, like Competition, Contest, Member, Award etc.")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public SubscriptionRequest constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public SubscriptionRequest addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraints of this subscription.
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Constraints of this subscription.")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  public SubscriptionRequest callback(Object callback) {
    this.callback = JsonNullable.<Object>of(callback);
    return this;
  }

   /**
   * The operation you are subscribing too. Like entityChanged or entityStateChanged
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The operation you are subscribing too. Like entityChanged or entityStateChanged")
  @JsonIgnore

  public Object getCallback() {
        return callback.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCallback_JsonNullable() {
    return callback;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLBACK)
  public void setCallback_JsonNullable(JsonNullable<Object> callback) {
    this.callback = callback;
  }

  public void setCallback(Object callback) {
    this.callback = JsonNullable.<Object>of(callback);
  }


  /**
   * Return true if this SubscriptionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.entityType, subscriptionRequest.entityType) &&
        Objects.equals(this.constraints, subscriptionRequest.constraints) &&
        equalsNullable(this.callback, subscriptionRequest.callback);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, constraints, hashCodeNullable(callback));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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

