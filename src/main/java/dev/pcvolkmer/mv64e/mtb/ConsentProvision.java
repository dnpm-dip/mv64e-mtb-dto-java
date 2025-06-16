package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ConsentProvision {
    DENY, PERMIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DENY: return "deny";
            case PERMIT: return "permit";
        }
        return null;
    }

    @JsonCreator
    public static ConsentProvision forValue(String value) throws IOException {
        if (value.equals("deny")) return DENY;
        if (value.equals("permit")) return PERMIT;
        throw new IOException("Cannot deserialize ConsentProvision");
    }
}
