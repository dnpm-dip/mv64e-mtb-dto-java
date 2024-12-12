package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StageCode {
    LOCAL, METASTASIZED, TUMOR_FREE, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOCAL: return "local";
            case METASTASIZED: return "metastasized";
            case TUMOR_FREE: return "tumor-free";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static StageCode forValue(String value) throws IOException {
        switch (value) {
            case "local":
                return LOCAL;
            case "metastasized":
                return METASTASIZED;
            case "tumor-free":
                return TUMOR_FREE;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize StageCode");
    }
}
