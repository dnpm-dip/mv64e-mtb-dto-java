package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingMtbSystemicTherapyCategoryCode {
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
    public static CodingMtbSystemicTherapyCategoryCode forValue(String value) throws IOException {
        if (value.equals("A")) return A;
        if (value.equals("I")) return I;
        if (value.equals("N")) return N;
        if (value.equals("O")) return O;
        if (value.equals("S")) return S;
        throw new IOException("Cannot deserialize CodingMtbSystemicTherapyCategoryCode");
    }
}
