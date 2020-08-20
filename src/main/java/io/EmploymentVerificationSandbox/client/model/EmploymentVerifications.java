package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerification;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "A list of employment verification processes.")



public class EmploymentVerifications extends ArrayList<EmploymentVerification> {
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentVerifications {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
