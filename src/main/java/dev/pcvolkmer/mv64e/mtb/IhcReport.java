package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class IhcReport {
    private List<String> blockIds;
    private String id;
    private Date issuedOn;
    private String journalId;
    private Reference patient;
    private IhcReportResults results;
    private Reference specimen;

    @JsonProperty("blockIds")
    public List<String> getBlockIds() { return blockIds; }
    @JsonProperty("blockIds")
    public void setBlockIds(List<String> value) { this.blockIds = value; }

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

    @JsonProperty("journalId")
    public String getJournalId() { return journalId; }
    @JsonProperty("journalId")
    public void setJournalId(String value) { this.journalId = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("results")
    public IhcReportResults getResults() { return results; }
    @JsonProperty("results")
    public void setResults(IhcReportResults value) { this.results = value; }

    @JsonProperty("specimen")
    public Reference getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(Reference value) { this.specimen = value; }
}
