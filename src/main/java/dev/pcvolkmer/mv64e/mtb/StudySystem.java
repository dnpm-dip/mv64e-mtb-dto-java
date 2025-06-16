package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum StudySystem {
    DRKS, EUDAMED, EUDRA_CT, NCT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DRKS: return "DRKS";
            case EUDAMED: return "EUDAMED";
            case EUDRA_CT: return "Eudra-CT";
            case NCT: return "NCT";
        }
        return null;
    }

    @JsonCreator
    public static StudySystem forValue(String value) throws IOException {
        if (value.equals("DRKS")) return DRKS;
        if (value.equals("EUDAMED")) return EUDAMED;
        if (value.equals("Eudra-CT")) return EUDRA_CT;
        if (value.equals("NCT")) return NCT;
        throw new IOException("Cannot deserialize StudySystem");
    }
}
