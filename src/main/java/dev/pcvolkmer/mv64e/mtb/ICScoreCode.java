package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ICScoreCode {
    THE_0, THE_1, THE_2, THE_3;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_0: return "0";
            case THE_1: return "1";
            case THE_2: return "2";
            case THE_3: return "3";
        }
        return null;
    }

    @JsonCreator
    public static ICScoreCode forValue(String value) throws IOException {
        if (value.equals("0")) return THE_0;
        if (value.equals("1")) return THE_1;
        if (value.equals("2")) return THE_2;
        if (value.equals("3")) return THE_3;
        throw new IOException("Cannot deserialize ICScoreCode");
    }
}
