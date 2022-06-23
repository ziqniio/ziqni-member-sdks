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
import com.ziqni.gamification.client.model.Dependancy;
import com.ziqni.gamification.client.model.Scheduling;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AchievementAllOf
 */
@JsonPropertyOrder({
  AchievementAllOf.JSON_PROPERTY_NAME,
  AchievementAllOf.JSON_PROPERTY_DESCRIPTION,
  AchievementAllOf.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  AchievementAllOf.JSON_PROPERTY_CONSTRAINTS,
  AchievementAllOf.JSON_PROPERTY_MAX_NUMBER_OF_ISSUES,
  AchievementAllOf.JSON_PROPERTY_SCHEDULING,
  AchievementAllOf.JSON_PROPERTY_DEPENDANT_ON,
  AchievementAllOf.JSON_PROPERTY_STATUS,
  AchievementAllOf.JSON_PROPERTY_STATUS_CODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AchievementAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TERMS_AND_CONDITIONS = "termsAndConditions";
  private String termsAndConditions;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_ISSUES = "maxNumberOfIssues";
  private Integer maxNumberOfIssues;

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private Scheduling scheduling;

  public static final String JSON_PROPERTY_DEPENDANT_ON = "dependantOn";
  private Dependancy dependantOn;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public AchievementAllOf() { 
  }

  public AchievementAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AchievementAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AchievementAllOf termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * 
   * @return termsAndConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TERMS_AND_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsAndConditions() {
    return termsAndConditions;
  }


  @JsonProperty(JSON_PROPERTY_TERMS_AND_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  public AchievementAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public AchievementAllOf addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints, if set means true
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- deprecated - notifyMember - isHidden - optinRequiredForEntrants - expired", value = "Additional constraints, if set means true")
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


  public AchievementAllOf maxNumberOfIssues(Integer maxNumberOfIssues) {
    this.maxNumberOfIssues = maxNumberOfIssues;
    return this;
  }

   /**
   * Maximum number of issued achievements
   * @return maxNumberOfIssues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of issued achievements")
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNumberOfIssues() {
    return maxNumberOfIssues;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxNumberOfIssues(Integer maxNumberOfIssues) {
    this.maxNumberOfIssues = maxNumberOfIssues;
  }


  public AchievementAllOf scheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scheduling getScheduling() {
    return scheduling;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }


  public AchievementAllOf dependantOn(Dependancy dependantOn) {
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

  public Dependancy getDependantOn() {
    return dependantOn;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDependantOn(Dependancy dependantOn) {
    this.dependantOn = dependantOn;
  }


  public AchievementAllOf status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Achievement status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Achievement status")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public AchievementAllOf statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * Return true if this Achievement_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchievementAllOf achievementAllOf = (AchievementAllOf) o;
    return Objects.equals(this.name, achievementAllOf.name) &&
        Objects.equals(this.description, achievementAllOf.description) &&
        Objects.equals(this.termsAndConditions, achievementAllOf.termsAndConditions) &&
        Objects.equals(this.constraints, achievementAllOf.constraints) &&
        Objects.equals(this.maxNumberOfIssues, achievementAllOf.maxNumberOfIssues) &&
        Objects.equals(this.scheduling, achievementAllOf.scheduling) &&
        Objects.equals(this.dependantOn, achievementAllOf.dependantOn) &&
        Objects.equals(this.status, achievementAllOf.status) &&
        Objects.equals(this.statusCode, achievementAllOf.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, termsAndConditions, constraints, maxNumberOfIssues, scheduling, dependantOn, status, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    maxNumberOfIssues: ").append(toIndentedString(maxNumberOfIssues)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    dependantOn: ").append(toIndentedString(dependantOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

