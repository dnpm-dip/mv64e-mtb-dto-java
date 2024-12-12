package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Value {
    private String unit;
    private double value;

    @JsonProperty("unit")
    public String getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(String value) { this.unit = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}
