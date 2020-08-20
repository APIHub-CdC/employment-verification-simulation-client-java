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
import io.EmploymentVerificationSandbox.client.model.EmploymentVerifications;
import io.EmploymentVerificationSandbox.client.model.Metadata;
import java.io.IOException;
@ApiModel(description = "Metadata (paging information) of the list of employment verification processes.")



public class EmploymentVerificationMetadata {
  @SerializedName("_metadata")
  private Metadata metadata = null;
  @SerializedName("inquiries")
  private EmploymentVerifications inquiries = null;
  public EmploymentVerificationMetadata metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Metadata getMetadata() {
    return metadata;
  }
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }
  public EmploymentVerificationMetadata inquiries(EmploymentVerifications inquiries) {
    this.inquiries = inquiries;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public EmploymentVerifications getInquiries() {
    return inquiries;
  }
  public void setInquiries(EmploymentVerifications inquiries) {
    this.inquiries = inquiries;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentVerificationMetadata employmentVerificationMetadata = (EmploymentVerificationMetadata) o;
    return Objects.equals(this.metadata, employmentVerificationMetadata.metadata) &&
        Objects.equals(this.inquiries, employmentVerificationMetadata.inquiries);
  }
  @Override
  public int hashCode() {
    return Objects.hash(metadata, inquiries);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentVerificationMetadata {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
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
