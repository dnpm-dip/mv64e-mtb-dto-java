package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ProteinExpressionResultCodingCode {
    EXP, NOT_EXP, CODE_1PLUS, CODE_2PLUS, CODE_3PLUS, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXP: return "exp";
            case NOT_EXP: return "not-exp";
            case CODE_1PLUS: return "1+";
            case CODE_2PLUS: return "2+";
            case CODE_3PLUS: return "3+";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static ProteinExpressionResultCodingCode forValue(String value) throws IOException {
        if (value.equals("exp")) return EXP;
        if (value.equals("not-exp")) return NOT_EXP;
        if (value.equals("1+")) return CODE_1PLUS;
        if (value.equals("2+")) return CODE_2PLUS;
        if (value.equals("3+")) return CODE_3PLUS;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize ProteinExpressionResultCodingCode");
    }
}
