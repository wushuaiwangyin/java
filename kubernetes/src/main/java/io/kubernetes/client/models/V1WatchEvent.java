/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.RuntimeRawExtension;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Event represents a single event to a watched resource.
 */
@ApiModel(description = "Event represents a single event to a watched resource.")

public class V1WatchEvent {
  @SerializedName("object")
  private RuntimeRawExtension object = null;

  @SerializedName("type")
  private String type = null;

  public V1WatchEvent object(RuntimeRawExtension object) {
    this.object = object;
    return this;
  }

   /**
   * Object is:  * If Type is Added or Modified: the new state of the object.  * If Type is Deleted: the state of the object immediately before deletion.  * If Type is Error: *Status is recommended; other types may make sense    depending on context.
   * @return object
  **/
  @ApiModelProperty(example = "null", required = true, value = "Object is:  * If Type is Added or Modified: the new state of the object.  * If Type is Deleted: the state of the object immediately before deletion.  * If Type is Error: *Status is recommended; other types may make sense    depending on context.")
  public RuntimeRawExtension getObject() {
    return object;
  }

  public void setObject(RuntimeRawExtension object) {
    this.object = object;
  }

  public V1WatchEvent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WatchEvent v1WatchEvent = (V1WatchEvent) o;
    return Objects.equals(this.object, v1WatchEvent.object) &&
        Objects.equals(this.type, v1WatchEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WatchEvent {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

