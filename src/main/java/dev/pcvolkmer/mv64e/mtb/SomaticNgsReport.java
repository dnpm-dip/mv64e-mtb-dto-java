package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class SomaticNgsReport {
    private String id;
    private Date issuedOn;
    private List<Metadatum> metadata;
    private Double msi;
    private Patient patient;
    private NgsReportResults results;
    private Coding sequencingType;
    private NgsReportSpecimen specimen;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("metadata")
    public List<Metadatum> getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(List<Metadatum> value) { this.metadata = value; }

    @JsonProperty("msi")
    public Double getMsi() { return msi; }
    @JsonProperty("msi")
    public void setMsi(Double value) { this.msi = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("results")
    public NgsReportResults getResults() { return results; }
    @JsonProperty("results")
    public void setResults(NgsReportResults value) { this.results = value; }

    @JsonProperty("sequencingType")
    public Coding getSequencingType() { return sequencingType; }
    @JsonProperty("sequencingType")
    public void setSequencingType(Coding value) { this.sequencingType = value; }

    @JsonProperty("specimen")
    public NgsReportSpecimen getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(NgsReportSpecimen value) { this.specimen = value; }
}
