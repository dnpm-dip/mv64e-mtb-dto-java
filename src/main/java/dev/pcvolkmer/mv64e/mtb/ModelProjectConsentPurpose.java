package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ModelProjectConsentPurpose {
    CASE_IDENTIFICATION, REIDENTIFICATION, SEQUENCING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CASE_IDENTIFICATION: return "case-identification";
            case REIDENTIFICATION: return "reidentification";
            case SEQUENCING: return "sequencing";
        }
        return null;
    }

    @JsonCreator
    public static ModelProjectConsentPurpose forValue(String value) throws IOException {
        if (value.equals("case-identification")) return CASE_IDENTIFICATION;
        if (value.equals("reidentification")) return REIDENTIFICATION;
        if (value.equals("sequencing")) return SEQUENCING;
        throw new IOException("Cannot deserialize ModelProjectConsentPurpose");
    }
}
