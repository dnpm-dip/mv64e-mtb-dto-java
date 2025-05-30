package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProteinExpressionIcScoreCodingCode {
    CODE_0, CODE_1, CODE_2, CODE_3;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CODE_0: return "0";
            case CODE_1: return "1";
            case CODE_2: return "2";
            case CODE_3: return "3";
        }
        return null;
    }

    @JsonCreator
    public static ProteinExpressionIcScoreCodingCode forValue(String value) throws IOException {
        if (value.equals("0")) return CODE_0;
        if (value.equals("1")) return CODE_1;
        if (value.equals("2")) return CODE_2;
        if (value.equals("3")) return CODE_3;
        throw new IOException("Cannot deserialize ProteinExpressionIcScoreCodingCode");
    }
}
