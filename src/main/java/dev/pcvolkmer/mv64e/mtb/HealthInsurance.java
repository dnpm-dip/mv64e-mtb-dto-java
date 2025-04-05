package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class HealthInsurance {
    private Reference reference;
    private CodingHealthInsurance type;

    @JsonProperty("reference")
    public Reference getReference() { return reference; }
    @JsonProperty("reference")
    public void setReference(Reference value) { this.reference = value; }

    @JsonProperty("type")
    public CodingHealthInsurance getType() { return type; }
    @JsonProperty("type")
    public void setType(CodingHealthInsurance value) { this.type = value; }
}
