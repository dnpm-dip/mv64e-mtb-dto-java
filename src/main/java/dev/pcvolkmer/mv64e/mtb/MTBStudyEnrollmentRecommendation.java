package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBStudyEnrollmentRecommendation {
    private String id;
    private Date issuedOn;
    private CodingLevelOfEvidenceGrading levelOfEvidence;
    private List<CodingAtcUnregisteredMedication> medication;
    private Reference patient;
    private CodingRecommendationPriority priority;
    private Reference reason;
    private List<StudyReference> study;
    private List<GeneAlterationReference> supportingVariants;

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

    @JsonProperty("levelOfEvidence")
    public CodingLevelOfEvidenceGrading getLevelOfEvidence() { return levelOfEvidence; }
    @JsonProperty("levelOfEvidence")
    public void setLevelOfEvidence(CodingLevelOfEvidenceGrading value) { this.levelOfEvidence = value; }

    @JsonProperty("medication")
    public List<CodingAtcUnregisteredMedication> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<CodingAtcUnregisteredMedication> value) { this.medication = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("priority")
    public CodingRecommendationPriority getPriority() { return priority; }
    @JsonProperty("priority")
    public void setPriority(CodingRecommendationPriority value) { this.priority = value; }

    @JsonProperty("reason")
    public Reference getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(Reference value) { this.reason = value; }

    @JsonProperty("study")
    public List<StudyReference> getStudy() { return study; }
    @JsonProperty("study")
    public void setStudy(List<StudyReference> value) { this.study = value; }

    @JsonProperty("supportingVariants")
    public List<GeneAlterationReference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<GeneAlterationReference> value) { this.supportingVariants = value; }
}
