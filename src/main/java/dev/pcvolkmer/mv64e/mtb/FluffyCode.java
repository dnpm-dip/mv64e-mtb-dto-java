package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FluffyCode {
    CR, MR, NA, NYA, PD, PR, SD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CR: return "CR";
            case MR: return "MR";
            case NA: return "NA";
            case NYA: return "NYA";
            case PD: return "PD";
            case PR: return "PR";
            case SD: return "SD";
        }
        return null;
    }

    @JsonCreator
    public static FluffyCode forValue(String value) throws IOException {
        switch (value) {
            case "CR":
                return CR;
            case "MR":
                return MR;
            case "NA":
                return NA;
            case "NYA":
                return NYA;
            case "PD":
                return PD;
            case "PR":
                return PR;
            case "SD":
                return SD;
        }
        throw new IOException("Cannot deserialize FluffyCode");
    }
}
