package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingResponseMethodCode {
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
    public static CodingResponseMethodCode forValue(String value) throws IOException {
        if (value.equals("RANO")) return RANO;
        if (value.equals("RECIST")) return RECIST;
        throw new IOException("Cannot deserialize CodingResponseMethodCode");
    }
}
