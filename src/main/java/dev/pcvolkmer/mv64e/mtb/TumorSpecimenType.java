package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TumorSpecimenType {
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
    public static TumorSpecimenType forValue(String value) throws IOException {
        switch (value) {
            case "cryo-frozen":
                return CRYO_FROZEN;
            case "FFPE":
                return FFPE;
            case "fresh-tissue":
                return FRESH_TISSUE;
            case "liquid-biopsy":
                return LIQUID_BIOPSY;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize TumorSpecimenType");
    }
}
