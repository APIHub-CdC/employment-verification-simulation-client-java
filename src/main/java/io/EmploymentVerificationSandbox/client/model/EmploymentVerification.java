package io.EmploymentVerificationSandbox.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerificationId;
import java.io.IOException;
@ApiModel(description = "Employment verification information")



public class EmploymentVerification extends EmploymentVerificationId {
  @SerializedName("curp")
  private String curp = null;
  @SerializedName("nss")
  private String nss = null;
  @SerializedName("email")
  private String email = null;
  
  @JsonAdapter(InquiryStatusEnum.Adapter.class)
  public enum InquiryStatusEnum {
    RI("RI"),
    
    SN("SN"),
    
    DN("DN"),
    
    DND("DND"),
    
    NDN("NDN"),
    CI("CI");

    private String value;
    InquiryStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InquiryStatusEnum fromValue(String text) {
      for (InquiryStatusEnum b : InquiryStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InquiryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InquiryStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public InquiryStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InquiryStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("inquiryStatus")
  private InquiryStatusEnum inquiryStatus = null;
  @SerializedName("successCheck")
  private Boolean successCheck = null;
  public EmploymentVerification curp(String curp) {
    this.curp = curp;
    return this;
  }
   
  @ApiModelProperty(example = "BADD110313HCMLNS09", value = "Clave Única de Registro de población for its initials in Spanish (CURP)")
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
  }
  public EmploymentVerification nss(String nss) {
    this.nss = nss;
    return this;
  }
   
  @ApiModelProperty(example = "92919084431", value = "Número de Seguridad Social for its initials in Spanish (NSS)")
  public String getNss() {
    return nss;
  }
  public void setNss(String nss) {
    this.nss = nss;
  }
  public EmploymentVerification email(String email) {
    this.email = email;
    return this;
  }
   
  @ApiModelProperty(example = "api@circulodecredito.com.mx", value = "email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
   
  @ApiModelProperty(example = "delivered", value = "Inquiry status.")
  public InquiryStatusEnum getInquiryStatus() {
    return inquiryStatus;
  }
   
  @ApiModelProperty(example = "true", value = "It is true if the employment verification process ended successfully.")
  public Boolean isSuccessCheck() {
    return successCheck;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentVerification employmentVerification = (EmploymentVerification) o;
    return Objects.equals(this.curp, employmentVerification.curp) &&
        Objects.equals(this.nss, employmentVerification.nss) &&
        Objects.equals(this.email, employmentVerification.email) &&
        Objects.equals(this.inquiryStatus, employmentVerification.inquiryStatus) &&
        Objects.equals(this.successCheck, employmentVerification.successCheck) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(curp, nss, email, inquiryStatus, successCheck, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentVerification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    nss: ").append(toIndentedString(nss)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inquiryStatus: ").append(toIndentedString(inquiryStatus)).append("\n");
    sb.append("    successCheck: ").append(toIndentedString(successCheck)).append("\n");
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
