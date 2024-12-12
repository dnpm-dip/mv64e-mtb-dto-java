package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBCarePlan {
    private String diagnosis;
    private GeneticCounselingRecommendation geneticCounselingRecommendation;
    private String id;
    private Reference indication;
    private Date issuedOn;
    private List<MTBMedicationRecommendation> medicationRecommendations;
    private NoTargetFinding noTargetFinding;
    private String notes;
    private Patient patient;
    private CodingCarePlanStatusReason statusReason;
    private List<StudyEnrollmentRecommendation> studyEnrollmentRecommendations;

    @JsonProperty("diagnosis")
    public String getDiagnosis() { return diagnosis; }
    @JsonProperty("diagnosis")
    public void setDiagnosis(String value) { this.diagnosis = value; }

    @JsonProperty("geneticCounselingRecommendation")
    public GeneticCounselingRecommendation getGeneticCounselingRecommendation() { return geneticCounselingRecommendation; }
    @JsonProperty("geneticCounselingRecommendation")
    public void setGeneticCounselingRecommendation(GeneticCounselingRecommendation value) { this.geneticCounselingRecommendation = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("indication")
    public Reference getIndication() { return indication; }
    @JsonProperty("indication")
    public void setIndication(Reference value) { this.indication = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("medicationRecommendations")
    public List<MTBMedicationRecommendation> getMedicationRecommendations() { return medicationRecommendations; }
    @JsonProperty("medicationRecommendations")
    public void setMedicationRecommendations(List<MTBMedicationRecommendation> value) { this.medicationRecommendations = value; }

    @JsonProperty("noTargetFinding")
    public NoTargetFinding getNoTargetFinding() { return noTargetFinding; }
    @JsonProperty("noTargetFinding")
    public void setNoTargetFinding(NoTargetFinding value) { this.noTargetFinding = value; }

    @JsonProperty("notes")
    public String getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(String value) { this.notes = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("statusReason")
    public CodingCarePlanStatusReason getStatusReason() { return statusReason; }
    @JsonProperty("statusReason")
    public void setStatusReason(CodingCarePlanStatusReason value) { this.statusReason = value; }

    @JsonProperty("studyEnrollmentRecommendations")
    public List<StudyEnrollmentRecommendation> getStudyEnrollmentRecommendations() { return studyEnrollmentRecommendations; }
    @JsonProperty("studyEnrollmentRecommendations")
    public void setStudyEnrollmentRecommendations(List<StudyEnrollmentRecommendation> value) { this.studyEnrollmentRecommendations = value; }
}
