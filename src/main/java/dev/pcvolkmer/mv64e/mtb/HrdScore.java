package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class HrdScore {
    private Components components;
    private String id;
    private HrdScoreInterpretationCoding interpretation;
    private Reference patient;
    private Reference specimen;
    private double value;

    @JsonProperty("components")
    public Components getComponents() { return components; }
    @JsonProperty("components")
    public void setComponents(Components value) { this.components = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("interpretation")
    public HrdScoreInterpretationCoding getInterpretation() { return interpretation; }
    @JsonProperty("interpretation")
    public void setInterpretation(HrdScoreInterpretationCoding value) { this.interpretation = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("specimen")
    public Reference getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(Reference value) { this.specimen = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}
