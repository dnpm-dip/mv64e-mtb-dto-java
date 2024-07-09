package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PurpleCode {
    THE_0, THE_1, THE_2, THE_3, THE_4;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_0: return "0";
            case THE_1: return "1";
            case THE_2: return "2";
            case THE_3: return "3";
            case THE_4: return "4";
        }
        return null;
    }

    @JsonCreator
    public static PurpleCode forValue(String value) throws IOException {
        switch (value) {
            case "0":
                return THE_0;
            case "1":
                return THE_1;
            case "2":
                return THE_2;
            case "3":
                return THE_3;
            case "4":
                return THE_4;
        }
        throw new IOException("Cannot deserialize PurpleCode");
    }
}
