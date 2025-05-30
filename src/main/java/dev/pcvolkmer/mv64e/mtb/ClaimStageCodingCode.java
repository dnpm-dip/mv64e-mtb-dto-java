package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClaimStageCodingCode {
    FOLLOW_UP_CLAIM, INITIAL_CLAIM, REVOCATION, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FOLLOW_UP_CLAIM: return "follow-up-claim";
            case INITIAL_CLAIM: return "initial-claim";
            case REVOCATION: return "revocation";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static ClaimStageCodingCode forValue(String value) throws IOException {
        if (value.equals("follow-up-claim")) return FOLLOW_UP_CLAIM;
        if (value.equals("initial-claim")) return INITIAL_CLAIM;
        if (value.equals("revocation")) return REVOCATION;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize ClaimStageCodingCode");
    }
}
