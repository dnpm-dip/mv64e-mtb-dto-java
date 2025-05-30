package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MtbDiagnosisGuidelineTreatmentStatusCodingCode {
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
    public static MtbDiagnosisGuidelineTreatmentStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("exhausted")) return EXHAUSTED;
        if (value.equals("impossible")) return IMPOSSIBLE;
        if (value.equals("non-exhausted")) return NON_EXHAUSTED;
        if (value.equals("no-guidelines-available")) return NO_GUIDELINES_AVAILABLE;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize MtbDiagnosisGuidelineTreatmentStatusCodingCode");
    }
}
