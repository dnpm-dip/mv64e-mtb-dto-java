package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MtbProcedureRecommendationCategoryCodingCode {
    AS, OP, SO, ST, WS, WW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AS: return "AS";
            case OP: return "OP";
            case SO: return "SO";
            case ST: return "ST";
            case WS: return "WS";
            case WW: return "WW";
        }
        return null;
    }

    @JsonCreator
    public static MtbProcedureRecommendationCategoryCodingCode forValue(String value) throws IOException {
        if (value.equals("AS")) return AS;
        if (value.equals("OP")) return OP;
        if (value.equals("SO")) return SO;
        if (value.equals("ST")) return ST;
        if (value.equals("WS")) return WS;
        if (value.equals("WW")) return WW;
        throw new IOException("Cannot deserialize MtbProcedureRecommendationCategoryCodingCode");
    }
}
