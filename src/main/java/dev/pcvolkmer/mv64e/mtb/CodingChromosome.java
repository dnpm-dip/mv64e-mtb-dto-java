package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class CodingChromosome {
    private ChromosomeCode code;
    private String display;
    private ChromosomeSystem system;

    @JsonProperty("code")
    public ChromosomeCode getCode() { return code; }
    @JsonProperty("code")
    public void setCode(ChromosomeCode value) { this.code = value; }

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("system")
    public ChromosomeSystem getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(ChromosomeSystem value) { this.system = value; }
}
