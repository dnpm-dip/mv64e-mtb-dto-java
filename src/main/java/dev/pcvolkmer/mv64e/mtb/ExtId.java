package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class ExtId {
    private SystemEnum system;
    private String value;

    @JsonProperty("system")
    public SystemEnum getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(SystemEnum value) { this.system = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
