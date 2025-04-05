package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBMedicationRecommendation {
    private CodingMtbMedicationRecommendationCategory category;
    private String id;
    private Date issuedOn;
    private LevelOfEvidence levelOfEvidence;
    private List<CodingAtcUnregisteredMedication> medication;
    private Reference patient;
    private CodingRecommendationPriority priority;
    private Reference reason;
    private List<GeneAlterationReference> supportingVariants;
    private CodingMtbMedicationRecommendationUseType useType;

    @JsonProperty("category")
    public CodingMtbMedicationRecommendationCategory getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(CodingMtbMedicationRecommendationCategory value) { this.category = value; }

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
    public LevelOfEvidence getLevelOfEvidence() { return levelOfEvidence; }
    @JsonProperty("levelOfEvidence")
    public void setLevelOfEvidence(LevelOfEvidence value) { this.levelOfEvidence = value; }

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

    @JsonProperty("supportingVariants")
    public List<GeneAlterationReference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<GeneAlterationReference> value) { this.supportingVariants = value; }

    @JsonProperty("useType")
    public CodingMtbMedicationRecommendationUseType getUseType() { return useType; }
    @JsonProperty("useType")
    public void setUseType(CodingMtbMedicationRecommendationUseType value) { this.useType = value; }
}
