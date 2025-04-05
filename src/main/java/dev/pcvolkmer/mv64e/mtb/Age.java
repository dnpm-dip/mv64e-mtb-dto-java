package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Age {
    private Unit unit;
    private double value;

    @JsonProperty("unit")
    public Unit getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(Unit value) { this.unit = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}
