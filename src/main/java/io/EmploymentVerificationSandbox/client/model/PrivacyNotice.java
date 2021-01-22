package io.EmploymentVerificationSandbox.client.model;

import java.io.IOException;
import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.EmploymentVerificationSandbox.client.model.Address;
import io.EmploymentVerificationSandbox.client.model.FullName;
import io.EmploymentVerificationSandbox.client.model.PrivacyNotice;

public class PrivacyNotice {
	
	@SerializedName("fullName")
	private FullName fullName = null;
	@SerializedName("address")
	private Address address = null;
	@SerializedName("acceptanceDate")
	private OffsetDateTime acceptanceDate = null;

	@JsonAdapter(AcceptanceEnum.Adapter.class)
	public enum AcceptanceEnum {
		Y("Y"), N("N");

		private String value;

		AcceptanceEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AcceptanceEnum fromValue(String text) {
			for (AcceptanceEnum b : AcceptanceEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<AcceptanceEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final AcceptanceEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public AcceptanceEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextInt();
				return AcceptanceEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("acceptance")
	private AcceptanceEnum acceptance = null;

	public PrivacyNotice fullName(FullName fullName) {
		this.fullName = fullName;
		return this;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public PrivacyNotice address(Address address) {
		this.address = address;
		return this;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PrivacyNotice acceptanceDate(OffsetDateTime acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
		return this;
	}

	public OffsetDateTime getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(OffsetDateTime acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public PrivacyNotice acceptance(AcceptanceEnum acceptance) {
		this.acceptance = acceptance;
		return this;
	}

	public AcceptanceEnum getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(AcceptanceEnum acceptance) {
		this.acceptance = acceptance;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PrivacyNotice privacyNotice = (PrivacyNotice) o;
		return Objects.equals(this.fullName, privacyNotice.fullName)
				&& Objects.equals(this.address, privacyNotice.address)
				&& Objects.equals(this.acceptanceDate, privacyNotice.acceptanceDate)
				&& Objects.equals(this.acceptance, privacyNotice.acceptance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullName, address, acceptanceDate, acceptance);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PrivacyNotice {\n");

		sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    acceptanceDate: ").append(toIndentedString(acceptanceDate)).append("\n");
		sb.append("    acceptance: ").append(toIndentedString(acceptance)).append("\n");
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
