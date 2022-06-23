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
import com.ziqni.gamification.client.model.QuerySortBy;
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
  LeaderboardFilter.JSON_PROPERTY_TAGS,
  LeaderboardFilter.JSON_PROPERTY_SORT_BY,
  LeaderboardFilter.JSON_PROPERTY_SKIP,
  LeaderboardFilter.JSON_PROPERTY_LIMIT,
  LeaderboardFilter.JSON_PROPERTY_STATUS_CODE,
  LeaderboardFilter.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LeaderboardFilter {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private List<QuerySortBy> sortBy = null;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private List<Integer> statusCode = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public LeaderboardFilter() { 
  }

  public LeaderboardFilter tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LeaderboardFilter addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public LeaderboardFilter sortBy(List<QuerySortBy> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public LeaderboardFilter addSortByItem(QuerySortBy sortByItem) {
    if (this.sortBy == null) {
      this.sortBy = new ArrayList<>();
    }
    this.sortBy.add(sortByItem);
    return this;
  }

   /**
   * 
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuerySortBy> getSortBy() {
    return sortBy;
  }


  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortBy(List<QuerySortBy> sortBy) {
    this.sortBy = sortBy;
  }


  public LeaderboardFilter skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * 
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkip() {
    return skip;
  }


  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public LeaderboardFilter limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * 
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public LeaderboardFilter statusCode(List<Integer> statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public LeaderboardFilter addStatusCodeItem(Integer statusCodeItem) {
    if (this.statusCode == null) {
      this.statusCode = new ArrayList<>();
    }
    this.statusCode.add(statusCodeItem);
    return this;
  }

   /**
   * Achievement status code
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Achievement status code")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(List<Integer> statusCode) {
    this.statusCode = statusCode;
  }


  public LeaderboardFilter constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public LeaderboardFilter addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Specify the constraints that need to be applied to the filter.
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- hasTranslations - hasRewards - hasRules - optinRequired", value = "Specify the constraints that need to be applied to the filter.")
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


  /**
   * Return true if this LeaderboardFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardFilter leaderboardFilter = (LeaderboardFilter) o;
    return Objects.equals(this.tags, leaderboardFilter.tags) &&
        Objects.equals(this.sortBy, leaderboardFilter.sortBy) &&
        Objects.equals(this.skip, leaderboardFilter.skip) &&
        Objects.equals(this.limit, leaderboardFilter.limit) &&
        Objects.equals(this.statusCode, leaderboardFilter.statusCode) &&
        Objects.equals(this.constraints, leaderboardFilter.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, sortBy, skip, limit, statusCode, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardFilter {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

