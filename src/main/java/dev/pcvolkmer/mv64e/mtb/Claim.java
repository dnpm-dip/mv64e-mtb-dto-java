package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Claim {
    private String id;
    private Date issuedOn;
    private Patient patient;
    private Recommendation recommendation;
    private Coding stage;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("recommendation")
    public Recommendation getRecommendation() { return recommendation; }
    @JsonProperty("recommendation")
    public void setRecommendation(Recommendation value) { this.recommendation = value; }

    @JsonProperty("stage")
    public Coding getStage() { return stage; }
    @JsonProperty("stage")
    public void setStage(Coding value) { this.stage = value; }
}
