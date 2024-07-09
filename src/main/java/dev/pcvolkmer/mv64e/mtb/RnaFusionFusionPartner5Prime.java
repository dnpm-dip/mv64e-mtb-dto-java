package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class RnaFusionFusionPartner5Prime {
    private String exon;
    private StickyGene gene;
    private double position;
    private RnaFusionStrand strand;
    private String transcriptId;

    @JsonProperty("exon")
    public String getExon() { return exon; }
    @JsonProperty("exon")
    public void setExon(String value) { this.exon = value; }

    @JsonProperty("gene")
    public StickyGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(StickyGene value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }

    @JsonProperty("strand")
    public RnaFusionStrand getStrand() { return strand; }
    @JsonProperty("strand")
    public void setStrand(RnaFusionStrand value) { this.strand = value; }

    @JsonProperty("transcriptId")
    public String getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(String value) { this.transcriptId = value; }
}
