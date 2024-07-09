package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Gender {
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
    public static Gender forValue(String value) throws IOException {
        switch (value) {
            case "female":
                return FEMALE;
            case "male":
                return MALE;
            case "other":
                return OTHER;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize Gender");
    }
}
