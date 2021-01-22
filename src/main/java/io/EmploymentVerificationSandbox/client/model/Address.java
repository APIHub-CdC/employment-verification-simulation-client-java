package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.EmploymentVerificationSandbox.client.model.Address;
import io.EmploymentVerificationSandbox.client.model.StateCatalog;

public class Address {
	@SerializedName("streetAndNumber")
	private String streetAndNumber = null;
	@SerializedName("settlement")
	private String settlement = null;
	@SerializedName("county")
	private String county = null;
	@SerializedName("city")
	private String city = null;
	@SerializedName("state")
	private StateCatalog state = null;
	@SerializedName("postalCode")
	private String postalCode = null;

	public Address streetAndNumber(String streetAndNumber) {
		this.streetAndNumber = streetAndNumber;
		return this;
	}

	public String getStreetAndNumber() {
		return streetAndNumber;
	}

	public void setStreetAndNumber(String streetAndNumber) {
		this.streetAndNumber = streetAndNumber;
	}

	public Address settlement(String settlement) {
		this.settlement = settlement;
		return this;
	}

	public String getSettlement() {
		return settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public Address county(String county) {
		this.county = county;
		return this;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Address city(String city) {
		this.city = city;
		return this;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address state(StateCatalog state) {
		this.state = state;
		return this;
	}

	public StateCatalog getState() {
		return state;
	}

	public void setState(StateCatalog state) {
		this.state = state;
	}

	public Address postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(this.streetAndNumber, address.streetAndNumber)
				&& Objects.equals(this.settlement, address.settlement) && Objects.equals(this.county, address.county)
				&& Objects.equals(this.city, address.city) && Objects.equals(this.state, address.state)
				&& Objects.equals(this.postalCode, address.postalCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(streetAndNumber, settlement, county, city, state, postalCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");

		sb.append("    streetAndNumber: ").append(toIndentedString(streetAndNumber)).append("\n");
		sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
		sb.append("    county: ").append(toIndentedString(county)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
