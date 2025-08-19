package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MvhSubmissionType {
    ADDITION, CORRECTION, FOLLOWUP, INITIAL, TEST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADDITION: return "addition";
            case CORRECTION: return "correction";
            case FOLLOWUP: return "followup";
            case INITIAL: return "initial";
            case TEST: return "test";
        }
        return null;
    }

    @JsonCreator
    public static MvhSubmissionType forValue(String value) throws IOException {
        if (value.equals("addition")) return ADDITION;
        if (value.equals("correction")) return CORRECTION;
        if (value.equals("followup")) return FOLLOWUP;
        if (value.equals("initial")) return INITIAL;
        if (value.equals("test")) return TEST;
        throw new IOException("Cannot deserialize MvhSubmissionType");
    }
}
