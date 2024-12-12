package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class Tmb {
    private String id;
    private Coding interpretation;
    private Reference patient;
    private Reference specimen;
    private Value value;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("interpretation")
    public Coding getInterpretation() { return interpretation; }
    @JsonProperty("interpretation")
    public void setInterpretation(Coding value) { this.interpretation = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("specimen")
    public Reference getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(Reference value) { this.specimen = value; }

    @JsonProperty("value")
    public Value getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Value value) { this.value = value; }
}
