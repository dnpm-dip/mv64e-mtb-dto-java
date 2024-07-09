package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class ReferencePublication {
    private ExtId extId;
    private String type;
    private String uri;

    @JsonProperty("extId")
    public ExtId getExtId() { return extId; }
    @JsonProperty("extId")
    public void setExtId(ExtId value) { this.extId = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("uri")
    public String getUri() { return uri; }
    @JsonProperty("uri")
    public void setUri(String value) { this.uri = value; }
}
