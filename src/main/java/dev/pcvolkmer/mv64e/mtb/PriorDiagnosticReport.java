package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class PriorDiagnosticReport {
    private String id;
    private Date issuedOn;
    private Reference patient;
    private Reference performer;
    private List<String> results;
    private Reference specimen;
    private CodingMolecularDiagnosticReport type;

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
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("performer")
    public Reference getPerformer() { return performer; }
    @JsonProperty("performer")
    public void setPerformer(Reference value) { this.performer = value; }

    @JsonProperty("results")
    public List<String> getResults() { return results; }
    @JsonProperty("results")
    public void setResults(List<String> value) { this.results = value; }

    @JsonProperty("specimen")
    public Reference getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(Reference value) { this.specimen = value; }

    @JsonProperty("type")
    public CodingMolecularDiagnosticReport getType() { return type; }
    @JsonProperty("type")
    public void setType(CodingMolecularDiagnosticReport value) { this.type = value; }
}
