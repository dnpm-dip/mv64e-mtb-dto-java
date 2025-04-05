package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class RNASeq {
    private Long cohortRanking;
    private List<VariantExternalId> externalIds;
    private Coding gene;
    private String id;
    private Long librarySize;
    private List<CodingBaseVariantLocalization> localization;
    private Reference patient;
    private long rawCounts;
    private Boolean tissueCorrectedExpression;
    private TranscriptId transcriptId;
    private double transcriptsPerMillion;
    private Reference variant;

    @JsonProperty("cohortRanking")
    public Long getCohortRanking() { return cohortRanking; }
    @JsonProperty("cohortRanking")
    public void setCohortRanking(Long value) { this.cohortRanking = value; }

    @JsonProperty("externalIds")
    public List<VariantExternalId> getExternalIds() { return externalIds; }
    @JsonProperty("externalIds")
    public void setExternalIds(List<VariantExternalId> value) { this.externalIds = value; }

    @JsonProperty("gene")
    public Coding getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(Coding value) { this.gene = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("librarySize")
    public Long getLibrarySize() { return librarySize; }
    @JsonProperty("librarySize")
    public void setLibrarySize(Long value) { this.librarySize = value; }

    @JsonProperty("localization")
    public List<CodingBaseVariantLocalization> getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(List<CodingBaseVariantLocalization> value) { this.localization = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("rawCounts")
    public long getRawCounts() { return rawCounts; }
    @JsonProperty("rawCounts")
    public void setRawCounts(long value) { this.rawCounts = value; }

    @JsonProperty("tissueCorrectedExpression")
    public Boolean getTissueCorrectedExpression() { return tissueCorrectedExpression; }
    @JsonProperty("tissueCorrectedExpression")
    public void setTissueCorrectedExpression(Boolean value) { this.tissueCorrectedExpression = value; }

    @JsonProperty("transcriptId")
    public TranscriptId getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(TranscriptId value) { this.transcriptId = value; }

    @JsonProperty("transcriptsPerMillion")
    public double getTranscriptsPerMillion() { return transcriptsPerMillion; }
    @JsonProperty("transcriptsPerMillion")
    public void setTranscriptsPerMillion(double value) { this.transcriptsPerMillion = value; }

    @JsonProperty("variant")
    public Reference getVariant() { return variant; }
    @JsonProperty("variant")
    public void setVariant(Reference value) { this.variant = value; }
}
