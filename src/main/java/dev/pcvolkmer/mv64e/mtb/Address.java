package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Address {
    private String municipalityCode;

    @JsonProperty("municipalityCode")
    public String getMunicipalityCode() { return municipalityCode; }
    @JsonProperty("municipalityCode")
    public void setMunicipalityCode(String value) { this.municipalityCode = value; }
}
