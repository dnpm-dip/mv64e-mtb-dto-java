package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum EcogCodingCode {
    CODE_0, CODE_1, CODE_2, CODE_3, CODE_4, CODE_5;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CODE_0: return "0";
            case CODE_1: return "1";
            case CODE_2: return "2";
            case CODE_3: return "3";
            case CODE_4: return "4";
            case CODE_5: return "5";
        }
        return null;
    }

    @JsonCreator
    public static EcogCodingCode forValue(String value) throws IOException {
        if (value.equals("0")) return CODE_0;
        if (value.equals("1")) return CODE_1;
        if (value.equals("2")) return CODE_2;
        if (value.equals("3")) return CODE_3;
        if (value.equals("4")) return CODE_4;
        if (value.equals("5")) return CODE_5;
        throw new IOException("Cannot deserialize EcogCodingCode");
    }
}
