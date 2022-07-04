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
import com.ziqni.member.sdk.model.ContestStatus;
import com.ziqni.member.sdk.model.QuerySortBy;
import com.ziqni.member.sdk.model.RangeQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Filter to trim results from list of Contets
 */
@ApiModel(description = "Filter to trim results from list of Contets")
@JsonPropertyOrder({
  ContestFilter.JSON_PROPERTY_PRODUCT_IDS,
  ContestFilter.JSON_PROPERTY_TAGS,
  ContestFilter.JSON_PROPERTY_START_DATE,
  ContestFilter.JSON_PROPERTY_END_DATE,
  ContestFilter.JSON_PROPERTY_SORT_BY,
  ContestFilter.JSON_PROPERTY_COMPETITION_IDS,
  ContestFilter.JSON_PROPERTY_STATUS,
  ContestFilter.JSON_PROPERTY_SKIP,
  ContestFilter.JSON_PROPERTY_LIMIT,
  ContestFilter.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContestFilter {
  public static final String JSON_PROPERTY_PRODUCT_IDS = "productIds";
  private List<String> productIds = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private RangeQuery startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private RangeQuery endDate;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private QuerySortBy sortBy;

  public static final String JSON_PROPERTY_COMPETITION_IDS = "competitionIds";
  private List<String> competitionIds = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<ContestStatus> status = null;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public ContestFilter() { 
  }

  public ContestFilter productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public ContestFilter addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 
   * @return productIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProductIds() {
    return productIds;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  public ContestFilter tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ContestFilter addTagsItem(String tagsItem) {
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


  public ContestFilter startDate(RangeQuery startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RangeQuery getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(RangeQuery startDate) {
    this.startDate = startDate;
  }


  public ContestFilter endDate(RangeQuery endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RangeQuery getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(RangeQuery endDate) {
    this.endDate = endDate;
  }


  public ContestFilter sortBy(QuerySortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuerySortBy getSortBy() {
    return sortBy;
  }


  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortBy(QuerySortBy sortBy) {
    this.sortBy = sortBy;
  }


  public ContestFilter competitionIds(List<String> competitionIds) {
    this.competitionIds = competitionIds;
    return this;
  }

  public ContestFilter addCompetitionIdsItem(String competitionIdsItem) {
    if (this.competitionIds == null) {
      this.competitionIds = new ArrayList<>();
    }
    this.competitionIds.add(competitionIdsItem);
    return this;
  }

   /**
   * 
   * @return competitionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPETITION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCompetitionIds() {
    return competitionIds;
  }


  @JsonProperty(JSON_PROPERTY_COMPETITION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompetitionIds(List<String> competitionIds) {
    this.competitionIds = competitionIds;
  }


  public ContestFilter status(List<ContestStatus> status) {
    this.status = status;
    return this;
  }

  public ContestFilter addStatusItem(ContestStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ContestStatus> getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<ContestStatus> status) {
    this.status = status;
  }


  public ContestFilter skip(Integer skip) {
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


  public ContestFilter limit(Integer limit) {
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


  public ContestFilter constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ContestFilter addConstraintsItem(String constraintsItem) {
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
   * Return true if this ContestFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestFilter contestFilter = (ContestFilter) o;
    return Objects.equals(this.productIds, contestFilter.productIds) &&
        Objects.equals(this.tags, contestFilter.tags) &&
        Objects.equals(this.startDate, contestFilter.startDate) &&
        Objects.equals(this.endDate, contestFilter.endDate) &&
        Objects.equals(this.sortBy, contestFilter.sortBy) &&
        Objects.equals(this.competitionIds, contestFilter.competitionIds) &&
        Objects.equals(this.status, contestFilter.status) &&
        Objects.equals(this.skip, contestFilter.skip) &&
        Objects.equals(this.limit, contestFilter.limit) &&
        Objects.equals(this.constraints, contestFilter.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds, tags, startDate, endDate, sortBy, competitionIds, status, skip, limit, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestFilter {\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    competitionIds: ").append(toIndentedString(competitionIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
