package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorMorphology {
    private String id;
    private String note;
    private Patient patient;
    private String specimen;
    private Coding value;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("note")
    public String getNote() { return note; }
    @JsonProperty("note")
    public void setNote(String value) { this.note = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("specimen")
    public String getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(String value) { this.specimen = value; }

    @JsonProperty("value")
    public Coding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Coding value) { this.value = value; }
}
