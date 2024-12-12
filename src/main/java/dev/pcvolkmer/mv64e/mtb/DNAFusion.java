package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class DNAFusion {
    private DnaFusionFusionPartner3Prime fusionPartner3Prime;
    private DnaFusionFusionPartner5Prime fusionPartner5Prime;
    private String id;
    private long reportedNumReads;

    @JsonProperty("fusionPartner3prime")
    public DnaFusionFusionPartner3Prime getFusionPartner3Prime() { return fusionPartner3Prime; }
    @JsonProperty("fusionPartner3prime")
    public void setFusionPartner3Prime(DnaFusionFusionPartner3Prime value) { this.fusionPartner3Prime = value; }

    @JsonProperty("fusionPartner5prime")
    public DnaFusionFusionPartner5Prime getFusionPartner5Prime() { return fusionPartner5Prime; }
    @JsonProperty("fusionPartner5prime")
    public void setFusionPartner5Prime(DnaFusionFusionPartner5Prime value) { this.fusionPartner5Prime = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("reportedNumReads")
    public long getReportedNumReads() { return reportedNumReads; }
    @JsonProperty("reportedNumReads")
    public void setReportedNumReads(long value) { this.reportedNumReads = value; }
}
