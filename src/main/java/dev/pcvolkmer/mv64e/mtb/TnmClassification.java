package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TnmClassification {
    private Coding metastasis;
    private Coding nodes;
    private Coding tumor;

    @JsonProperty("metastasis")
    public Coding getMetastasis() { return metastasis; }
    @JsonProperty("metastasis")
    public void setMetastasis(Coding value) { this.metastasis = value; }

    @JsonProperty("nodes")
    public Coding getNodes() { return nodes; }
    @JsonProperty("nodes")
    public void setNodes(Coding value) { this.nodes = value; }

    @JsonProperty("tumor")
    public Coding getTumor() { return tumor; }
    @JsonProperty("tumor")
    public void setTumor(Coding value) { this.tumor = value; }
}
