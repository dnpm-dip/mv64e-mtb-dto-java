package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class FollowUp {
    private Date date;
    private CodingFollowUpPatientStatus patientStatus;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("patientStatus")
    public CodingFollowUpPatientStatus getPatientStatus() { return patientStatus; }
    @JsonProperty("patientStatus")
    public void setPatientStatus(CodingFollowUpPatientStatus value) { this.patientStatus = value; }
}
