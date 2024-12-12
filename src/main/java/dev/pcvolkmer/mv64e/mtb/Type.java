package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Type {
    ORGANIZATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ORGANIZATION: return "Organization";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("Organization")) return ORGANIZATION;
        throw new IOException("Cannot deserialize Type");
    }
}
