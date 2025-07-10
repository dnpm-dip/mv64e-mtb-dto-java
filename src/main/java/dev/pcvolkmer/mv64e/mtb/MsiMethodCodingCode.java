package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MsiMethodCodingCode {
    BIOINFORMATIC, IHC, PCR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BIOINFORMATIC: return "bioinformatic";
            case IHC: return "IHC";
            case PCR: return "PCR";
        }
        return null;
    }

    @JsonCreator
    public static MsiMethodCodingCode forValue(String value) throws IOException {
        if (value.equals("bioinformatic")) return BIOINFORMATIC;
        if (value.equals("IHC")) return IHC;
        if (value.equals("PCR")) return PCR;
        throw new IOException("Cannot deserialize MSIMethodCodingCode");
    }
}
