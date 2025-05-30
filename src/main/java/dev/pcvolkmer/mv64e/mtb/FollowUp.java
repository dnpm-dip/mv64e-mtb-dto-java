package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class FollowUp {
    private Date date;
    private Date lastContactDate;
    private Reference patient;
    private FollowUpPatientStatusCoding patientStatus;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("lastContactDate")
    public Date getLastContactDate() { return lastContactDate; }
    @JsonProperty("lastContactDate")
    public void setLastContactDate(Date value) { this.lastContactDate = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("patientStatus")
    public FollowUpPatientStatusCoding getPatientStatus() { return patientStatus; }
    @JsonProperty("patientStatus")
    public void setPatientStatus(FollowUpPatientStatusCoding value) { this.patientStatus = value; }
}
