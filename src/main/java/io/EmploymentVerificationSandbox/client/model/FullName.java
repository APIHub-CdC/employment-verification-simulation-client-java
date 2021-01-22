package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

public class FullName {
	@SerializedName("firstName")
	private String firstName = null;
	@SerializedName("middleName")
	private String middleName = null;
	@SerializedName("firstSurname")
	private String firstSurname = null;
	@SerializedName("secondSurname")
	private String secondSurname = null;
	@SerializedName("aditionalSurname")
	private String aditionalSurname = null;

	public FullName firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public FullName middleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public FullName firstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
		return this;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public FullName secondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
		return this;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public FullName aditionalSurname(String aditionalSurname) {
		this.aditionalSurname = aditionalSurname;
		return this;
	}

	public String getAditionalSurname() {
		return aditionalSurname;
	}

	public void setAditionalSurname(String aditionalSurname) {
		this.aditionalSurname = aditionalSurname;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FullName fullName = (FullName) o;
		return Objects.equals(this.firstName, fullName.firstName)
				&& Objects.equals(this.middleName, fullName.middleName)
				&& Objects.equals(this.firstSurname, fullName.firstSurname)
				&& Objects.equals(this.secondSurname, fullName.secondSurname)
				&& Objects.equals(this.aditionalSurname, fullName.aditionalSurname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, middleName, firstSurname, secondSurname, aditionalSurname);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FullName {\n");

		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
		sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
		sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
		sb.append("    aditionalSurname: ").append(toIndentedString(aditionalSurname)).append("\n");
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
