package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

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
