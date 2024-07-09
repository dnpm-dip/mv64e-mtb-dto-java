package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class NoTargetFinding {
    private String diagnosis;
    private Date issuedOn;
    private Patient patient;

    @JsonProperty("diagnosis")
    public String getDiagnosis() { return diagnosis; }
    @JsonProperty("diagnosis")
    public void setDiagnosis(String value) { this.diagnosis = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }
}
