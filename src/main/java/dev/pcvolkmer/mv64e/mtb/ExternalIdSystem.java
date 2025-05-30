package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ExternalIdSystem {
    CANCER_SANGER_AC_UK_COSMIC, ENSEMBL_ORG, NCBI_NLM_NIH_GOV_ENTREZ, NCBI_NLM_NIH_GOV_SNP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CANCER_SANGER_AC_UK_COSMIC: return "https://cancer.sanger.ac.uk/cosmic";
            case ENSEMBL_ORG: return "https://www.ensembl.org";
            case NCBI_NLM_NIH_GOV_ENTREZ: return "https://www.ncbi.nlm.nih.gov/entrez";
            case NCBI_NLM_NIH_GOV_SNP: return "https://www.ncbi.nlm.nih.gov/snp";
        }
        return null;
    }

    @JsonCreator
    public static ExternalIdSystem forValue(String value) throws IOException {
        if (value.equals("https://cancer.sanger.ac.uk/cosmic")) return CANCER_SANGER_AC_UK_COSMIC;
        if (value.equals("https://www.ensembl.org")) return ENSEMBL_ORG;
        if (value.equals("https://www.ncbi.nlm.nih.gov/entrez")) return NCBI_NLM_NIH_GOV_ENTREZ;
        if (value.equals("https://www.ncbi.nlm.nih.gov/snp")) return NCBI_NLM_NIH_GOV_SNP;
        throw new IOException("Cannot deserialize ExternalIdSystem");
    }
}
