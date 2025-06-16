package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TherapyStatusCodingCode {
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
    public static TherapyStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("completed")) return COMPLETED;
        if (value.equals("not-done")) return NOT_DONE;
        if (value.equals("on-going")) return ON_GOING;
        if (value.equals("stopped")) return STOPPED;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize TherapyStatusCodingCode");
    }
}
