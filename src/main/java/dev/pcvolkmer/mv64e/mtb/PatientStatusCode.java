package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PatientStatusCode {
    LOST_TO_FU;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOST_TO_FU: return "lost-to-fu";
        }
        return null;
    }

    @JsonCreator
    public static PatientStatusCode forValue(String value) throws IOException {
        if (value.equals("lost-to-fu")) return LOST_TO_FU;
        throw new IOException("Cannot deserialize PatientStatusCode");
    }
}
