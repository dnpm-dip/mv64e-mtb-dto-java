package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MTBMedicationTherapy {
    private String basedOn;
    private String diagnosis;
    private String id;
    private Reference indication;
    private List<Coding> medication;
    private String notes;
    private Patient patient;
    private PeriodLocalDate period;
    private Date recordedOn;
    private CodingTherapyStatus status;
    private CodingTherapyStatusReason statusReason;
    private Long therapyLine;

    @JsonProperty("basedOn")
    public String getBasedOn() { return basedOn; }
    @JsonProperty("basedOn")
    public void setBasedOn(String value) { this.basedOn = value; }

    @JsonProperty("diagnosis")
    public String getDiagnosis() { return diagnosis; }
    @JsonProperty("diagnosis")
    public void setDiagnosis(String value) { this.diagnosis = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("indication")
    public Reference getIndication() { return indication; }
    @JsonProperty("indication")
    public void setIndication(Reference value) { this.indication = value; }

    @JsonProperty("medication")
    public List<Coding> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<Coding> value) { this.medication = value; }

    @JsonProperty("notes")
    public String getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(String value) { this.notes = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodLocalDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodLocalDate value) { this.period = value; }

    @JsonProperty("recordedOn")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("status")
    public CodingTherapyStatus getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(CodingTherapyStatus value) { this.status = value; }

    @JsonProperty("statusReason")
    public CodingTherapyStatusReason getStatusReason() { return statusReason; }
    @JsonProperty("statusReason")
    public void setStatusReason(CodingTherapyStatusReason value) { this.statusReason = value; }

    @JsonProperty("therapyLine")
    public Long getTherapyLine() { return therapyLine; }
    @JsonProperty("therapyLine")
    public void setTherapyLine(Long value) { this.therapyLine = value; }
}
