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
import com.ziqni.gamification.client.model.MemberType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MemberAllOf
 */
@JsonPropertyOrder({
  MemberAllOf.JSON_PROPERTY_NAME,
  MemberAllOf.JSON_PROPERTY_MEMBER_REF_ID,
  MemberAllOf.JSON_PROPERTY_MEMBER_TYPE,
  MemberAllOf.JSON_PROPERTY_TEAM_MEMBERS,
  MemberAllOf.JSON_PROPERTY_CONSTRAINTS,
  MemberAllOf.JSON_PROPERTY_TIME_ZONE_OFFSET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MEMBER_REF_ID = "memberRefId";
  private String memberRefId;

  public static final String JSON_PROPERTY_MEMBER_TYPE = "memberType";
  private MemberType memberType;

  public static final String JSON_PROPERTY_TEAM_MEMBERS = "teamMembers";
  private List<String> teamMembers = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public static final String JSON_PROPERTY_TIME_ZONE_OFFSET = "timeZoneOffset";
  private String timeZoneOffset;

  public MemberAllOf() { 
  }

  public MemberAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the member that is used on leader boards and public displays
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Player 1", value = "The name of the member that is used on leader boards and public displays")
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


  public MemberAllOf memberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
    return this;
  }

   /**
   * The reference to this member in your system
   * @return memberRefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Player-1", value = "The reference to this member in your system")
  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberRefId() {
    return memberRefId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
  }


  public MemberAllOf memberType(MemberType memberType) {
    this.memberType = memberType;
    return this;
  }

   /**
   * Get memberType
   * @return memberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MemberType getMemberType() {
    return memberType;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberType(MemberType memberType) {
    this.memberType = memberType;
  }


  public MemberAllOf teamMembers(List<String> teamMembers) {
    this.teamMembers = teamMembers;
    return this;
  }

  public MemberAllOf addTeamMembersItem(String teamMembersItem) {
    if (this.teamMembers == null) {
      this.teamMembers = new ArrayList<>();
    }
    this.teamMembers.add(teamMembersItem);
    return this;
  }

   /**
   * A social group like Guilds
   * @return teamMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A social group like Guilds")
  @JsonProperty(JSON_PROPERTY_TEAM_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTeamMembers() {
    return teamMembers;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamMembers(List<String> teamMembers) {
    this.teamMembers = teamMembers;
  }


  public MemberAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public MemberAllOf addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional constraints")
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


  public MemberAllOf timeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * To what time zone teh emmber belongs to
   * @return timeZoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To what time zone teh emmber belongs to")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneOffset() {
    return timeZoneOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  /**
   * Return true if this Member_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberAllOf memberAllOf = (MemberAllOf) o;
    return Objects.equals(this.name, memberAllOf.name) &&
        Objects.equals(this.memberRefId, memberAllOf.memberRefId) &&
        Objects.equals(this.memberType, memberAllOf.memberType) &&
        Objects.equals(this.teamMembers, memberAllOf.teamMembers) &&
        Objects.equals(this.constraints, memberAllOf.constraints) &&
        Objects.equals(this.timeZoneOffset, memberAllOf.timeZoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, memberRefId, memberType, teamMembers, constraints, timeZoneOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberRefId: ").append(toIndentedString(memberRefId)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    teamMembers: ").append(toIndentedString(teamMembers)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
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

