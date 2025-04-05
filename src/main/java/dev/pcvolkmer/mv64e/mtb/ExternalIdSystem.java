package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ExternalIdSystem {
    HTTPS_CANCER_SANGER_Ac_UK_COSMIC, HTTPS_Www_ENSEMBL_ORG, HTTPS_Www_NCBI_NLM_NIH_GOV_ENTREZ, HTTPS_Www_NCBI_NLM_NIH_GOV_SNP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HTTPS_CANCER_SANGER_Ac_UK_COSMIC: return "https://cancer.sanger.ac.uk/cosmic";
            case HTTPS_Www_ENSEMBL_ORG: return "https://www.ensembl.org";
            case HTTPS_Www_NCBI_NLM_NIH_GOV_ENTREZ: return "https://www.ncbi.nlm.nih.gov/entrez";
            case HTTPS_Www_NCBI_NLM_NIH_GOV_SNP: return "https://www.ncbi.nlm.nih.gov/snp";
        }
        return null;
    }

    @JsonCreator
    public static ExternalIdSystem forValue(String value) throws IOException {
        if (value.equals("https://cancer.sanger.ac.uk/cosmic")) return HTTPS_CANCER_SANGER_Ac_UK_COSMIC;
        if (value.equals("https://www.ensembl.org")) return HTTPS_Www_ENSEMBL_ORG;
        if (value.equals("https://www.ncbi.nlm.nih.gov/entrez")) return HTTPS_Www_NCBI_NLM_NIH_GOV_ENTREZ;
        if (value.equals("https://www.ncbi.nlm.nih.gov/snp")) return HTTPS_Www_NCBI_NLM_NIH_GOV_SNP;
        throw new IOException("Cannot deserialize ExternalIdSystem");
    }
}
