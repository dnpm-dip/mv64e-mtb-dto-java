package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SystemEnum {
    HTTPS_PUBMED_NCBI_NLM_NIH_GOV;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HTTPS_PUBMED_NCBI_NLM_NIH_GOV: return "https://pubmed.ncbi.nlm.nih.gov/";
        }
        return null;
    }

    @JsonCreator
    public static SystemEnum forValue(String value) throws IOException {
        if (value.equals("https://pubmed.ncbi.nlm.nih.gov/")) return HTTPS_PUBMED_NCBI_NLM_NIH_GOV;
        throw new IOException("Cannot deserialize SystemEnum");
    }
}
