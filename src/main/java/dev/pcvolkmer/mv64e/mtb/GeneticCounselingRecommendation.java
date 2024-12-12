package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class GeneticCounselingRecommendation {
    private String id;
    private Date issuedOn;
    private Patient patient;
    private Coding reason;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("reason")
    public Coding getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(Coding value) { this.reason = value; }
}
