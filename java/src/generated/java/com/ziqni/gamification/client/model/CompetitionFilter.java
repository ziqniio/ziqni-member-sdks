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
import com.ziqni.gamification.client.model.CompetitionStatus;
import com.ziqni.gamification.client.model.CompetitionType;
import com.ziqni.gamification.client.model.QuerySortBy;
import com.ziqni.gamification.client.model.RangeQuery;
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
  CompetitionFilter.JSON_PROPERTY_TAGS,
  CompetitionFilter.JSON_PROPERTY_START_DATE,
  CompetitionFilter.JSON_PROPERTY_END_DATE,
  CompetitionFilter.JSON_PROPERTY_PRODUCT_IDS,
  CompetitionFilter.JSON_PROPERTY_STATUS,
  CompetitionFilter.JSON_PROPERTY_COMPETITION_TYPE,
  CompetitionFilter.JSON_PROPERTY_SORT_BY,
  CompetitionFilter.JSON_PROPERTY_IDS,
  CompetitionFilter.JSON_PROPERTY_SKIP,
  CompetitionFilter.JSON_PROPERTY_LIMIT,
  CompetitionFilter.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompetitionFilter {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private RangeQuery startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private RangeQuery endDate;

  public static final String JSON_PROPERTY_PRODUCT_IDS = "productIds";
  private List<String> productIds = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<CompetitionStatus> status = null;

  public static final String JSON_PROPERTY_COMPETITION_TYPE = "competitionType";
  private List<CompetitionType> competitionType = null;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private List<QuerySortBy> sortBy = null;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<String> ids = null;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public CompetitionFilter() { 
  }

  public CompetitionFilter tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CompetitionFilter addTagsItem(String tagsItem) {
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


  public CompetitionFilter startDate(RangeQuery startDate) {
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


  public CompetitionFilter endDate(RangeQuery endDate) {
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


  public CompetitionFilter productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public CompetitionFilter addProductIdsItem(String productIdsItem) {
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


  public CompetitionFilter status(List<CompetitionStatus> status) {
    this.status = status;
    return this;
  }

  public CompetitionFilter addStatusItem(CompetitionStatus statusItem) {
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

  public List<CompetitionStatus> getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<CompetitionStatus> status) {
    this.status = status;
  }


  public CompetitionFilter competitionType(List<CompetitionType> competitionType) {
    this.competitionType = competitionType;
    return this;
  }

  public CompetitionFilter addCompetitionTypeItem(CompetitionType competitionTypeItem) {
    if (this.competitionType == null) {
      this.competitionType = new ArrayList<>();
    }
    this.competitionType.add(competitionTypeItem);
    return this;
  }

   /**
   * 
   * @return competitionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")
  @JsonProperty(JSON_PROPERTY_COMPETITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CompetitionType> getCompetitionType() {
    return competitionType;
  }


  @JsonProperty(JSON_PROPERTY_COMPETITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompetitionType(List<CompetitionType> competitionType) {
    this.competitionType = competitionType;
  }


  public CompetitionFilter sortBy(List<QuerySortBy> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public CompetitionFilter addSortByItem(QuerySortBy sortByItem) {
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


  public CompetitionFilter ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public CompetitionFilter addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public CompetitionFilter skip(Integer skip) {
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


  public CompetitionFilter limit(Integer limit) {
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


  public CompetitionFilter constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public CompetitionFilter addConstraintsItem(String constraintsItem) {
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
   * Return true if this CompetitionFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitionFilter competitionFilter = (CompetitionFilter) o;
    return Objects.equals(this.tags, competitionFilter.tags) &&
        Objects.equals(this.startDate, competitionFilter.startDate) &&
        Objects.equals(this.endDate, competitionFilter.endDate) &&
        Objects.equals(this.productIds, competitionFilter.productIds) &&
        Objects.equals(this.status, competitionFilter.status) &&
        Objects.equals(this.competitionType, competitionFilter.competitionType) &&
        Objects.equals(this.sortBy, competitionFilter.sortBy) &&
        Objects.equals(this.ids, competitionFilter.ids) &&
        Objects.equals(this.skip, competitionFilter.skip) &&
        Objects.equals(this.limit, competitionFilter.limit) &&
        Objects.equals(this.constraints, competitionFilter.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, startDate, endDate, productIds, status, competitionType, sortBy, ids, skip, limit, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionFilter {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    competitionType: ").append(toIndentedString(competitionType)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

