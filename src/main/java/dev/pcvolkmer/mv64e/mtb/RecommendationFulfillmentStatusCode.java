package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RecommendationFulfillmentStatusCode {
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
    public static RecommendationFulfillmentStatusCode forValue(String value) throws IOException {
        if (value.equals("complete")) return COMPLETE;
        if (value.equals("partial")) return PARTIAL;
        throw new IOException("Cannot deserialize RecommendationFulfillmentStatusCode");
    }
}
