package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum HealthInsuranceCodingCode {
    BEI, BG, GKV, GPV, PKV, PPV, SEL, SKT, SOZ, UNK;

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
            case SKT: return "SKT";
            case SOZ: return "SOZ";
            case UNK: return "UNK";
        }
        return null;
    }

    @JsonCreator
    public static HealthInsuranceCodingCode forValue(String value) throws IOException {
        if (value.equals("BEI")) return BEI;
        if (value.equals("BG")) return BG;
        if (value.equals("GKV")) return GKV;
        if (value.equals("GPV")) return GPV;
        if (value.equals("PKV")) return PKV;
        if (value.equals("PPV")) return PPV;
        if (value.equals("SEL")) return SEL;
        if (value.equals("SKT")) return SKT;
        if (value.equals("SOZ")) return SOZ;
        if (value.equals("UNK")) return UNK;
        throw new IOException("Cannot deserialize HealthInsuranceCodingCode");
    }
}
