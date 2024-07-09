package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GuidelineTreatmentStatus {
    EXHAUSTED, IMPOSSIBLE, NON_EXHAUSTED, NO_GUIDELINES_AVAILABLE, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXHAUSTED: return "exhausted";
            case IMPOSSIBLE: return "impossible";
            case NON_EXHAUSTED: return "non-exhausted";
            case NO_GUIDELINES_AVAILABLE: return "no-guidelines-available";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static GuidelineTreatmentStatus forValue(String value) throws IOException {
        switch (value) {
            case "exhausted":
                return EXHAUSTED;
            case "impossible":
                return IMPOSSIBLE;
            case "non-exhausted":
                return NON_EXHAUSTED;
            case "no-guidelines-available":
                return NO_GUIDELINES_AVAILABLE;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize GuidelineTreatmentStatus");
    }
}
