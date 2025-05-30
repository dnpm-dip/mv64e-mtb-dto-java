package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ValueCode {
    MAIN, METACHRONOUS, SECONDARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MAIN: return "main";
            case METACHRONOUS: return "metachronous";
            case SECONDARY: return "secondary";
        }
        return null;
    }

    @JsonCreator
    public static ValueCode forValue(String value) throws IOException {
        if (value.equals("main")) return MAIN;
        if (value.equals("metachronous")) return METACHRONOUS;
        if (value.equals("secondary")) return SECONDARY;
        throw new IOException("Cannot deserialize ValueCode");
    }
}
