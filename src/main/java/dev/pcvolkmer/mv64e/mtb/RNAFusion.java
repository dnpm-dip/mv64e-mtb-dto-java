package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class RNAFusion {
    private String cosmicId;
    private String effect;
    private RnaFusionFusionPartner3Prime fusionPartner3Prime;
    private RnaFusionFusionPartner5Prime fusionPartner5Prime;
    private String id;
    private long reportedNumReads;

    @JsonProperty("cosmicId")
    public String getCosmicId() { return cosmicId; }
    @JsonProperty("cosmicId")
    public void setCosmicId(String value) { this.cosmicId = value; }

    @JsonProperty("effect")
    public String getEffect() { return effect; }
    @JsonProperty("effect")
    public void setEffect(String value) { this.effect = value; }

    @JsonProperty("fusionPartner3prime")
    public RnaFusionFusionPartner3Prime getFusionPartner3Prime() { return fusionPartner3Prime; }
    @JsonProperty("fusionPartner3prime")
    public void setFusionPartner3Prime(RnaFusionFusionPartner3Prime value) { this.fusionPartner3Prime = value; }

    @JsonProperty("fusionPartner5prime")
    public RnaFusionFusionPartner5Prime getFusionPartner5Prime() { return fusionPartner5Prime; }
    @JsonProperty("fusionPartner5prime")
    public void setFusionPartner5Prime(RnaFusionFusionPartner5Prime value) { this.fusionPartner5Prime = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("reportedNumReads")
    public long getReportedNumReads() { return reportedNumReads; }
    @JsonProperty("reportedNumReads")
    public void setReportedNumReads(long value) { this.reportedNumReads = value; }
}
