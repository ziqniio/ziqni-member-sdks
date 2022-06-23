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
  ProductReduced.JSON_PROPERTY_NAME,
  ProductReduced.JSON_PROPERTY_PRODUCT_REF_ID,
  ProductReduced.JSON_PROPERTY_TAGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductReduced {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_REF_ID = "productRefId";
  private String productRefId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ProductReduced() { 
  }

  public ProductReduced name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hockey madness", value = "The name of the product")
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


  public ProductReduced productRefId(String productRefId) {
    this.productRefId = productRefId;
    return this;
  }

   /**
   * The reference to this product in your system. The reference identifier can not be changed after the product has been created
   * @return productRefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hockey-madness", value = "The reference to this product in your system. The reference identifier can not be changed after the product has been created")
  @JsonProperty(JSON_PROPERTY_PRODUCT_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductRefId() {
    return productRefId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductRefId(String productRefId) {
    this.productRefId = productRefId;
  }


  public ProductReduced tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ProductReduced addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of Strings used to tag products with taxonomy terms
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Strings used to tag products with taxonomy terms")
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


  /**
   * Return true if this ProductReduced object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReduced productReduced = (ProductReduced) o;
    return Objects.equals(this.name, productReduced.name) &&
        Objects.equals(this.productRefId, productReduced.productRefId) &&
        Objects.equals(this.tags, productReduced.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, productRefId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReduced {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productRefId: ").append(toIndentedString(productRefId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

