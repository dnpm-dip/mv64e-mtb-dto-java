package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TumorSpecimenCollectionLocalization {
    METASTASIS, PRIMARY_TUMOR, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case METASTASIS: return "metastasis";
            case PRIMARY_TUMOR: return "primary-tumor";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static TumorSpecimenCollectionLocalization forValue(String value) throws IOException {
        switch (value) {
            case "metastasis":
                return METASTASIS;
            case "primary-tumor":
                return PRIMARY_TUMOR;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize TumorSpecimenCollectionLocalization");
    }
}
