package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Consent {
    private String id;
    private Patient patient;
    private ConsentStatus status;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("status")
    public ConsentStatus getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(ConsentStatus value) { this.status = value; }
}
