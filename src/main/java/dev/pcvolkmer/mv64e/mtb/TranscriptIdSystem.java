package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TranscriptIdSystem {
    ENSEMBL_ORG, NCBI_NLM_NIH_GOV_REFSEQ;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ENSEMBL_ORG: return "https://www.ensembl.org";
            case NCBI_NLM_NIH_GOV_REFSEQ: return "https://www.ncbi.nlm.nih.gov/refseq";
        }
        return null;
    }

    @JsonCreator
    public static TranscriptIdSystem forValue(String value) throws IOException {
        if (value.equals("https://www.ensembl.org")) return ENSEMBL_ORG;
        if (value.equals("https://www.ncbi.nlm.nih.gov/refseq")) return NCBI_NLM_NIH_GOV_REFSEQ;
        throw new IOException("Cannot deserialize TranscriptIdSystem");
    }
}
