package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class RnaFusionFusionPartner3Prime {
    private String exon;
    private CodingGene gene;
    private double position;
    private RNAFusionStrand strand;
    private String transcriptId;

    @JsonProperty("exon")
    public String getExon() { return exon; }
    @JsonProperty("exon")
    public void setExon(String value) { this.exon = value; }

    @JsonProperty("gene")
    public CodingGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(CodingGene value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }

    @JsonProperty("strand")
    public RNAFusionStrand getStrand() { return strand; }
    @JsonProperty("strand")
    public void setStrand(RNAFusionStrand value) { this.strand = value; }

    @JsonProperty("transcriptId")
    public String getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(String value) { this.transcriptId = value; }
}
