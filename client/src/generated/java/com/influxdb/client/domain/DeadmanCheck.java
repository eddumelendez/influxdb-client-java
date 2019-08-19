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
import com.influxdb.client.domain.CheckBase;
import com.influxdb.client.domain.CheckBaseTags;
import com.influxdb.client.domain.CheckStatusLevel;
import com.influxdb.client.domain.DashboardQuery;
import com.influxdb.client.domain.Label;
import com.influxdb.client.domain.TaskStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * DeadmanCheck
 */

public class DeadmanCheck extends Check {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DEADMAN("deadman");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.DEADMAN;

  public static final String SERIALIZED_NAME_TIME_SINCE = "timeSince";
  @SerializedName(SERIALIZED_NAME_TIME_SINCE)
  private Integer timeSince;

  public static final String SERIALIZED_NAME_REPORT_ZERO = "reportZero";
  @SerializedName(SERIALIZED_NAME_REPORT_ZERO)
  private Boolean reportZero;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private CheckStatusLevel level = null;

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public DeadmanCheck timeSince(Integer timeSince) {
    this.timeSince = timeSince;
    return this;
  }

   /**
   * seconds before deadman triggers
   * @return timeSince
  **/
  @ApiModelProperty(value = "seconds before deadman triggers")
  public Integer getTimeSince() {
    return timeSince;
  }

  public void setTimeSince(Integer timeSince) {
    this.timeSince = timeSince;
  }

  public DeadmanCheck reportZero(Boolean reportZero) {
    this.reportZero = reportZero;
    return this;
  }

   /**
   * if only zero values reported since time, trigger alert
   * @return reportZero
  **/
  @ApiModelProperty(value = "if only zero values reported since time, trigger alert")
  public Boolean getReportZero() {
    return reportZero;
  }

  public void setReportZero(Boolean reportZero) {
    this.reportZero = reportZero;
  }

  public DeadmanCheck level(CheckStatusLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public CheckStatusLevel getLevel() {
    return level;
  }

  public void setLevel(CheckStatusLevel level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeadmanCheck deadmanCheck = (DeadmanCheck) o;
    return Objects.equals(this.type, deadmanCheck.type) &&
        Objects.equals(this.timeSince, deadmanCheck.timeSince) &&
        Objects.equals(this.reportZero, deadmanCheck.reportZero) &&
        Objects.equals(this.level, deadmanCheck.level) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, timeSince, reportZero, level, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeadmanCheck {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeSince: ").append(toIndentedString(timeSince)).append("\n");
    sb.append("    reportZero: ").append(toIndentedString(reportZero)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
