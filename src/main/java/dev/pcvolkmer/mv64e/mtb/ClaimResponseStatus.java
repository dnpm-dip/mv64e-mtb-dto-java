package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClaimResponseStatus {
    ACCEPTED, REJECTED, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCEPTED: return "accepted";
            case REJECTED: return "rejected";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static ClaimResponseStatus forValue(String value) throws IOException {
        switch (value) {
            case "accepted":
                return ACCEPTED;
            case "rejected":
                return REJECTED;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize ClaimResponseStatus");
    }
}
