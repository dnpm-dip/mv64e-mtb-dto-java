package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GenderCodingCode {
    FEMALE, MALE, OTHER, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FEMALE: return "female";
            case MALE: return "male";
            case OTHER: return "other";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static GenderCodingCode forValue(String value) throws IOException {
        if (value.equals("female")) return FEMALE;
        if (value.equals("male")) return MALE;
        if (value.equals("other")) return OTHER;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize GenderCodingCode");
    }
}
