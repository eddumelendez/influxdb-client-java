/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.PkgCreateResources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PkgCreate
 */

public class PkgCreate {
  public static final String SERIALIZED_NAME_PKG_NAME = "pkgName";
  @SerializedName(SERIALIZED_NAME_PKG_NAME)
  private String pkgName;

  public static final String SERIALIZED_NAME_PKG_DESCRIPTION = "pkgDescription";
  @SerializedName(SERIALIZED_NAME_PKG_DESCRIPTION)
  private String pkgDescription;

  public static final String SERIALIZED_NAME_PKG_VERSION = "pkgVersion";
  @SerializedName(SERIALIZED_NAME_PKG_VERSION)
  private String pkgVersion;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private PkgCreateResources resources = null;

  public PkgCreate pkgName(String pkgName) {
    this.pkgName = pkgName;
    return this;
  }

   /**
   * Get pkgName
   * @return pkgName
  **/
  @ApiModelProperty(value = "")
  public String getPkgName() {
    return pkgName;
  }

  public void setPkgName(String pkgName) {
    this.pkgName = pkgName;
  }

  public PkgCreate pkgDescription(String pkgDescription) {
    this.pkgDescription = pkgDescription;
    return this;
  }

   /**
   * Get pkgDescription
   * @return pkgDescription
  **/
  @ApiModelProperty(value = "")
  public String getPkgDescription() {
    return pkgDescription;
  }

  public void setPkgDescription(String pkgDescription) {
    this.pkgDescription = pkgDescription;
  }

  public PkgCreate pkgVersion(String pkgVersion) {
    this.pkgVersion = pkgVersion;
    return this;
  }

   /**
   * Get pkgVersion
   * @return pkgVersion
  **/
  @ApiModelProperty(value = "")
  public String getPkgVersion() {
    return pkgVersion;
  }

  public void setPkgVersion(String pkgVersion) {
    this.pkgVersion = pkgVersion;
  }

  public PkgCreate resources(PkgCreateResources resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public PkgCreateResources getResources() {
    return resources;
  }

  public void setResources(PkgCreateResources resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PkgCreate pkgCreate = (PkgCreate) o;
    return Objects.equals(this.pkgName, pkgCreate.pkgName) &&
        Objects.equals(this.pkgDescription, pkgCreate.pkgDescription) &&
        Objects.equals(this.pkgVersion, pkgCreate.pkgVersion) &&
        Objects.equals(this.resources, pkgCreate.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkgName, pkgDescription, pkgVersion, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PkgCreate {\n");
    sb.append("    pkgName: ").append(toIndentedString(pkgName)).append("\n");
    sb.append("    pkgDescription: ").append(toIndentedString(pkgDescription)).append("\n");
    sb.append("    pkgVersion: ").append(toIndentedString(pkgVersion)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
