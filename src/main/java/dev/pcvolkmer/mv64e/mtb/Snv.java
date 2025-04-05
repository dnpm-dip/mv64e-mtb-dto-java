package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Snv {
    private double allelicFrequency;
    private String altAllele;
    private Chromosome chromosome;
    private Coding dnaChange;
    private String exonId;
    private List<VariantExternalId> externalIds;
    private Coding gene;
    private String id;
    private CodingClinVar interpretation;
    private List<CodingBaseVariantLocalization> localization;
    private Reference patient;
    private Position position;
    private Coding proteinChange;
    private long readDepth;
    private String refAllele;
    private TranscriptId transcriptId;

    @JsonProperty("allelicFrequency")
    public double getAllelicFrequency() { return allelicFrequency; }
    @JsonProperty("allelicFrequency")
    public void setAllelicFrequency(double value) { this.allelicFrequency = value; }

    @JsonProperty("altAllele")
    public String getAltAllele() { return altAllele; }
    @JsonProperty("altAllele")
    public void setAltAllele(String value) { this.altAllele = value; }

    @JsonProperty("chromosome")
    public Chromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(Chromosome value) { this.chromosome = value; }

    @JsonProperty("dnaChange")
    public Coding getDnaChange() { return dnaChange; }
    @JsonProperty("dnaChange")
    public void setDnaChange(Coding value) { this.dnaChange = value; }

    @JsonProperty("exonId")
    public String getExonId() { return exonId; }
    @JsonProperty("exonId")
    public void setExonId(String value) { this.exonId = value; }

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

    @JsonProperty("interpretation")
    public CodingClinVar getInterpretation() { return interpretation; }
    @JsonProperty("interpretation")
    public void setInterpretation(CodingClinVar value) { this.interpretation = value; }

    @JsonProperty("localization")
    public List<CodingBaseVariantLocalization> getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(List<CodingBaseVariantLocalization> value) { this.localization = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("position")
    public Position getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(Position value) { this.position = value; }

    @JsonProperty("proteinChange")
    public Coding getProteinChange() { return proteinChange; }
    @JsonProperty("proteinChange")
    public void setProteinChange(Coding value) { this.proteinChange = value; }

    @JsonProperty("readDepth")
    public long getReadDepth() { return readDepth; }
    @JsonProperty("readDepth")
    public void setReadDepth(long value) { this.readDepth = value; }

    @JsonProperty("refAllele")
    public String getRefAllele() { return refAllele; }
    @JsonProperty("refAllele")
    public void setRefAllele(String value) { this.refAllele = value; }

    @JsonProperty("transcriptId")
    public TranscriptId getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(TranscriptId value) { this.transcriptId = value; }
}
