package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class GeneticCounselingRecommendation {
    private String id;
    private Date issuedOn;
    private Reference patient;
    private CodingGeneticCounselingRecommendationReason reason;

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

    @JsonProperty("reason")
    public CodingGeneticCounselingRecommendationReason getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(CodingGeneticCounselingRecommendationReason value) { this.reason = value; }
}
