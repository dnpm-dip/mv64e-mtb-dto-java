package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class Claim {
    private String id;
    private Date issuedOn;
    private Reference patient;
    private Reference recommendation;
    private List<CodingAtcUnregisteredMedication> requestedMedication;
    private CodingClaimStage stage;

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
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("recommendation")
    public Reference getRecommendation() { return recommendation; }
    @JsonProperty("recommendation")
    public void setRecommendation(Reference value) { this.recommendation = value; }

    @JsonProperty("requestedMedication")
    public List<CodingAtcUnregisteredMedication> getRequestedMedication() { return requestedMedication; }
    @JsonProperty("requestedMedication")
    public void setRequestedMedication(List<CodingAtcUnregisteredMedication> value) { this.requestedMedication = value; }

    @JsonProperty("stage")
    public CodingClaimStage getStage() { return stage; }
    @JsonProperty("stage")
    public void setStage(CodingClaimStage value) { this.stage = value; }
}
