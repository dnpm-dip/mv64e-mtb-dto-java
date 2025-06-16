package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum MtbSystemicTherapyRecommendationFulfillmentStatusCodingCode {
    COMPLETE, PARTIAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPLETE: return "complete";
            case PARTIAL: return "partial";
        }
        return null;
    }

    @JsonCreator
    public static MtbSystemicTherapyRecommendationFulfillmentStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("complete")) return COMPLETE;
        if (value.equals("partial")) return PARTIAL;
        throw new IOException("Cannot deserialize MtbSystemicTherapyRecommendationFulfillmentStatusCodingCode");
    }
}
