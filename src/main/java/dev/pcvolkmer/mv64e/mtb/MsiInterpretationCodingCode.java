package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MsiInterpretationCodingCode {
    MMR_DEFICIENT, MMR_PROFICIENT, MSI_HIGH, MSI_LOW, STABLE, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MMR_DEFICIENT: return "mmr-deficient";
            case MMR_PROFICIENT: return "mmr-proficient";
            case MSI_HIGH: return "msi-high";
            case MSI_LOW: return "msi-low";
            case STABLE: return "stable";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static MsiInterpretationCodingCode forValue(String value) throws IOException {
        if (value.equals("mmr-deficient")) return MMR_DEFICIENT;
        if (value.equals("mmr-proficient")) return MMR_PROFICIENT;
        if (value.equals("msi-high")) return MSI_HIGH;
        if (value.equals("msi-low")) return MSI_LOW;
        if (value.equals("stable")) return STABLE;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize MSIInterpretationCodingCode");
    }
}
