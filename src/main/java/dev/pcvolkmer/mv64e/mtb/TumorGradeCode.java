package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TumorGradeCode {
    G1, G2, G3, G4, GX;

    @JsonValue
    public String toValue() {
        switch (this) {
            case G1: return "G1";
            case G2: return "G2";
            case G3: return "G3";
            case G4: return "G4";
            case GX: return "GX";
        }
        return null;
    }

    @JsonCreator
    public static TumorGradeCode forValue(String value) throws IOException {
        switch (value) {
            case "G1":
                return G1;
            case "G2":
                return G2;
            case "G3":
                return G3;
            case "G4":
                return G4;
            case "GX":
                return GX;
        }
        throw new IOException("Cannot deserialize TumorGradeCode");
    }
}
