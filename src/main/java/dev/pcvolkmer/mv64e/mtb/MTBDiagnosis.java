package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBDiagnosis {
    private Coding code;
    private Coding guidelineTreatmentStatus;
    private List<String> histologyResults;
    private Coding icdO3T;
    private String id;
    private Patient patient;
    private Date recordedOn;
    private List<StageHistory> stageHistory;
    private Coding topography;
    private CodingTumorGrade tumorGrade;
    private Coding whoGrade;
    private Coding whoGrading;

    @JsonProperty("code")
    public Coding getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Coding value) { this.code = value; }

    @JsonProperty("guidelineTreatmentStatus")
    public Coding getGuidelineTreatmentStatus() { return guidelineTreatmentStatus; }
    @JsonProperty("guidelineTreatmentStatus")
    public void setGuidelineTreatmentStatus(Coding value) { this.guidelineTreatmentStatus = value; }

    @JsonProperty("histologyResults")
    public List<String> getHistologyResults() { return histologyResults; }
    @JsonProperty("histologyResults")
    public void setHistologyResults(List<String> value) { this.histologyResults = value; }

    @JsonProperty("icdO3T")
    public Coding getIcdO3T() { return icdO3T; }
    @JsonProperty("icdO3T")
    public void setIcdO3T(Coding value) { this.icdO3T = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("recordedOn")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("stageHistory")
    public List<StageHistory> getStageHistory() { return stageHistory; }
    @JsonProperty("stageHistory")
    public void setStageHistory(List<StageHistory> value) { this.stageHistory = value; }

    @JsonProperty("topography")
    public Coding getTopography() { return topography; }
    @JsonProperty("topography")
    public void setTopography(Coding value) { this.topography = value; }

    @JsonProperty("tumorGrade")
    public CodingTumorGrade getTumorGrade() { return tumorGrade; }
    @JsonProperty("tumorGrade")
    public void setTumorGrade(CodingTumorGrade value) { this.tumorGrade = value; }

    @JsonProperty("whoGrade")
    public Coding getWhoGrade() { return whoGrade; }
    @JsonProperty("whoGrade")
    public void setWhoGrade(Coding value) { this.whoGrade = value; }

    @JsonProperty("whoGrading")
    public Coding getWhoGrading() { return whoGrading; }
    @JsonProperty("whoGrading")
    public void setWhoGrading(Coding value) { this.whoGrading = value; }
}
