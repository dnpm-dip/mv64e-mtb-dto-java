package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class CodingGene {
    private String code;
    private String display;
    private GeneSystem system;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("system")
    public GeneSystem getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(GeneSystem value) { this.system = value; }
}
