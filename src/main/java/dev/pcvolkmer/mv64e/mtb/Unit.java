package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Unit {
    MONTHS, YEARS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MONTHS: return "Months";
            case YEARS: return "Years";
        }
        return null;
    }

    @JsonCreator
    public static Unit forValue(String value) throws IOException {
        if (value.equals("Months")) return MONTHS;
        if (value.equals("Years")) return YEARS;
        throw new IOException("Cannot deserialize Unit");
    }
}
