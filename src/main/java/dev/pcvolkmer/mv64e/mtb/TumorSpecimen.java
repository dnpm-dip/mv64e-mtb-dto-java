package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorSpecimen {
    private Collection collection;
    private Reference diagnosis;
    private String id;
    private Reference patient;
    private CodingTumorSpecimen type;

    @JsonProperty("collection")
    public Collection getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(Collection value) { this.collection = value; }

    @JsonProperty("diagnosis")
    public Reference getDiagnosis() { return diagnosis; }
    @JsonProperty("diagnosis")
    public void setDiagnosis(Reference value) { this.diagnosis = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("type")
    public CodingTumorSpecimen getType() { return type; }
    @JsonProperty("type")
    public void setType(CodingTumorSpecimen value) { this.type = value; }
}
