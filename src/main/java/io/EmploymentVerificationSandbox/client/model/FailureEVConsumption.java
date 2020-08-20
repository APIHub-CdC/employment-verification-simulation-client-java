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
import io.EmploymentVerificationSandbox.client.model.AgregationErrors;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerification;
import java.io.IOException;
@ApiModel(description = "Information about a failed employment verification process.")



public class FailureEVConsumption {
  @SerializedName("request")
  private EmploymentVerification request = null;
  @SerializedName("errors")
  private AgregationErrors errors = null;
  public FailureEVConsumption request(EmploymentVerification request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public EmploymentVerification getRequest() {
    return request;
  }
  public void setRequest(EmploymentVerification request) {
    this.request = request;
  }
  public FailureEVConsumption errors(AgregationErrors errors) {
    this.errors = errors;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AgregationErrors getErrors() {
    return errors;
  }
  public void setErrors(AgregationErrors errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureEVConsumption failureEVConsumption = (FailureEVConsumption) o;
    return Objects.equals(this.request, failureEVConsumption.request) &&
        Objects.equals(this.errors, failureEVConsumption.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureEVConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
