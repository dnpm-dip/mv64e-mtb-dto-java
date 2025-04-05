package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingMtbMedicationRecommendationCategoryCode {
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
    public static CodingMtbMedicationRecommendationCategoryCode forValue(String value) throws IOException {
        if (value.equals("CH")) return CH;
        if (value.equals("HO")) return HO;
        if (value.equals("IM")) return IM;
        if (value.equals("SO")) return SO;
        if (value.equals("SZ")) return SZ;
        if (value.equals("ZS")) return ZS;
        throw new IOException("Cannot deserialize CodingMtbMedicationRecommendationCategoryCode");
    }
}
