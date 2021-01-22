package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.EmploymentVerificationSandbox.client.model.EmploymentVerification;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerificationWithPrivacyNotice;
import io.EmploymentVerificationSandbox.client.model.PrivacyNotice;

public class EmploymentVerificationWithPrivacyNotice {
	
	@SerializedName("privacyNotice")
	private PrivacyNotice privacyNotice = null;
	@SerializedName("employmentVerification")
	private EmploymentVerification employmentVerification = null;

	public EmploymentVerificationWithPrivacyNotice privacyNotice(PrivacyNotice privacyNotice) {
		this.privacyNotice = privacyNotice;
		return this;
	}

	public PrivacyNotice getPrivacyNotice() {
		return privacyNotice;
	}

	public void setPrivacyNotice(PrivacyNotice privacyNotice) {
		this.privacyNotice = privacyNotice;
	}

	public EmploymentVerificationWithPrivacyNotice employmentVerification(
			EmploymentVerification employmentVerification) {
		this.employmentVerification = employmentVerification;
		return this;
	}

	public EmploymentVerification getEmploymentVerification() {
		return employmentVerification;
	}

	public void setEmploymentVerification(EmploymentVerification employmentVerification) {
		this.employmentVerification = employmentVerification;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmploymentVerificationWithPrivacyNotice employmentVerificationWithPrivacyNotice = (EmploymentVerificationWithPrivacyNotice) o;
		return Objects.equals(this.privacyNotice, employmentVerificationWithPrivacyNotice.privacyNotice) && Objects
				.equals(this.employmentVerification, employmentVerificationWithPrivacyNotice.employmentVerification);
	}

	@Override
	public int hashCode() {
		return Objects.hash(privacyNotice, employmentVerification);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmploymentVerificationWithPrivacyNotice {\n");

		sb.append("    privacyNotice: ").append(toIndentedString(privacyNotice)).append("\n");
		sb.append("    employmentVerification: ").append(toIndentedString(employmentVerification)).append("\n");
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
