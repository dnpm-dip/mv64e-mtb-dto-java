package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class TumorCellContent {
    private String id;
    private TumorCellContentMethod method;
    private String specimen;
    private double value;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("method")
    public TumorCellContentMethod getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(TumorCellContentMethod value) { this.method = value; }

    @JsonProperty("specimen")
    public String getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(String value) { this.specimen = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}
