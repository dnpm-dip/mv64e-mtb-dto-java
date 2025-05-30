package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MvhSubmissionType {
    ADDITION, CORRECTION, FOLLOWUP, INITIAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADDITION: return "addition";
            case CORRECTION: return "correction";
            case FOLLOWUP: return "followup";
            case INITIAL: return "initial";
        }
        return null;
    }

    @JsonCreator
    public static MvhSubmissionType forValue(String value) throws IOException {
        if (value.equals("addition")) return ADDITION;
        if (value.equals("correction")) return CORRECTION;
        if (value.equals("followup")) return FOLLOWUP;
        if (value.equals("initial")) return INITIAL;
        throw new IOException("Cannot deserialize MvhSubmissionType");
    }
}
