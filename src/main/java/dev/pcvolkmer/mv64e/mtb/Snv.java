package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Snv {
    private double allelicFrequency;
    private String altAllele;
    private Coding aminoAcidChange;
    private CodingChromosome chromosome;
    private String cosmicId;
    private String dbSnpId;
    private Coding dnaChange;
    private List<ExternalId> externalIds;
    private CodingGene gene;
    private String id;
    private Coding interpretation;
    private Patient patient;
    private Position position;
    private Coding proteinChange;
    private long readDepth;
    private String refAllele;
    private ExternalId transcriptId;

    @JsonProperty("allelicFrequency")
    public double getAllelicFrequency() { return allelicFrequency; }
    @JsonProperty("allelicFrequency")
    public void setAllelicFrequency(double value) { this.allelicFrequency = value; }

    @JsonProperty("altAllele")
    public String getAltAllele() { return altAllele; }
    @JsonProperty("altAllele")
    public void setAltAllele(String value) { this.altAllele = value; }

    @JsonProperty("aminoAcidChange")
    public Coding getAminoAcidChange() { return aminoAcidChange; }
    @JsonProperty("aminoAcidChange")
    public void setAminoAcidChange(Coding value) { this.aminoAcidChange = value; }

    @JsonProperty("chromosome")
    public CodingChromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(CodingChromosome value) { this.chromosome = value; }

    @JsonProperty("cosmicId")
    public String getCosmicId() { return cosmicId; }
    @JsonProperty("cosmicId")
    public void setCosmicId(String value) { this.cosmicId = value; }

    @JsonProperty("dbSNPId")
    public String getDbSnpId() { return dbSnpId; }
    @JsonProperty("dbSNPId")
    public void setDbSnpId(String value) { this.dbSnpId = value; }

    @JsonProperty("dnaChange")
    public Coding getDnaChange() { return dnaChange; }
    @JsonProperty("dnaChange")
    public void setDnaChange(Coding value) { this.dnaChange = value; }

    @JsonProperty("externalIds")
    public List<ExternalId> getExternalIds() { return externalIds; }
    @JsonProperty("externalIds")
    public void setExternalIds(List<ExternalId> value) { this.externalIds = value; }

    @JsonProperty("gene")
    public CodingGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(CodingGene value) { this.gene = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("interpretation")
    public Coding getInterpretation() { return interpretation; }
    @JsonProperty("interpretation")
    public void setInterpretation(Coding value) { this.interpretation = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

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
    public ExternalId getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(ExternalId value) { this.transcriptId = value; }
}
