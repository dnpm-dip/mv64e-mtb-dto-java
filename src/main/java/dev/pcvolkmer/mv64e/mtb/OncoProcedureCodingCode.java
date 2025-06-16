package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum OncoProcedureCodingCode {
    NUCLEAR_MEDICINE, RADIO_THERAPY, SURGERY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NUCLEAR_MEDICINE: return "nuclear-medicine";
            case RADIO_THERAPY: return "radio-therapy";
            case SURGERY: return "surgery";
        }
        return null;
    }

    @JsonCreator
    public static OncoProcedureCodingCode forValue(String value) throws IOException {
        if (value.equals("nuclear-medicine")) return NUCLEAR_MEDICINE;
        if (value.equals("radio-therapy")) return RADIO_THERAPY;
        if (value.equals("surgery")) return SURGERY;
        throw new IOException("Cannot deserialize OncoProcedureCodingCode");
    }
}
