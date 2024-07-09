package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class DnaFusionFusionPartner5Prime {
    private Chromosome chromosome;
    private FluffyGene gene;
    private double position;

    @JsonProperty("chromosome")
    public Chromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(Chromosome value) { this.chromosome = value; }

    @JsonProperty("gene")
    public FluffyGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(FluffyGene value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }
}
