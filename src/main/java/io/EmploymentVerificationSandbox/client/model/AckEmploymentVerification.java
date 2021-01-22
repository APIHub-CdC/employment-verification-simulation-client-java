
package io.EmploymentVerificationSandbox.client.model;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

public class AckEmploymentVerification {
	@SerializedName("acknowledgeId")
	private UUID acknowledgeId = null;

	@SerializedName("dateTime")
	private OffsetDateTime dateTime = null;

	@JsonAdapter(OperationEnum.Adapter.class)
	public enum OperationEnum {
		REQUEST("request"), CONSUME("consume"),

		CONSUMPTION("consumption");

		private String value;

		OperationEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static OperationEnum fromValue(String text) {
			for (OperationEnum b : OperationEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<OperationEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public OperationEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return OperationEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("operation")
	private OperationEnum operation = null;

	@SerializedName("message")
	private String message = null;

	@ApiModelProperty(example = "627aa72a-c799-4abf-b98e-0c4838af9bd5", value = "Ackknowledge identifier (UUID).")
	public UUID getAcknowledgeId() {
		return acknowledgeId;
	}

	@ApiModelProperty(example = "2020-04-12T22:20:50.52Z", value = "Date and time of the acknowledge. As defined by date-time - RFC3339.")
	public OffsetDateTime getDateTime() {
		return dateTime;
	}

	@ApiModelProperty(example = "request", value = "Employment verification operation.")
	public OperationEnum getOperation() {
		return operation;
	}

	@ApiModelProperty(example = "The employment verification request has been received.", value = "Descriptive and human-readable message.")
	public String getMessage() {
		return message;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AckEmploymentVerification ackEmploymentVerification = (AckEmploymentVerification) o;
		return Objects.equals(this.acknowledgeId, ackEmploymentVerification.acknowledgeId)
				&& Objects.equals(this.dateTime, ackEmploymentVerification.dateTime)
				&& Objects.equals(this.operation, ackEmploymentVerification.operation)
				&& Objects.equals(this.message, ackEmploymentVerification.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(acknowledgeId, dateTime, operation, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AckEmploymentVerification {\n");

		sb.append("    acknowledgeId: ").append(toIndentedString(acknowledgeId)).append("\n");
		sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
		sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
