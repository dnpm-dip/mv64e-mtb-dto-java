package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class EXTId {
    private EXTIdSystem system;
    private String value;

    @JsonProperty("system")
    public EXTIdSystem getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(EXTIdSystem value) { this.system = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
