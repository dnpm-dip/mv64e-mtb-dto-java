package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TranscriptIdSystem {
    HTTPS_Www_ENSEMBL_ORG, HTTPS_Www_NCBI_NLM_NIH_GOV_REFSEQ;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HTTPS_Www_ENSEMBL_ORG: return "https://www.ensembl.org";
            case HTTPS_Www_NCBI_NLM_NIH_GOV_REFSEQ: return "https://www.ncbi.nlm.nih.gov/refseq";
        }
        return null;
    }

    @JsonCreator
    public static TranscriptIdSystem forValue(String value) throws IOException {
        if (value.equals("https://www.ensembl.org")) return HTTPS_Www_ENSEMBL_ORG;
        if (value.equals("https://www.ncbi.nlm.nih.gov/refseq")) return HTTPS_Www_NCBI_NLM_NIH_GOV_REFSEQ;
        throw new IOException("Cannot deserialize TranscriptIdSystem");
    }
}
