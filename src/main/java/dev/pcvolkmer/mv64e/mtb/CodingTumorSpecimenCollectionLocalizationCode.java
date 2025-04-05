package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingTumorSpecimenCollectionLocalizationCode {
    CELLFREE_DNA, LOCAL_RECURRENCE, METASTASIS, PRIMARY_TUMOR, REGIONAL_LYMPH_NODES, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CELLFREE_DNA: return "cellfree-dna";
            case LOCAL_RECURRENCE: return "local-recurrence";
            case METASTASIS: return "metastasis";
            case PRIMARY_TUMOR: return "primary-tumor";
            case REGIONAL_LYMPH_NODES: return "regional-lymph-nodes";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static CodingTumorSpecimenCollectionLocalizationCode forValue(String value) throws IOException {
        if (value.equals("cellfree-dna")) return CELLFREE_DNA;
        if (value.equals("local-recurrence")) return LOCAL_RECURRENCE;
        if (value.equals("metastasis")) return METASTASIS;
        if (value.equals("primary-tumor")) return PRIMARY_TUMOR;
        if (value.equals("regional-lymph-nodes")) return REGIONAL_LYMPH_NODES;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize CodingTumorSpecimenCollectionLocalizationCode");
    }
}
