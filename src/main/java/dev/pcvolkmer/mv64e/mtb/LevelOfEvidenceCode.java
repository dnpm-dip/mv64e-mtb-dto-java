package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LevelOfEvidenceCode {
    M1_A, M1_B, M1_C, M2_A, M2_B, M2_C, M3, M4, UNDEFINED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case M1_A: return "m1A";
            case M1_B: return "m1B";
            case M1_C: return "m1C";
            case M2_A: return "m2A";
            case M2_B: return "m2B";
            case M2_C: return "m2C";
            case M3: return "m3";
            case M4: return "m4";
            case UNDEFINED: return "undefined";
        }
        return null;
    }

    @JsonCreator
    public static LevelOfEvidenceCode forValue(String value) throws IOException {
        if (value.equals("m1A")) return M1_A;
        if (value.equals("m1B")) return M1_B;
        if (value.equals("m1C")) return M1_C;
        if (value.equals("m2A")) return M2_A;
        if (value.equals("m2B")) return M2_B;
        if (value.equals("m2C")) return M2_C;
        if (value.equals("m3")) return M3;
        if (value.equals("m4")) return M4;
        if (value.equals("undefined")) return UNDEFINED;
        throw new IOException("Cannot deserialize LevelOfEvidenceCode");
    }
}
