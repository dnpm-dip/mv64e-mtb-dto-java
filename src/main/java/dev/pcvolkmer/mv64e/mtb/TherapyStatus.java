package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TherapyStatus {
    COMPLETED, NOT_DONE, ON_GOING, STOPPED, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPLETED: return "completed";
            case NOT_DONE: return "not-done";
            case ON_GOING: return "on-going";
            case STOPPED: return "stopped";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static TherapyStatus forValue(String value) throws IOException {
        switch (value) {
            case "completed":
                return COMPLETED;
            case "not-done":
                return NOT_DONE;
            case "on-going":
                return ON_GOING;
            case "stopped":
                return STOPPED;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize TherapyStatus");
    }
}
