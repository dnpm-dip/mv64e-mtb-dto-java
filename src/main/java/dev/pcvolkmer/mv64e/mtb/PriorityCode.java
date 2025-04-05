package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PriorityCode {
    THE_1, THE_2, THE_3, THE_4;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THE_1: return "1";
            case THE_2: return "2";
            case THE_3: return "3";
            case THE_4: return "4";
        }
        return null;
    }

    @JsonCreator
    public static PriorityCode forValue(String value) throws IOException {
        if (value.equals("1")) return THE_1;
        if (value.equals("2")) return THE_2;
        if (value.equals("3")) return THE_3;
        if (value.equals("4")) return THE_4;
        throw new IOException("Cannot deserialize PriorityCode");
    }
}
