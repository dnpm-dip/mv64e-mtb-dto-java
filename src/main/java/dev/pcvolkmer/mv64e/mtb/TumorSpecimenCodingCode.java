package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TumorSpecimenCodingCode {
    CRYO_FROZEN, FFPE, FRESH_TISSUE, LIQUID_BIOPSY, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CRYO_FROZEN: return "cryo-frozen";
            case FFPE: return "FFPE";
            case FRESH_TISSUE: return "fresh-tissue";
            case LIQUID_BIOPSY: return "liquid-biopsy";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static TumorSpecimenCodingCode forValue(String value) throws IOException {
        if (value.equals("cryo-frozen")) return CRYO_FROZEN;
        if (value.equals("FFPE")) return FFPE;
        if (value.equals("fresh-tissue")) return FRESH_TISSUE;
        if (value.equals("liquid-biopsy")) return LIQUID_BIOPSY;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize TumorSpecimenCodingCode");
    }
}
