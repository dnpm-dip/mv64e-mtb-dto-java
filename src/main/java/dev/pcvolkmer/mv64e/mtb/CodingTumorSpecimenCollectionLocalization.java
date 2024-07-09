package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class CodingTumorSpecimenCollectionLocalization {
    private TumorSpecimenCollectionLocalization code;
    private String display;
    private String system;

    @JsonProperty("code")
    public TumorSpecimenCollectionLocalization getCode() { return code; }
    @JsonProperty("code")
    public void setCode(TumorSpecimenCollectionLocalization value) { this.code = value; }

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("system")
    public String getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(String value) { this.system = value; }
}
