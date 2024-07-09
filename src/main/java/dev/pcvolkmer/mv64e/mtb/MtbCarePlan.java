package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MtbCarePlan {
    private String description;
    private String diagnosis;
    private String geneticCounsellingRequest;
    private String id;
    private Date issuedOn;
    private NoTargetFinding noTargetFinding;
    private Patient patient;
    private List<String> recommendations;
    private List<String> studyInclusionRequests;

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("diagnosis")
    public String getDiagnosis() { return diagnosis; }
    @JsonProperty("diagnosis")
    public void setDiagnosis(String value) { this.diagnosis = value; }

    @JsonProperty("geneticCounsellingRequest")
    public String getGeneticCounsellingRequest() { return geneticCounsellingRequest; }
    @JsonProperty("geneticCounsellingRequest")
    public void setGeneticCounsellingRequest(String value) { this.geneticCounsellingRequest = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("noTargetFinding")
    public NoTargetFinding getNoTargetFinding() { return noTargetFinding; }
    @JsonProperty("noTargetFinding")
    public void setNoTargetFinding(NoTargetFinding value) { this.noTargetFinding = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("recommendations")
    public List<String> getRecommendations() { return recommendations; }
    @JsonProperty("recommendations")
    public void setRecommendations(List<String> value) { this.recommendations = value; }

    @JsonProperty("studyInclusionRequests")
    public List<String> getStudyInclusionRequests() { return studyInclusionRequests; }
    @JsonProperty("studyInclusionRequests")
    public void setStudyInclusionRequests(List<String> value) { this.studyInclusionRequests = value; }
}
