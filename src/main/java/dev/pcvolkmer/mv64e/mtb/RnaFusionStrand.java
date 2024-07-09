package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RnaFusionStrand {
    EMPTY, RNA_FUSION_STRAND;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPTY: return "+";
            case RNA_FUSION_STRAND: return "-";
        }
        return null;
    }

    @JsonCreator
    public static RnaFusionStrand forValue(String value) throws IOException {
        if (value.equals("+")) return EMPTY;
        if (value.equals("-")) return RNA_FUSION_STRAND;
        throw new IOException("Cannot deserialize RNAFusionStrand");
    }
}
