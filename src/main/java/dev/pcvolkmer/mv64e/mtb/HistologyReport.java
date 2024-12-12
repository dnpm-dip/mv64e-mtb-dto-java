package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class HistologyReport {
    private String id;
    private Date issuedOn;
    private Patient patient;
    private HistologyReportResults results;
    private HistologyReportSpecimen specimen;

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

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("results")
    public HistologyReportResults getResults() { return results; }
    @JsonProperty("results")
    public void setResults(HistologyReportResults value) { this.results = value; }

    @JsonProperty("specimen")
    public HistologyReportSpecimen getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(HistologyReportSpecimen value) { this.specimen = value; }
}
