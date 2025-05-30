package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MtbDiagnosis {
    private Coding code;
    private List<Coding> germlineCodes;
    private Grading grading;
    private MtbDiagnosisGuidelineTreatmentStatusCoding guidelineTreatmentStatus;
    private List<Reference> histology;
    private String id;
    private List<String> notes;
    private Reference patient;
    private Date recordedOn;
    private Staging staging;
    private Coding topography;
    private Type type;

    @JsonProperty("code")
    public Coding getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Coding value) { this.code = value; }

    @JsonProperty("germlineCodes")
    public List<Coding> getGermlineCodes() { return germlineCodes; }
    @JsonProperty("germlineCodes")
    public void setGermlineCodes(List<Coding> value) { this.germlineCodes = value; }

    @JsonProperty("grading")
    public Grading getGrading() { return grading; }
    @JsonProperty("grading")
    public void setGrading(Grading value) { this.grading = value; }

    @JsonProperty("guidelineTreatmentStatus")
    public MtbDiagnosisGuidelineTreatmentStatusCoding getGuidelineTreatmentStatus() { return guidelineTreatmentStatus; }
    @JsonProperty("guidelineTreatmentStatus")
    public void setGuidelineTreatmentStatus(MtbDiagnosisGuidelineTreatmentStatusCoding value) { this.guidelineTreatmentStatus = value; }

    @JsonProperty("histology")
    public List<Reference> getHistology() { return histology; }
    @JsonProperty("histology")
    public void setHistology(List<Reference> value) { this.histology = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("staging")
    public Staging getStaging() { return staging; }
    @JsonProperty("staging")
    public void setStaging(Staging value) { this.staging = value; }

    @JsonProperty("topography")
    public Coding getTopography() { return topography; }
    @JsonProperty("topography")
    public void setTopography(Coding value) { this.topography = value; }

    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }
}
