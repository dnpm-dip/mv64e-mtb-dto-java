package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum RequestedMedicationSystem {
    FHIR_DE_CODE_SYSTEM_BFARM_ATC, UNDEFINED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FHIR_DE_CODE_SYSTEM_BFARM_ATC: return "http://fhir.de/CodeSystem/bfarm/atc";
            case UNDEFINED: return "undefined";
        }
        return null;
    }

    @JsonCreator
    public static RequestedMedicationSystem forValue(String value) throws IOException {
        if (value.equals("http://fhir.de/CodeSystem/bfarm/atc")) return FHIR_DE_CODE_SYSTEM_BFARM_ATC;
        if (value.equals("undefined")) return UNDEFINED;
        throw new IOException("Cannot deserialize RequestedMedicationSystem");
    }
}
