package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Provision {
    private Date date;
    private ModelProjectConsentPurpose purpose;
    private ConsentProvision type;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("purpose")
    public ModelProjectConsentPurpose getPurpose() { return purpose; }
    @JsonProperty("purpose")
    public void setPurpose(ModelProjectConsentPurpose value) { this.purpose = value; }

    @JsonProperty("type")
    public ConsentProvision getType() { return type; }
    @JsonProperty("type")
    public void setType(ConsentProvision value) { this.type = value; }
}
