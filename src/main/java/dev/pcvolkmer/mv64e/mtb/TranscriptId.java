package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TranscriptId {
    private TranscriptIdSystem system;
    private String value;

    @JsonProperty("system")
    public TranscriptIdSystem getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(TranscriptIdSystem value) { this.system = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
