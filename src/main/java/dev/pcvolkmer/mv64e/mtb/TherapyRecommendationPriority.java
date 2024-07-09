package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TherapyRecommendationPriority {
    PRIORITY_1, PRIORITY_2, PRIORITY_3, PRIORITY_4;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PRIORITY_1: return "1";
            case PRIORITY_2: return "2";
            case PRIORITY_3: return "3";
            case PRIORITY_4: return "4";
        }
        return null;
    }

    @JsonCreator
    public static TherapyRecommendationPriority forValue(String value) throws IOException {
        switch (value) {
            case "1":
                return PRIORITY_1;
            case "2":
                return PRIORITY_2;
            case "3":
                return PRIORITY_3;
            case "4":
                return PRIORITY_4;
        }
        throw new IOException("Cannot deserialize TherapyRecommendationPriority");
    }
}
