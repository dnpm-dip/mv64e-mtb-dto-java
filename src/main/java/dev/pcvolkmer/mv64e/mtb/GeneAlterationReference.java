package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class GeneAlterationReference {
    private String display;
    private Coding gene;
    private Reference variant;

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("gene")
    public Coding getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(Coding value) { this.gene = value; }

    @JsonProperty("variant")
    public Reference getVariant() { return variant; }
    @JsonProperty("variant")
    public void setVariant(Reference value) { this.variant = value; }
}
