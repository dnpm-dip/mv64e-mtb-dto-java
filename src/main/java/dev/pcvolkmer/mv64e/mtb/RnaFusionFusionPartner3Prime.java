package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class RnaFusionFusionPartner3Prime {
    private String exonId;
    private Coding gene;
    private double position;
    private RNAFusionStrand strand;
    private TranscriptId transcriptId;

    @JsonProperty("exonId")
    public String getExonId() { return exonId; }
    @JsonProperty("exonId")
    public void setExonId(String value) { this.exonId = value; }

    @JsonProperty("gene")
    public Coding getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(Coding value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }

    @JsonProperty("strand")
    public RNAFusionStrand getStrand() { return strand; }
    @JsonProperty("strand")
    public void setStrand(RNAFusionStrand value) { this.strand = value; }

    @JsonProperty("transcriptId")
    public TranscriptId getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(TranscriptId value) { this.transcriptId = value; }
}
