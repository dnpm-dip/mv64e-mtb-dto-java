package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum InterpretationCodingCode {
    HIGH, INTERMEDIATE, LOW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HIGH: return "high";
            case INTERMEDIATE: return "intermediate";
            case LOW: return "low";
        }
        return null;
    }

    @JsonCreator
    public static InterpretationCodingCode forValue(String value) throws IOException {
        if (value.equals("high")) return HIGH;
        if (value.equals("intermediate")) return INTERMEDIATE;
        if (value.equals("low")) return LOW;
        throw new IOException("Cannot deserialize InterpretationCodingCode");
    }
}
