
package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.EmploymentVerificationSandbox.client.model.AckEmploymentVerification;
import java.util.UUID;

@ApiModel(description = "Acknowledge of an employment verification process.")



public class AckEVRequest extends AckEmploymentVerification {
  @SerializedName("employmentVerificationRequestId")
  private UUID employmentVerificationRequestId = null;

  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;

  @SerializedName("inquiryId")
  private UUID inquiryId = null;

  public AckEVRequest employmentVerificationRequestId(UUID employmentVerificationRequestId) {
    this.employmentVerificationRequestId = employmentVerificationRequestId;
    return this;
  }


  @ApiModelProperty(example = "391d151f-1cac-44e7-a05b-79a1199621d6", value = "The identifier of the employment verification request given by the API consumer (UUID).")
  public UUID getEmploymentVerificationRequestId() {
    return employmentVerificationRequestId;
  }

  public void setEmploymentVerificationRequestId(UUID employmentVerificationRequestId) {
    this.employmentVerificationRequestId = employmentVerificationRequestId;
  }

  public AckEVRequest subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  
  @ApiModelProperty(example = "7c8a0230-36e0-43f4-9b7a-581dc55ea9c3", value = "The API Hub event subscription identifier (UUID).")
  public UUID getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  
  @ApiModelProperty(example = "a19fb6b8-2677-44f2-9cd7-3b2f78bb6f8c", value = "The employment verification process identifier given by Círculo de Crédito.")
  public UUID getInquiryId() {
    return inquiryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckEVRequest ackEVRequest = (AckEVRequest) o;
    return Objects.equals(this.employmentVerificationRequestId, ackEVRequest.employmentVerificationRequestId) &&
        Objects.equals(this.subscriptionId, ackEVRequest.subscriptionId) &&
        Objects.equals(this.inquiryId, ackEVRequest.inquiryId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentVerificationRequestId, subscriptionId, inquiryId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckEVRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employmentVerificationRequestId: ").append(toIndentedString(employmentVerificationRequestId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
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

