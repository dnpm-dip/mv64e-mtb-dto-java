package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class HealthInsurance {
    private String display;
    private ExternalId extId;
    private Type type;

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("extId")
    public ExternalId getExtId() { return extId; }
    @JsonProperty("extId")
    public void setExtId(ExternalId value) { this.extId = value; }

    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }
}
