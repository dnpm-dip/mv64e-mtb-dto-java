package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingHealthInsuranceCode {
    BEI, BG, GKV, GPV, PKV, PPV, SEL, SOZ, UNK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEI: return "BEI";
            case BG: return "BG";
            case GKV: return "GKV";
            case GPV: return "GPV";
            case PKV: return "PKV";
            case PPV: return "PPV";
            case SEL: return "SEL";
            case SOZ: return "SOZ";
            case UNK: return "UNK";
        }
        return null;
    }

    @JsonCreator
    public static CodingHealthInsuranceCode forValue(String value) throws IOException {
        if (value.equals("BEI")) return BEI;
        if (value.equals("BG")) return BG;
        if (value.equals("GKV")) return GKV;
        if (value.equals("GPV")) return GPV;
        if (value.equals("PKV")) return PKV;
        if (value.equals("PPV")) return PPV;
        if (value.equals("SEL")) return SEL;
        if (value.equals("SOZ")) return SOZ;
        if (value.equals("UNK")) return UNK;
        throw new IOException("Cannot deserialize CodingHealthInsuranceCode");
    }
}
