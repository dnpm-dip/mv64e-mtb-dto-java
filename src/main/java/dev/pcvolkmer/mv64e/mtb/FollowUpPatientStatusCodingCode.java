package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum FollowUpPatientStatusCodingCode {
    LOST_TO_FU;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOST_TO_FU: return "lost-to-fu";
        }
        return null;
    }

    @JsonCreator
    public static FollowUpPatientStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("lost-to-fu")) return LOST_TO_FU;
        throw new IOException("Cannot deserialize FollowUpPatientStatusCodingCode");
    }
}
