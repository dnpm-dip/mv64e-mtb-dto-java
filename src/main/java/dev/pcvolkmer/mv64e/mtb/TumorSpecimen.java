package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorSpecimen {
    private Collection collection;
    private Coding icd10;
    private String id;
    private Patient patient;
    private CodingTumorSpecimenType type;

    @JsonProperty("collection")
    public Collection getCollection() { return collection; }
    @JsonProperty("collection")
    public void setCollection(Collection value) { this.collection = value; }

    @JsonProperty("icd10")
    public Coding getIcd10() { return icd10; }
    @JsonProperty("icd10")
    public void setIcd10(Coding value) { this.icd10 = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("type")
    public CodingTumorSpecimenType getType() { return type; }
    @JsonProperty("type")
    public void setType(CodingTumorSpecimenType value) { this.type = value; }
}
