package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Collection {
    private Date date;
    private TumorSpecimenCollectionLocalizationCoding localization;
    private TumorSpecimenCollectionMethodCoding method;

    @JsonProperty("date")
    public Date getDate() { return date; }
    @JsonProperty("date")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("localization")
    public TumorSpecimenCollectionLocalizationCoding getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(TumorSpecimenCollectionLocalizationCoding value) { this.localization = value; }

    @JsonProperty("method")
    public TumorSpecimenCollectionMethodCoding getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(TumorSpecimenCollectionMethodCoding value) { this.method = value; }
}
