package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class MtbMedicationTherapy {
    private String basedOn;
    private String diagnosis;
    private String id;
    private List<Coding> medication;
    private CodingTherapyStatusReason notDoneReason;
    private String note;
    private Patient patient;
    private PeriodLocalDate period;
    private CodingTherapyStatusReason reasonStopped;
    private Date recordedOn;
    private TherapyStatus status;
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

    @JsonProperty("medication")
    public List<Coding> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<Coding> value) { this.medication = value; }

    @JsonProperty("notDoneReason")
    public CodingTherapyStatusReason getNotDoneReason() { return notDoneReason; }
    @JsonProperty("notDoneReason")
    public void setNotDoneReason(CodingTherapyStatusReason value) { this.notDoneReason = value; }

    @JsonProperty("note")
    public String getNote() { return note; }
    @JsonProperty("note")
    public void setNote(String value) { this.note = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodLocalDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodLocalDate value) { this.period = value; }

    @JsonProperty("reasonStopped")
    public CodingTherapyStatusReason getReasonStopped() { return reasonStopped; }
    @JsonProperty("reasonStopped")
    public void setReasonStopped(CodingTherapyStatusReason value) { this.reasonStopped = value; }

    @JsonProperty("recordedOn")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("status")
    public TherapyStatus getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(TherapyStatus value) { this.status = value; }

    @JsonProperty("therapyLine")
    public Long getTherapyLine() { return therapyLine; }
    @JsonProperty("therapyLine")
    public void setTherapyLine(Long value) { this.therapyLine = value; }
}
