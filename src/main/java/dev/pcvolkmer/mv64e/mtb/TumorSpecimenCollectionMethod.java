package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TumorSpecimenCollectionMethod {
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
    public static TumorSpecimenCollectionMethod forValue(String value) throws IOException {
        switch (value) {
            case "biopsy":
                return BIOPSY;
            case "cytology":
                return CYTOLOGY;
            case "liquid-biopsy":
                return LIQUID_BIOPSY;
            case "resection":
                return RESECTION;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize TumorSpecimenCollectionMethod");
    }
}
