package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbSystemicTherapyDosageDensityCodingCode {
    OVER_50, UNDER_50;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OVER_50: return "over-50%";
            case UNDER_50: return "under-50%";
        }
        return null;
    }

    @JsonCreator
    public static MtbSystemicTherapyDosageDensityCodingCode forValue(String value) throws IOException {
        if (value.equals("over-50%")) return OVER_50;
        if (value.equals("under-50%")) return UNDER_50;
        throw new IOException("Cannot deserialize MtbSystemicTherapyDosageDensityCodingCode");
    }
}
