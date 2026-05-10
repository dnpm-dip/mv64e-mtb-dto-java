package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum RnaFusionStrand {
    PLUS, MINUS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PLUS: return "+";
            case MINUS: return "-";
        }
        return null;
    }

    @JsonCreator
    public static RnaFusionStrand forValue(String value) throws IOException {
        if (value.equals("+")) return PLUS;
        if (value.equals("-")) return MINUS;
        throw new IOException("Cannot deserialize RnaFusionStrand");
    }
}
