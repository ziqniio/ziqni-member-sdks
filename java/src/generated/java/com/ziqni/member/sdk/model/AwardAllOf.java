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
import com.ziqni.member.sdk.model.EntityType;
import com.ziqni.member.sdk.model.RewardTypeReduced;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AwardAllOf
 */
@JsonPropertyOrder({
  AwardAllOf.JSON_PROPERTY_MEMBER_ID,
  AwardAllOf.JSON_PROPERTY_REWARD_ID,
  AwardAllOf.JSON_PROPERTY_REWARD_TYPE,
  AwardAllOf.JSON_PROPERTY_REWARD_RANK,
  AwardAllOf.JSON_PROPERTY_REWARD_VALUE,
  AwardAllOf.JSON_PROPERTY_DELAY,
  AwardAllOf.JSON_PROPERTY_ENTITY_TYPE,
  AwardAllOf.JSON_PROPERTY_ENTITY_ID,
  AwardAllOf.JSON_PROPERTY_POINT_IN_TIME,
  AwardAllOf.JSON_PROPERTY_PERIOD,
  AwardAllOf.JSON_PROPERTY_TAGS,
  AwardAllOf.JSON_PROPERTY_METADATA,
  AwardAllOf.JSON_PROPERTY_CONSTRAINTS,
  AwardAllOf.JSON_PROPERTY_CLAIMED_TIMESTAMP
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwardAllOf {
  public static final String JSON_PROPERTY_MEMBER_ID = "memberId";
  private String memberId;

  public static final String JSON_PROPERTY_REWARD_ID = "rewardId";
  private String rewardId;

  public static final String JSON_PROPERTY_REWARD_TYPE = "rewardType";
  private RewardTypeReduced rewardType;

  public static final String JSON_PROPERTY_REWARD_RANK = "rewardRank";
  private String rewardRank;

  public static final String JSON_PROPERTY_REWARD_VALUE = "rewardValue";
  private Double rewardValue;

  public static final String JSON_PROPERTY_DELAY = "delay";
  private Integer delay;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_POINT_IN_TIME = "pointInTime";
  private OffsetDateTime pointInTime;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private Integer period;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public static final String JSON_PROPERTY_CLAIMED_TIMESTAMP = "claimedTimestamp";
  private OffsetDateTime claimedTimestamp;

  public AwardAllOf() { 
  }

  public AwardAllOf memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * A unique identifier of a Member
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "A unique identifier of a Member")
  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberId() {
    return memberId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public AwardAllOf rewardId(String rewardId) {
    this.rewardId = rewardId;
    return this;
  }

   /**
   * A unique identifier of a Reward
   * @return rewardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "A unique identifier of a Reward")
  @JsonProperty(JSON_PROPERTY_REWARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRewardId() {
    return rewardId;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardId(String rewardId) {
    this.rewardId = rewardId;
  }


  public AwardAllOf rewardType(RewardTypeReduced rewardType) {
    this.rewardType = rewardType;
    return this;
  }

   /**
   * Get rewardType
   * @return rewardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REWARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RewardTypeReduced getRewardType() {
    return rewardType;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardType(RewardTypeReduced rewardType) {
    this.rewardType = rewardType;
  }


  public AwardAllOf rewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
    return this;
  }

   /**
   * If used in the context of contest this will associate with the rank of the leaderboard
   * @return rewardRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "If used in the context of contest this will associate with the rank of the leaderboard")
  @JsonProperty(JSON_PROPERTY_REWARD_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRewardRank() {
    return rewardRank;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
  }


  public AwardAllOf rewardValue(Double rewardValue) {
    this.rewardValue = rewardValue;
    return this;
  }

   /**
   * Numerical value of the reward that will be issued based on the reward type
   * @return rewardValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Numerical value of the reward that will be issued based on the reward type")
  @JsonProperty(JSON_PROPERTY_REWARD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRewardValue() {
    return rewardValue;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardValue(Double rewardValue) {
    this.rewardValue = rewardValue;
  }


  public AwardAllOf delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * Delay of issuing a reward in minutes
   * @return delay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Delay of issuing a reward in minutes")
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDelay() {
    return delay;
  }


  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelay(Integer delay) {
    this.delay = delay;
  }


  public AwardAllOf entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public AwardAllOf entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The Id of the contest or achievement related to this Award. Dependant on entityType
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "The Id of the contest or achievement related to this Award. Dependant on entityType")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public AwardAllOf pointInTime(OffsetDateTime pointInTime) {
    this.pointInTime = pointInTime;
    return this;
  }

   /**
   * ISO8601 timestamp for when an Award is available until a specific point in time. All records are stored in UTC time zone. * There can only be one time definition used for claim period either \&quot;pointInTime\&quot; or \&quot;period\&quot;
   * @return pointInTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when an Award is available until a specific point in time. All records are stored in UTC time zone. * There can only be one time definition used for claim period either \"pointInTime\" or \"period\"")
  @JsonProperty(JSON_PROPERTY_POINT_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPointInTime() {
    return pointInTime;
  }


  @JsonProperty(JSON_PROPERTY_POINT_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointInTime(OffsetDateTime pointInTime) {
    this.pointInTime = pointInTime;
  }


  public AwardAllOf period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Claimable duration in minutes, this value will set the controls until when the award is claimable. * There can only be one time definition used for claim period either \&quot;pointInTime\&quot; or \&quot;period\&quot;
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Claimable duration in minutes, this value will set the controls until when the award is claimable. * There can only be one time definition used for claim period either \"pointInTime\" or \"period\"")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(Integer period) {
    this.period = period;
  }


  public AwardAllOf tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AwardAllOf addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of Strings of groups that the reward belongs to.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Strings of groups that the reward belongs to.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public AwardAllOf metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public AwardAllOf putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public AwardAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public AwardAllOf addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints, if the value is present it means the
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- memberAcknowledgmentRequired - claimed", value = "Additional constraints, if the value is present it means the")
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


  public AwardAllOf claimedTimestamp(OffsetDateTime claimedTimestamp) {
    this.claimedTimestamp = claimedTimestamp;
    return this;
  }

   /**
   * ISO8601 timestamp for when an Award is claimed. All records are stored in UTC time zone. *
   * @return claimedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when an Award is claimed. All records are stored in UTC time zone. *")
  @JsonProperty(JSON_PROPERTY_CLAIMED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getClaimedTimestamp() {
    return claimedTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_CLAIMED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClaimedTimestamp(OffsetDateTime claimedTimestamp) {
    this.claimedTimestamp = claimedTimestamp;
  }


  /**
   * Return true if this Award_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardAllOf awardAllOf = (AwardAllOf) o;
    return Objects.equals(this.memberId, awardAllOf.memberId) &&
        Objects.equals(this.rewardId, awardAllOf.rewardId) &&
        Objects.equals(this.rewardType, awardAllOf.rewardType) &&
        Objects.equals(this.rewardRank, awardAllOf.rewardRank) &&
        Objects.equals(this.rewardValue, awardAllOf.rewardValue) &&
        Objects.equals(this.delay, awardAllOf.delay) &&
        Objects.equals(this.entityType, awardAllOf.entityType) &&
        Objects.equals(this.entityId, awardAllOf.entityId) &&
        Objects.equals(this.pointInTime, awardAllOf.pointInTime) &&
        Objects.equals(this.period, awardAllOf.period) &&
        Objects.equals(this.tags, awardAllOf.tags) &&
        Objects.equals(this.metadata, awardAllOf.metadata) &&
        Objects.equals(this.constraints, awardAllOf.constraints) &&
        Objects.equals(this.claimedTimestamp, awardAllOf.claimedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, rewardId, rewardType, rewardRank, rewardValue, delay, entityType, entityId, pointInTime, period, tags, metadata, constraints, claimedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardAllOf {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    rewardId: ").append(toIndentedString(rewardId)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
    sb.append("    rewardRank: ").append(toIndentedString(rewardRank)).append("\n");
    sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    pointInTime: ").append(toIndentedString(pointInTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    claimedTimestamp: ").append(toIndentedString(claimedTimestamp)).append("\n");
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

