package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SpecimenType {
    TUMOR_SPECIMEN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TUMOR_SPECIMEN: return "TumorSpecimen";
        }
        return null;
    }

    @JsonCreator
    public static SpecimenType forValue(String value) throws IOException {
        if (value.equals("TumorSpecimen")) return TUMOR_SPECIMEN;
        throw new IOException("Cannot deserialize SpecimenType");
    }
}
