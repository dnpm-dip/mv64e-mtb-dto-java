package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TumorStagingMethodCodingCode {
    CLINICAL, PATHOLOGIC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CLINICAL: return "clinical";
            case PATHOLOGIC: return "pathologic";
        }
        return null;
    }

    @JsonCreator
    public static TumorStagingMethodCodingCode forValue(String value) throws IOException {
        if (value.equals("clinical")) return CLINICAL;
        if (value.equals("pathologic")) return PATHOLOGIC;
        throw new IOException("Cannot deserialize TumorStagingMethodCodingCode");
    }
}
