package io.EmploymentVerificationSandbox.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Information about a failed employment verification process.")

public class FailureEVConsumption {
	@SerializedName("request")
	private EmploymentVerification request = null;

	@SerializedName("errors")
	private List<Error> errors = null;

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

	public FailureEVConsumption errors(List<Error> errors) {
		this.errors = errors;
		return this;
	}

	public FailureEVConsumption addErrorsItem(Error errorsItem) {
		if (this.errors == null) {
			this.errors = new ArrayList<Error>();
		}
		this.errors.add(errorsItem);
		return this;
	}

	@ApiModelProperty(value = "List of errors.")
	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
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
		return Objects.equals(this.request, failureEVConsumption.request)
				&& Objects.equals(this.errors, failureEVConsumption.errors);
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
