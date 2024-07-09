package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Response {
    private Date effectiveDate;
    private String id;
    private Patient patient;
    private ResponseTherapy therapy;
    private CodingRecist value;

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
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("therapy")
    public ResponseTherapy getTherapy() { return therapy; }
    @JsonProperty("therapy")
    public void setTherapy(ResponseTherapy value) { this.therapy = value; }

    @JsonProperty("value")
    public CodingRecist getValue() { return value; }
    @JsonProperty("value")
    public void setValue(CodingRecist value) { this.value = value; }
}
