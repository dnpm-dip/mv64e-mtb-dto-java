package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum LevelOfEvidenceAddendumCodingCode {
    IS, IV, R, Z;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IS: return "is";
            case IV: return "iv";
            case R: return "R";
            case Z: return "Z";
        }
        return null;
    }

    @JsonCreator
    public static LevelOfEvidenceAddendumCodingCode forValue(String value) throws IOException {
        if (value.equals("is")) return IS;
        if (value.equals("iv")) return IV;
        if (value.equals("R")) return R;
        if (value.equals("Z")) return Z;
        throw new IOException("Cannot deserialize LevelOfEvidenceAddendumCodingCode");
    }
}
