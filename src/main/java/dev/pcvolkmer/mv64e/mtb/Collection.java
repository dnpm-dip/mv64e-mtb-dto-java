package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Collection {
    private Date date;
    private CodingTumorSpecimenCollectionLocalization localization;
    private CodingTumorSpecimenCollectionMethod method;

    @JsonProperty("date")
    public Date getDate() { return date; }
    @JsonProperty("date")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("localization")
    public CodingTumorSpecimenCollectionLocalization getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(CodingTumorSpecimenCollectionLocalization value) { this.localization = value; }

    @JsonProperty("method")
    public CodingTumorSpecimenCollectionMethod getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(CodingTumorSpecimenCollectionMethod value) { this.method = value; }
}
