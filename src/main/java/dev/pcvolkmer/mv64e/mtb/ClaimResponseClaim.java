package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class ClaimResponseClaim {
    private String id;
    private ClaimResponseClaimType type;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("type")
    public ClaimResponseClaimType getType() { return type; }
    @JsonProperty("type")
    public void setType(ClaimResponseClaimType value) { this.type = value; }
}
