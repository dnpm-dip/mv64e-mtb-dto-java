package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorMorphologySpecimen {
    private String id;
    private SpecimenType type;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("type")
    public SpecimenType getType() { return type; }
    @JsonProperty("type")
    public void setType(SpecimenType value) { this.type = value; }
}
