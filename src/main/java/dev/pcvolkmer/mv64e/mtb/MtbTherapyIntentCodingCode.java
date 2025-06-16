package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbTherapyIntentCodingCode {
    K, P, S, X;

    @JsonValue
    public String toValue() {
        switch (this) {
            case K: return "K";
            case P: return "P";
            case S: return "S";
            case X: return "X";
        }
        return null;
    }

    @JsonCreator
    public static MtbTherapyIntentCodingCode forValue(String value) throws IOException {
        if (value.equals("K")) return K;
        if (value.equals("P")) return P;
        if (value.equals("S")) return S;
        if (value.equals("X")) return X;
        throw new IOException("Cannot deserialize MtbTherapyIntentCodingCode");
    }
}
