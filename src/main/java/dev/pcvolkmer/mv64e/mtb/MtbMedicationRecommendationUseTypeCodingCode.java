package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbMedicationRecommendationUseTypeCodingCode {
    COMPASSIONATE, IN_LABEL, OFF_LABEL, SEC_PREVENTIVE, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPASSIONATE: return "compassionate";
            case IN_LABEL: return "in-label";
            case OFF_LABEL: return "off-label";
            case SEC_PREVENTIVE: return "sec-preventive";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static MtbMedicationRecommendationUseTypeCodingCode forValue(String value) throws IOException {
        if (value.equals("compassionate")) return COMPASSIONATE;
        if (value.equals("in-label")) return IN_LABEL;
        if (value.equals("off-label")) return OFF_LABEL;
        if (value.equals("sec-preventive")) return SEC_PREVENTIVE;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize MtbMedicationRecommendationUseTypeCodingCode");
    }
}
