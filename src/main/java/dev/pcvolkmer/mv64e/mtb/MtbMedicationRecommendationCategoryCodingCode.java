package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbMedicationRecommendationCategoryCodingCode {
    CH, HO, IM, SO, SZ, ZS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CH: return "CH";
            case HO: return "HO";
            case IM: return "IM";
            case SO: return "SO";
            case SZ: return "SZ";
            case ZS: return "ZS";
        }
        return null;
    }

    @JsonCreator
    public static MtbMedicationRecommendationCategoryCodingCode forValue(String value) throws IOException {
        if (value.equals("CH")) return CH;
        if (value.equals("HO")) return HO;
        if (value.equals("IM")) return IM;
        if (value.equals("SO")) return SO;
        if (value.equals("SZ")) return SZ;
        if (value.equals("ZS")) return ZS;
        throw new IOException("Cannot deserialize MtbMedicationRecommendationCategoryCodingCode");
    }
}
