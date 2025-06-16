package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbSystemicTherapyCategoryCodingCode {
    A, I, N, O, S;

    @JsonValue
    public String toValue() {
        switch (this) {
            case A: return "A";
            case I: return "I";
            case N: return "N";
            case O: return "O";
            case S: return "S";
        }
        return null;
    }

    @JsonCreator
    public static MtbSystemicTherapyCategoryCodingCode forValue(String value) throws IOException {
        if (value.equals("A")) return A;
        if (value.equals("I")) return I;
        if (value.equals("N")) return N;
        if (value.equals("O")) return O;
        if (value.equals("S")) return S;
        throw new IOException("Cannot deserialize MtbSystemicTherapyCategoryCodingCode");
    }
}
