package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ResponseTherapyType {
    MTB_MEDICATION_THERAPY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MTB_MEDICATION_THERAPY: return "MTBMedicationTherapy";
        }
        return null;
    }

    @JsonCreator
    public static ResponseTherapyType forValue(String value) throws IOException {
        if (value.equals("MTBMedicationTherapy")) return MTB_MEDICATION_THERAPY;
        throw new IOException("Cannot deserialize ResponseTherapyType");
    }
}
