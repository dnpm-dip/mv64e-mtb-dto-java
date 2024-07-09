package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConsentStatus {
    ACTIVE, REJECTED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACTIVE: return "active";
            case REJECTED: return "rejected";
        }
        return null;
    }

    @JsonCreator
    public static ConsentStatus forValue(String value) throws IOException {
        if (value.equals("active")) return ACTIVE;
        if (value.equals("rejected")) return REJECTED;
        throw new IOException("Cannot deserialize ConsentStatus");
    }
}
