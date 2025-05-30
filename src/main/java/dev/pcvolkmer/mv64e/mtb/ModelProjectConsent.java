package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class ModelProjectConsent {
    private Date date;
    private List<Provision> provisions;
    private String version;

    @JsonProperty("date")
    public Date getDate() { return date; }
    @JsonProperty("date")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("provisions")
    public List<Provision> getProvisions() { return provisions; }
    @JsonProperty("provisions")
    public void setProvisions(List<Provision> value) { this.provisions = value; }

    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
}
