package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorCellContent {
    private String id;
    private CodingTumorCellContentMethod method;
    private Patient patient;
    private TumorCellContentSpecimen specimen;
    private double value;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("method")
    public CodingTumorCellContentMethod getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(CodingTumorCellContentMethod value) { this.method = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("specimen")
    public TumorCellContentSpecimen getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(TumorCellContentSpecimen value) { this.specimen = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}
