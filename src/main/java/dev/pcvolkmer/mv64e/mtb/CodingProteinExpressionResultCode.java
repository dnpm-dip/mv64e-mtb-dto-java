package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingProteinExpressionResultCode {
    EXP, NOT_EXP, THE_1, THE_2, THE_3, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXP: return "exp";
            case NOT_EXP: return "not-exp";
            case THE_1: return "1+";
            case THE_2: return "2+";
            case THE_3: return "3+";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static CodingProteinExpressionResultCode forValue(String value) throws IOException {
        if (value.equals("exp")) return EXP;
        if (value.equals("not-exp")) return NOT_EXP;
        if (value.equals("1+")) return THE_1;
        if (value.equals("2+")) return THE_2;
        if (value.equals("3+")) return THE_3;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize CodingProteinExpressionResultCode");
    }
}
