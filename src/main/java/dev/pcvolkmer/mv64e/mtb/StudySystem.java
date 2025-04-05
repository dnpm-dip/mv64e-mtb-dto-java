package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StudySystem {
    DRKS, EUDAMED, EUDRA_Ct, NCT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DRKS: return "DRKS";
            case EUDAMED: return "EUDAMED";
            case EUDRA_Ct: return "Eudra-CT";
            case NCT: return "NCT";
        }
        return null;
    }

    @JsonCreator
    public static StudySystem forValue(String value) throws IOException {
        if (value.equals("DRKS")) return DRKS;
        if (value.equals("EUDAMED")) return EUDAMED;
        if (value.equals("Eudra-CT")) return EUDRA_Ct;
        if (value.equals("NCT")) return NCT;
        throw new IOException("Cannot deserialize StudySystem");
    }
}
