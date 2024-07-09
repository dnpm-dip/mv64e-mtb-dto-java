package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class CodingGender {
    private Gender code;
    private String display;
    private String system;
    private String version;

    @JsonProperty("code")
    public Gender getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Gender value) { this.code = value; }

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("system")
    public String getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(String value) { this.system = value; }

    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
}
