package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class ClaimResponse {
    private Reference claim;
    private String id;
    private Date issuedOn;
    private Reference patient;
    private CodingClaimResponseStatus status;
    private CodingClaimResponseStatusReason statusReason;

    @JsonProperty("claim")
    public Reference getClaim() { return claim; }
    @JsonProperty("claim")
    public void setClaim(Reference value) { this.claim = value; }

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

    @JsonProperty("status")
    public CodingClaimResponseStatus getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(CodingClaimResponseStatus value) { this.status = value; }

    @JsonProperty("statusReason")
    public CodingClaimResponseStatusReason getStatusReason() { return statusReason; }
    @JsonProperty("statusReason")
    public void setStatusReason(CodingClaimResponseStatusReason value) { this.statusReason = value; }
}
