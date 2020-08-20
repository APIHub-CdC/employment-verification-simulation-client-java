package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
@ApiModel(description = "Error")



public class AgregationError {
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;
  public AgregationError code(String code) {
    this.code = code;
    return this;
  }
   
  @ApiModelProperty(example = "E001", value = "Error code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public AgregationError message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "External data source not available.", value = "Descriptive and human-readable error message.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgregationError agregationError = (AgregationError) o;
    return Objects.equals(this.code, agregationError.code) &&
        Objects.equals(this.message, agregationError.message);
  }
  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgregationError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
