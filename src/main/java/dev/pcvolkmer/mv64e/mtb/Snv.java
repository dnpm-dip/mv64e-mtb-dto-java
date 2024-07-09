package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Snv {
    private double allelicFrequency;
    private String altAllele;
    private Coding aminoAcidChange;
    private Chromosome chromosome;
    private String cosmicId;
    private String dbSnpId;
    private Coding dnaChange;
    private SimpleVariantGene gene;
    private String id;
    private Coding interpretation;
    private long readDepth;
    private String refAllele;
    private StartEnd startEnd;

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
    public Chromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(Chromosome value) { this.chromosome = value; }

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

    @JsonProperty("gene")
    public SimpleVariantGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(SimpleVariantGene value) { this.gene = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("interpretation")
    public Coding getInterpretation() { return interpretation; }
    @JsonProperty("interpretation")
    public void setInterpretation(Coding value) { this.interpretation = value; }

    @JsonProperty("readDepth")
    public long getReadDepth() { return readDepth; }
    @JsonProperty("readDepth")
    public void setReadDepth(long value) { this.readDepth = value; }

    @JsonProperty("refAllele")
    public String getRefAllele() { return refAllele; }
    @JsonProperty("refAllele")
    public void setRefAllele(String value) { this.refAllele = value; }

    @JsonProperty("startEnd")
    public StartEnd getStartEnd() { return startEnd; }
    @JsonProperty("startEnd")
    public void setStartEnd(StartEnd value) { this.startEnd = value; }
}
