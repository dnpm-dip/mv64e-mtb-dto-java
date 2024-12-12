package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class DnaFusionFusionPartner5Prime {
    private CodingChromosome chromosome;
    private Gene gene;
    private double position;

    @JsonProperty("chromosome")
    public CodingChromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(CodingChromosome value) { this.chromosome = value; }

    @JsonProperty("gene")
    public Gene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(Gene value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }
}
