package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum LevelOfEvidenceGradingCodingCode {
    M1A, M1B, M1C, M2A, M2B, M2C, M3, M4, UNDEFINED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case M1A: return "m1A";
            case M1B: return "m1B";
            case M1C: return "m1C";
            case M2A: return "m2A";
            case M2B: return "m2B";
            case M2C: return "m2C";
            case M3: return "m3";
            case M4: return "m4";
            case UNDEFINED: return "undefined";
        }
        return null;
    }

    @JsonCreator
    public static LevelOfEvidenceGradingCodingCode forValue(String value) throws IOException {
        if (value.equals("m1A")) return M1A;
        if (value.equals("m1B")) return M1B;
        if (value.equals("m1C")) return M1C;
        if (value.equals("m2A")) return M2A;
        if (value.equals("m2B")) return M2B;
        if (value.equals("m2C")) return M2C;
        if (value.equals("m3")) return M3;
        if (value.equals("m4")) return M4;
        if (value.equals("undefined")) return UNDEFINED;
        throw new IOException("Cannot deserialize LevelOfEvidenceGradingCodingCode");
    }
}
