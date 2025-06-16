package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ClaimResponseStatusCodingCode {
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
    public static ClaimResponseStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("accepted")) return ACCEPTED;
        if (value.equals("rejected")) return REJECTED;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize ClaimResponseStatusCodingCode");
    }
}
