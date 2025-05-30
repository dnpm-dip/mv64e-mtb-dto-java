package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class PerformanceStatus {
    private Date effectiveDate;
    private String id;
    private Reference patient;
    private EcogCoding value;

    @JsonProperty("effectiveDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getEffectiveDate() { return effectiveDate; }
    @JsonProperty("effectiveDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setEffectiveDate(Date value) { this.effectiveDate = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("value")
    public EcogCoding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(EcogCoding value) { this.value = value; }
}
