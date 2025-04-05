package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBCarePlan {
    private GeneticCounselingRecommendation geneticCounselingRecommendation;
    private List<HistologyReevaluationRequest> histologyReevaluationRequests;
    private String id;
    private Date issuedOn;
    private List<MTBMedicationRecommendation> medicationRecommendations;
    private List<String> notes;
    private Reference patient;
    private List<ProcedureRecommendation> procedureRecommendations;
    private Reference reason;
    private List<RebiopsyRequest> rebiopsyRequests;
    private CodingMtbCarePlanStatusReason statusReason;
    private List<MTBStudyEnrollmentRecommendation> studyEnrollmentRecommendations;

    @JsonProperty("geneticCounselingRecommendation")
    public GeneticCounselingRecommendation getGeneticCounselingRecommendation() { return geneticCounselingRecommendation; }
    @JsonProperty("geneticCounselingRecommendation")
    public void setGeneticCounselingRecommendation(GeneticCounselingRecommendation value) { this.geneticCounselingRecommendation = value; }

    @JsonProperty("histologyReevaluationRequests")
    public List<HistologyReevaluationRequest> getHistologyReevaluationRequests() { return histologyReevaluationRequests; }
    @JsonProperty("histologyReevaluationRequests")
    public void setHistologyReevaluationRequests(List<HistologyReevaluationRequest> value) { this.histologyReevaluationRequests = value; }

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

    @JsonProperty("medicationRecommendations")
    public List<MTBMedicationRecommendation> getMedicationRecommendations() { return medicationRecommendations; }
    @JsonProperty("medicationRecommendations")
    public void setMedicationRecommendations(List<MTBMedicationRecommendation> value) { this.medicationRecommendations = value; }

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("procedureRecommendations")
    public List<ProcedureRecommendation> getProcedureRecommendations() { return procedureRecommendations; }
    @JsonProperty("procedureRecommendations")
    public void setProcedureRecommendations(List<ProcedureRecommendation> value) { this.procedureRecommendations = value; }

    @JsonProperty("reason")
    public Reference getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(Reference value) { this.reason = value; }

    @JsonProperty("rebiopsyRequests")
    public List<RebiopsyRequest> getRebiopsyRequests() { return rebiopsyRequests; }
    @JsonProperty("rebiopsyRequests")
    public void setRebiopsyRequests(List<RebiopsyRequest> value) { this.rebiopsyRequests = value; }

    @JsonProperty("statusReason")
    public CodingMtbCarePlanStatusReason getStatusReason() { return statusReason; }
    @JsonProperty("statusReason")
    public void setStatusReason(CodingMtbCarePlanStatusReason value) { this.statusReason = value; }

    @JsonProperty("studyEnrollmentRecommendations")
    public List<MTBStudyEnrollmentRecommendation> getStudyEnrollmentRecommendations() { return studyEnrollmentRecommendations; }
    @JsonProperty("studyEnrollmentRecommendations")
    public void setStudyEnrollmentRecommendations(List<MTBStudyEnrollmentRecommendation> value) { this.studyEnrollmentRecommendations = value; }
}
