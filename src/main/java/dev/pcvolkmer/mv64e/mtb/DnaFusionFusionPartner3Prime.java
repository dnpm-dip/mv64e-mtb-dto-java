package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class DnaFusionFusionPartner3Prime {
    private CodingChromosome chromosome;
    private CodingGene gene;
    private double position;

    @JsonProperty("chromosome")
    public CodingChromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(CodingChromosome value) { this.chromosome = value; }

    @JsonProperty("gene")
    public CodingGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(CodingGene value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }
}
