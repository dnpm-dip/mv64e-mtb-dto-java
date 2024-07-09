package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class DnaFusionFusionPartner3Prime {
    private Chromosome chromosome;
    private PurpleGene gene;
    private double position;

    @JsonProperty("chromosome")
    public Chromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(Chromosome value) { this.chromosome = value; }

    @JsonProperty("gene")
    public PurpleGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(PurpleGene value) { this.gene = value; }

    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }
}
