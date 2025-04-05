package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class OncoProcedure {
    private Reference basedOn;
    private CodingOncoProcedure code;
    private String id;
    private CodingMtbTherapyIntent intent;
    private List<String> notes;
    private Reference patient;
    private PeriodDate period;
    private Reference reason;
    private Date recordedOn;
    private CodingTherapyStatus status;
    private CodingMtbTherapyStatusReason statusReason;
    private Long therapyLine;

    @JsonProperty("basedOn")
    public Reference getBasedOn() { return basedOn; }
    @JsonProperty("basedOn")
    public void setBasedOn(Reference value) { this.basedOn = value; }

    @JsonProperty("code")
    public CodingOncoProcedure getCode() { return code; }
    @JsonProperty("code")
    public void setCode(CodingOncoProcedure value) { this.code = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("intent")
    public CodingMtbTherapyIntent getIntent() { return intent; }
    @JsonProperty("intent")
    public void setIntent(CodingMtbTherapyIntent value) { this.intent = value; }

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodDate value) { this.period = value; }

    @JsonProperty("reason")
    public Reference getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(Reference value) { this.reason = value; }

    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("status")
    public CodingTherapyStatus getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(CodingTherapyStatus value) { this.status = value; }

    @JsonProperty("statusReason")
    public CodingMtbTherapyStatusReason getStatusReason() { return statusReason; }
    @JsonProperty("statusReason")
    public void setStatusReason(CodingMtbTherapyStatusReason value) { this.statusReason = value; }

    @JsonProperty("therapyLine")
    public Long getTherapyLine() { return therapyLine; }
    @JsonProperty("therapyLine")
    public void setTherapyLine(Long value) { this.therapyLine = value; }
}
