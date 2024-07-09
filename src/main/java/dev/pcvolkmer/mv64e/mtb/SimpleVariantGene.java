package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class SimpleVariantGene {
    private String ensemblId;
    private String hgncId;

    @JsonProperty("ensemblId")
    public String getEnsemblId() { return ensemblId; }
    @JsonProperty("ensemblId")
    public void setEnsemblId(String value) { this.ensemblId = value; }

    @JsonProperty("hgncId")
    public String getHgncId() { return hgncId; }
    @JsonProperty("hgncId")
    public void setHgncId(String value) { this.hgncId = value; }
}
