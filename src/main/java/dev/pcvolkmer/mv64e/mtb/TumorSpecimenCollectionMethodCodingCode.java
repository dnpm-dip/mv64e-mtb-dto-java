package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TumorSpecimenCollectionMethodCodingCode {
    BIOPSY, CYTOLOGY, LIQUID_BIOPSY, RESECTION, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BIOPSY: return "biopsy";
            case CYTOLOGY: return "cytology";
            case LIQUID_BIOPSY: return "liquid-biopsy";
            case RESECTION: return "resection";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static TumorSpecimenCollectionMethodCodingCode forValue(String value) throws IOException {
        if (value.equals("biopsy")) return BIOPSY;
        if (value.equals("cytology")) return CYTOLOGY;
        if (value.equals("liquid-biopsy")) return LIQUID_BIOPSY;
        if (value.equals("resection")) return RESECTION;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize TumorSpecimenCollectionMethodCodingCode");
    }
}
