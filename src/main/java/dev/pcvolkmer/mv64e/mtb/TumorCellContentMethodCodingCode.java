package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum TumorCellContentMethodCodingCode {
    BIOINFORMATIC, HISTOLOGIC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BIOINFORMATIC: return "bioinformatic";
            case HISTOLOGIC: return "histologic";
        }
        return null;
    }

    @JsonCreator
    public static TumorCellContentMethodCodingCode forValue(String value) throws IOException {
        if (value.equals("bioinformatic")) return BIOINFORMATIC;
        if (value.equals("histologic")) return HISTOLOGIC;
        throw new IOException("Cannot deserialize TumorCellContentMethodCodingCode");
    }
}
