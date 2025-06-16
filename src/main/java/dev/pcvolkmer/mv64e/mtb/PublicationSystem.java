package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum PublicationSystem {
    PUBMED_NCBI_NLM_NIH_GOV, DOI_ORG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PUBMED_NCBI_NLM_NIH_GOV: return "https://pubmed.ncbi.nlm.nih.gov";
            case DOI_ORG: return "https://www.doi.org";
        }
        return null;
    }

    @JsonCreator
    public static PublicationSystem forValue(String value) throws IOException {
        if (value.equals("https://pubmed.ncbi.nlm.nih.gov")) return PUBMED_NCBI_NLM_NIH_GOV;
        if (value.equals("https://www.doi.org")) return DOI_ORG;
        throw new IOException("Cannot deserialize PublicationSystem");
    }
}
