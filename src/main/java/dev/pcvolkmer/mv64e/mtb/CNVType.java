package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CNVType {
    HIGH_LEVEL_GAIN, LOSS, LOW_LEVEL_GAIN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HIGH_LEVEL_GAIN: return "high-level-gain";
            case LOSS: return "loss";
            case LOW_LEVEL_GAIN: return "low-level-gain";
        }
        return null;
    }

    @JsonCreator
    public static CNVType forValue(String value) throws IOException {
        switch (value) {
            case "high-level-gain":
                return HIGH_LEVEL_GAIN;
            case "loss":
                return LOSS;
            case "low-level-gain":
                return LOW_LEVEL_GAIN;
        }
        throw new IOException("Cannot deserialize CNVType");
    }
}
