package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class SomaticNgsReport {
    private String id;
    private Date issuedOn;
    private List<NgsReportMetadata> metadata;
    private Reference patient;
    private NgsReportResults results;
    private Reference specimen;
    private NgsReportCoding type;

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

    @JsonProperty("metadata")
    public List<NgsReportMetadata> getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(List<NgsReportMetadata> value) { this.metadata = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("results")
    public NgsReportResults getResults() { return results; }
    @JsonProperty("results")
    public void setResults(NgsReportResults value) { this.results = value; }

    @JsonProperty("specimen")
    public Reference getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(Reference value) { this.specimen = value; }

    @JsonProperty("type")
    public NgsReportCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(NgsReportCoding value) { this.type = value; }
}
