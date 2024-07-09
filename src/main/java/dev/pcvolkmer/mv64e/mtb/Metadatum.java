package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Metadatum {
    private String kitManufacturer;
    private String kitType;
    private String pipeline;
    private String referenceGenome;
    private String sequencer;

    @JsonProperty("kitManufacturer")
    public String getKitManufacturer() { return kitManufacturer; }
    @JsonProperty("kitManufacturer")
    public void setKitManufacturer(String value) { this.kitManufacturer = value; }

    @JsonProperty("kitType")
    public String getKitType() { return kitType; }
    @JsonProperty("kitType")
    public void setKitType(String value) { this.kitType = value; }

    @JsonProperty("pipeline")
    public String getPipeline() { return pipeline; }
    @JsonProperty("pipeline")
    public void setPipeline(String value) { this.pipeline = value; }

    @JsonProperty("referenceGenome")
    public String getReferenceGenome() { return referenceGenome; }
    @JsonProperty("referenceGenome")
    public void setReferenceGenome(String value) { this.referenceGenome = value; }

    @JsonProperty("sequencer")
    public String getSequencer() { return sequencer; }
    @JsonProperty("sequencer")
    public void setSequencer(String value) { this.sequencer = value; }
}
