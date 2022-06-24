/*
 * InfluxDB OSS API Service
 * The InfluxDB v2 API provides a programmatic interface for all interactions with InfluxDB. Access the InfluxDB API using the `/api/v2/` endpoint. 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.VariableProperties;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * TemplateSummaryDiffVariablesNewOld
 */

public class TemplateSummaryDiffVariablesNewOld {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  @JsonAdapter(TemplateSummary_Diff_variables_new_oldArgsAdapter.class)
  private VariableProperties args = null;

  public TemplateSummaryDiffVariablesNewOld name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateSummaryDiffVariablesNewOld description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TemplateSummaryDiffVariablesNewOld args(VariableProperties args) {
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  public VariableProperties getArgs() {
    return args;
  }

  public void setArgs(VariableProperties args) {
    this.args = args;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSummaryDiffVariablesNewOld templateSummaryDiffVariablesNewOld = (TemplateSummaryDiffVariablesNewOld) o;
    return Objects.equals(this.name, templateSummaryDiffVariablesNewOld.name) &&
        Objects.equals(this.description, templateSummaryDiffVariablesNewOld.description) &&
        Objects.equals(this.args, templateSummaryDiffVariablesNewOld.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, args);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSummaryDiffVariablesNewOld {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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

  public static class TemplateSummary_Diff_variables_new_oldArgsAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public TemplateSummary_Diff_variables_new_oldArgsAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      JsonObject jsonObject = json.getAsJsonObject();

      String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

      return deserialize(types, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "query" }, types)) {
        return context.deserialize(json, QueryVariableProperties.class);
      }
      if (Arrays.equals(new String[]{ "constant" }, types)) {
        return context.deserialize(json, ConstantVariableProperties.class);
      }
      if (Arrays.equals(new String[]{ "map" }, types)) {
        return context.deserialize(json, MapVariableProperties.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}
