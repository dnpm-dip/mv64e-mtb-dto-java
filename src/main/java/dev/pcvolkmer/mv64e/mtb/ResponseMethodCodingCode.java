package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ResponseMethodCodingCode {
    RANO, RECIST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RANO: return "RANO";
            case RECIST: return "RECIST";
        }
        return null;
    }

    @JsonCreator
    public static ResponseMethodCodingCode forValue(String value) throws IOException {
        if (value.equals("RANO")) return RANO;
        if (value.equals("RECIST")) return RECIST;
        throw new IOException("Cannot deserialize ResponseMethodCodingCode");
    }
}
