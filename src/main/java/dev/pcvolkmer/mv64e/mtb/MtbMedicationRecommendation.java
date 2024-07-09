package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MtbMedicationRecommendation {
    private String diagnosis;
    private String id;
    private Date issuedOn;
    private LevelOfEvidence levelOfEvidence;
    private List<Coding> medication;
    private String ngsReport;
    private Patient patient;
    private TherapyRecommendationPriority priority;
    private List<String> supportingVariants;

    @JsonProperty("diagnosis")
    public String getDiagnosis() { return diagnosis; }
    @JsonProperty("diagnosis")
    public void setDiagnosis(String value) { this.diagnosis = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("levelOfEvidence")
    public LevelOfEvidence getLevelOfEvidence() { return levelOfEvidence; }
    @JsonProperty("levelOfEvidence")
    public void setLevelOfEvidence(LevelOfEvidence value) { this.levelOfEvidence = value; }

    @JsonProperty("medication")
    public List<Coding> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<Coding> value) { this.medication = value; }

    @JsonProperty("ngsReport")
    public String getNgsReport() { return ngsReport; }
    @JsonProperty("ngsReport")
    public void setNgsReport(String value) { this.ngsReport = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("priority")
    public TherapyRecommendationPriority getPriority() { return priority; }
    @JsonProperty("priority")
    public void setPriority(TherapyRecommendationPriority value) { this.priority = value; }

    @JsonProperty("supportingVariants")
    public List<String> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<String> value) { this.supportingVariants = value; }
}
