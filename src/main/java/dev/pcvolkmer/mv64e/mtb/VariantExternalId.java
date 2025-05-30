package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class VariantExternalId {
    private ExternalIdSystem system;
    private String value;

    @JsonProperty("system")
    public ExternalIdSystem getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(ExternalIdSystem value) { this.system = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
