package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorMorphology {
    private String id;
    private String notes;
    private Patient patient;
    private TumorMorphologySpecimen specimen;
    private Coding value;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("notes")
    public String getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(String value) { this.notes = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("specimen")
    public TumorMorphologySpecimen getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(TumorMorphologySpecimen value) { this.specimen = value; }

    @JsonProperty("value")
    public Coding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Coding value) { this.value = value; }
}
