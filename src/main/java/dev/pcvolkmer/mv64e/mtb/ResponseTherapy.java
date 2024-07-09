package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class ResponseTherapy {
    private String id;
    private ResponseTherapyType type;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("type")
    public ResponseTherapyType getType() { return type; }
    @JsonProperty("type")
    public void setType(ResponseTherapyType value) { this.type = value; }
}
