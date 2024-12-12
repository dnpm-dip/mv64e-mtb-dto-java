package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VitalStatusCode {
    ALIVE, DECEASED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALIVE: return "alive";
            case DECEASED: return "deceased";
        }
        return null;
    }

    @JsonCreator
    public static VitalStatusCode forValue(String value) throws IOException {
        if (value.equals("alive")) return ALIVE;
        if (value.equals("deceased")) return DECEASED;
        throw new IOException("Cannot deserialize VitalStatusCode");
    }
}
