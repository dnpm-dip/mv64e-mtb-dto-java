package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MtbMedicationRecommendation {
    private MtbMedicationRecommendationCategoryCoding category;
    private String id;
    private Date issuedOn;
    private LevelOfEvidence levelOfEvidence;
    private List<AtcUnregisteredMedicationCoding> medication;
    private Reference patient;
    private RecommendationPriorityCoding priority;
    private Reference reason;
    private List<GeneAlterationReference> supportingVariants;
    private MtbMedicationRecommendationUseTypeCoding useType;

    @JsonProperty("category")
    public MtbMedicationRecommendationCategoryCoding getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(MtbMedicationRecommendationCategoryCoding value) { this.category = value; }

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
    public List<AtcUnregisteredMedicationCoding> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<AtcUnregisteredMedicationCoding> value) { this.medication = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("priority")
    public RecommendationPriorityCoding getPriority() { return priority; }
    @JsonProperty("priority")
    public void setPriority(RecommendationPriorityCoding value) { this.priority = value; }

    @JsonProperty("reason")
    public Reference getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(Reference value) { this.reason = value; }

    @JsonProperty("supportingVariants")
    public List<GeneAlterationReference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<GeneAlterationReference> value) { this.supportingVariants = value; }

    @JsonProperty("useType")
    public MtbMedicationRecommendationUseTypeCoding getUseType() { return useType; }
    @JsonProperty("useType")
    public void setUseType(MtbMedicationRecommendationUseTypeCoding value) { this.useType = value; }
}
