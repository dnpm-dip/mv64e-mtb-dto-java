package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Patient {
    private String id;
    private PatientType type;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("type")
    public PatientType getType() { return type; }
    @JsonProperty("type")
    public void setType(PatientType value) { this.type = value; }
}
