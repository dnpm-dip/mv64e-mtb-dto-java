package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ChromosomeSystem {
    CHROMOSOME;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHROMOSOME: return "chromosome";
        }
        return null;
    }

    @JsonCreator
    public static ChromosomeSystem forValue(String value) throws IOException {
        if (value.equals("chromosome")) return CHROMOSOME;
        throw new IOException("Cannot deserialize ChromosomeSystem");
    }
}
