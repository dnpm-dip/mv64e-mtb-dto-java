package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EcogCode {
    CODE_0, CODE_1, CODE_2, CODE_3, CODE_4;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CODE_0: return "0";
            case CODE_1: return "1";
            case CODE_2: return "2";
            case CODE_3: return "3";
            case CODE_4: return "4";
        }
        return null;
    }

    @JsonCreator
    public static EcogCode forValue(String value) throws IOException {
        switch (value) {
            case "0":
                return CODE_0;
            case "1":
                return CODE_1;
            case "2":
                return CODE_2;
            case "3":
                return CODE_3;
            case "4":
                return CODE_4;
        }
        throw new IOException("Cannot deserialize EcogCode");
    }
}
