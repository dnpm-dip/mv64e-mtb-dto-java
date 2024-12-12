package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Components {
    private double loh;
    private double lst;
    private double tai;

    @JsonProperty("loh")
    public double getLoh() { return loh; }
    @JsonProperty("loh")
    public void setLoh(double value) { this.loh = value; }

    @JsonProperty("lst")
    public double getLst() { return lst; }
    @JsonProperty("lst")
    public void setLst(double value) { this.lst = value; }

    @JsonProperty("tai")
    public double getTai() { return tai; }
    @JsonProperty("tai")
    public void setTai(double value) { this.tai = value; }
}
