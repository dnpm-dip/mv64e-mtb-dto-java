package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GeneSystem {
    HTTPS_Www_GENENAMES_ORG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HTTPS_Www_GENENAMES_ORG: return "https://www.genenames.org/";
        }
        return null;
    }

    @JsonCreator
    public static GeneSystem forValue(String value) throws IOException {
        if (value.equals("https://www.genenames.org/")) return HTTPS_Www_GENENAMES_ORG;
        throw new IOException("Cannot deserialize GeneSystem");
    }
}
