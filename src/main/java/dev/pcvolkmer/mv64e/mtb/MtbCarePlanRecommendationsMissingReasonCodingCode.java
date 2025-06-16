package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbCarePlanRecommendationsMissingReasonCodingCode {
    NO_TARGET;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NO_TARGET: return "no-target";
        }
        return null;
    }

    @JsonCreator
    public static MtbCarePlanRecommendationsMissingReasonCodingCode forValue(String value) throws IOException {
        if (value.equals("no-target")) return NO_TARGET;
        throw new IOException("Cannot deserialize MtbCarePlanRecommendationsMissingReasonCodingCode");
    }
}
