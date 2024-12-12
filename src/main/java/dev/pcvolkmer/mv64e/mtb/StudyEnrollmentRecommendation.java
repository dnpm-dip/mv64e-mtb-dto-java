package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class StudyEnrollmentRecommendation {
    private String id;
    private Date issuedOn;
    private Coding levelOfEvidence;
    private Patient patient;
    private Reference reason;
    private List<Study> studies;
    private List<Reference> supportingVariants;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("levelOfEvidence")
    public Coding getLevelOfEvidence() { return levelOfEvidence; }
    @JsonProperty("levelOfEvidence")
    public void setLevelOfEvidence(Coding value) { this.levelOfEvidence = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("reason")
    public Reference getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(Reference value) { this.reason = value; }

    @JsonProperty("studies")
    public List<Study> getStudies() { return studies; }
    @JsonProperty("studies")
    public void setStudies(List<Study> value) { this.studies = value; }

    @JsonProperty("supportingVariants")
    public List<Reference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<Reference> value) { this.supportingVariants = value; }
}
