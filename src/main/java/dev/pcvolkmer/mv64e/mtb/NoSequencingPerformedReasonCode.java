package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NoSequencingPerformedReasonCode {
    NON_GENETIC_CAUSE, NOT_RARE_DISEASE, OTHER, PSYCHOSOMATIC, TARGETED_DIAGNOSTICS_RECOMMENDED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NON_GENETIC_CAUSE: return "non-genetic-cause";
            case NOT_RARE_DISEASE: return "not-rare-disease";
            case OTHER: return "other";
            case PSYCHOSOMATIC: return "psychosomatic";
            case TARGETED_DIAGNOSTICS_RECOMMENDED: return "targeted-diagnostics-recommended";
        }
        return null;
    }

    @JsonCreator
    public static NoSequencingPerformedReasonCode forValue(String value) throws IOException {
        if (value.equals("non-genetic-cause")) return NON_GENETIC_CAUSE;
        if (value.equals("not-rare-disease")) return NOT_RARE_DISEASE;
        if (value.equals("other")) return OTHER;
        if (value.equals("psychosomatic")) return PSYCHOSOMATIC;
        if (value.equals("targeted-diagnostics-recommended")) return TARGETED_DIAGNOSTICS_RECOMMENDED;
        throw new IOException("Cannot deserialize NoSequencingPerformedReasonCode");
    }
}
