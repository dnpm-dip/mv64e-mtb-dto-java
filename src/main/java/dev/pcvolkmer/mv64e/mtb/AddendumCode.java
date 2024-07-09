package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AddendumCode {
    IS, IV, R, Z;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IS: return "is";
            case IV: return "iv";
            case R: return "R";
            case Z: return "Z";
        }
        return null;
    }

    @JsonCreator
    public static AddendumCode forValue(String value) throws IOException {
        switch (value) {
            case "is":
                return IS;
            case "iv":
                return IV;
            case "R":
                return R;
            case "Z":
                return Z;
        }
        throw new IOException("Cannot deserialize AddendumCode");
    }
}
