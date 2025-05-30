package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RecistCodingCode {
    CR, MR, NA, PD, PR, SD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CR: return "CR";
            case MR: return "MR";
            case NA: return "NA";
            case PD: return "PD";
            case PR: return "PR";
            case SD: return "SD";
        }
        return null;
    }

    @JsonCreator
    public static RecistCodingCode forValue(String value) throws IOException {
        if (value.equals("CR")) return CR;
        if (value.equals("MR")) return MR;
        if (value.equals("NA")) return NA;
        if (value.equals("PD")) return PD;
        if (value.equals("PR")) return PR;
        if (value.equals("SD")) return SD;
        throw new IOException("Cannot deserialize RecistCodingCode");
    }
}
