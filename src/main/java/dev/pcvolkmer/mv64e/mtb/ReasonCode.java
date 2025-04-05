package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ReasonCode {
    FAMILY_ANAMNESIS, OTHER, SECONDARY_TUMOR, SELF_ANAMNESIS, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FAMILY_ANAMNESIS: return "family-anamnesis";
            case OTHER: return "other";
            case SECONDARY_TUMOR: return "secondary-tumor";
            case SELF_ANAMNESIS: return "self-anamnesis";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static ReasonCode forValue(String value) throws IOException {
        if (value.equals("family-anamnesis")) return FAMILY_ANAMNESIS;
        if (value.equals("other")) return OTHER;
        if (value.equals("secondary-tumor")) return SECONDARY_TUMOR;
        if (value.equals("self-anamnesis")) return SELF_ANAMNESIS;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize ReasonCode");
    }
}
