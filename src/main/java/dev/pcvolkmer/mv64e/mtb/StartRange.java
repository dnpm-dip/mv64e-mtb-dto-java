package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class StartRange {
    private Double end;
    private double start;

    @JsonProperty("end")
    public Double getEnd() { return end; }
    @JsonProperty("end")
    public void setEnd(Double value) { this.end = value; }

    @JsonProperty("start")
    public double getStart() { return start; }
    @JsonProperty("start")
    public void setStart(double value) { this.start = value; }
}
