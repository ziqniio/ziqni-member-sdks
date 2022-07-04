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
import com.ziqni.member.sdk.model.DependantOn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Dependancy
 */
@JsonPropertyOrder({
  Dependancy.JSON_PROPERTY_ENTITY_TYPE,
  Dependancy.JSON_PROPERTY_DEPENDANT_ON
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dependancy {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_DEPENDANT_ON = "dependantOn";
  private DependantOn dependantOn;

  public Dependancy() { 
  }

  public Dependancy entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * A model that will have dependancies implemented
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Members", value = "A model that will have dependancies implemented")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public Dependancy dependantOn(DependantOn dependantOn) {
    this.dependantOn = dependantOn;
    return this;
  }

   /**
   * Get dependantOn
   * @return dependantOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DependantOn getDependantOn() {
    return dependantOn;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDependantOn(DependantOn dependantOn) {
    this.dependantOn = dependantOn;
  }


  /**
   * Return true if this Dependancy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependancy dependancy = (Dependancy) o;
    return Objects.equals(this.entityType, dependancy.entityType) &&
        Objects.equals(this.dependantOn, dependancy.dependantOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, dependantOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependancy {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    dependantOn: ").append(toIndentedString(dependantOn)).append("\n");
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

