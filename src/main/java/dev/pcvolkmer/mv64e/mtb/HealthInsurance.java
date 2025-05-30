package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class HealthInsurance {
    private Reference reference;
    private HealthInsuranceCoding type;

    @JsonProperty("reference")
    public Reference getReference() { return reference; }
    @JsonProperty("reference")
    public void setReference(Reference value) { this.reference = value; }

    @JsonProperty("type")
    public HealthInsuranceCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(HealthInsuranceCoding value) { this.type = value; }
}
