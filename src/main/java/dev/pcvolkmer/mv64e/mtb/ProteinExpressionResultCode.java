package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProteinExpressionResultCode {
    EXP, NOT_EXP, CODE_1_PLUS, CODE_2_PLUS, CODE_3_PLUS, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXP: return "exp";
            case NOT_EXP: return "not-exp";
            case CODE_1_PLUS: return "1+";
            case CODE_2_PLUS: return "2+";
            case CODE_3_PLUS: return "3+";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static ProteinExpressionResultCode forValue(String value) throws IOException {
        switch (value) {
            case "exp":
                return EXP;
            case "not-exp":
                return NOT_EXP;
            case "1+":
                return CODE_1_PLUS;
            case "2+":
                return CODE_2_PLUS;
            case "3+":
                return CODE_3_PLUS;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize PurpleCode");
    }
}
