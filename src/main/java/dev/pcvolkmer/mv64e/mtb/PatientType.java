package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PatientType {
    PATIENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PATIENT: return "Patient";
        }
        return null;
    }

    @JsonCreator
    public static PatientType forValue(String value) throws IOException {
        if (value.equals("Patient")) return PATIENT;
        throw new IOException("Cannot deserialize PatientType");
    }
}
