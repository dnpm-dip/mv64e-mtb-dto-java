package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PublicationSystem {
    HTTPS_PUBMED_NCBI_NLM_NIH_GOV, HTTPS_Www_DOI_ORG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HTTPS_PUBMED_NCBI_NLM_NIH_GOV: return "https://pubmed.ncbi.nlm.nih.gov";
            case HTTPS_Www_DOI_ORG: return "https://www.doi.org";
        }
        return null;
    }

    @JsonCreator
    public static PublicationSystem forValue(String value) throws IOException {
        if (value.equals("https://pubmed.ncbi.nlm.nih.gov")) return HTTPS_PUBMED_NCBI_NLM_NIH_GOV;
        if (value.equals("https://www.doi.org")) return HTTPS_Www_DOI_ORG;
        throw new IOException("Cannot deserialize PublicationSystem");
    }
}
