package io.EmploymentVerificationSandbox.client.model;


import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogIndustry.Adapter.class)
public enum CatalogIndustry {
  
  GOVERNMENT("GOVERNMENT"),
  
  AGROPECUARY("AGROPECUARY"),
  
  WHOLESALE("WHOLESALE"),
  
  RETAIL("RETAIL"),
  
  CONSTRUCTION("CONSTRUCTION"),
  
  MEDIA("MEDIA"),
  
  MINERY("MINERY"),
  
  MANUFACTURING("MANUFACTURING"),
  
  ENERGY("ENERGY"),
  
  OTHER_NON_GOVERNMENTAL_SERVICES("OTHER NON GOVERNMENTAL SERVICES"),
  
  HOSPITALITY("HOSPITALITY"),
  
  RESTAURANTS("RESTAURANTS"),
  
  CULTURE_LEISURE("CULTURE & LEISURE"),
  
  HEALTH("HEALTH"),
  
  EDUCATION("EDUCATION"),
  
  FINANCIAL_SERVICES("FINANCIAL SERVICES"),
  
  REAL_ESTATE("REAL ESTATE"),
  
  PROFESSIONAL_SCIENTIFIC_TECHNICAL_SERVICES("PROFESSIONAL, SCIENTIFIC & TECHNICAL SERVICES"),
  
  CARGO("CARGO"),
  
  TRANSPORT("TRANSPORT");

  private String value;

  CatalogIndustry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogIndustry fromValue(String text) {
    for (CatalogIndustry b : CatalogIndustry.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogIndustry> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogIndustry enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogIndustry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogIndustry.fromValue(String.valueOf(value));
    }
  }
}

