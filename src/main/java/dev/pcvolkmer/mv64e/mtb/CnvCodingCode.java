package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum CnvCodingCode {
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
    public static CnvCodingCode forValue(String value) throws IOException {
        if (value.equals("high-level-gain")) return HIGH_LEVEL_GAIN;
        if (value.equals("loss")) return LOSS;
        if (value.equals("low-level-gain")) return LOW_LEVEL_GAIN;
        throw new IOException("Cannot deserialize CnvCodingCode");
    }
}
