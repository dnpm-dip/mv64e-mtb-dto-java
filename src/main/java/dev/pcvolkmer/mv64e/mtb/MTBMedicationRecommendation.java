package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBMedicationRecommendation {
    private String id;
    private Reference indication;
    private Date issuedOn;
    private LevelOfEvidence levelOfEvidence;
    private List<Coding> medication;
    private String ngsReport;
    private Patient patient;
    private CodingTherapyRecommendationPriority priority;
    private List<Reference> supportingVariants;

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
    public CodingTherapyRecommendationPriority getPriority() { return priority; }
    @JsonProperty("priority")
    public void setPriority(CodingTherapyRecommendationPriority value) { this.priority = value; }

    @JsonProperty("supportingVariants")
    public List<Reference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<Reference> value) { this.supportingVariants = value; }
}
