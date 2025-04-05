package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Response {
    private Date effectiveDate;
    private String id;
    private CodingResponseMethod method;
    private Reference patient;
    private Reference therapy;
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

    @JsonProperty("method")
    public CodingResponseMethod getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(CodingResponseMethod value) { this.method = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("therapy")
    public Reference getTherapy() { return therapy; }
    @JsonProperty("therapy")
    public void setTherapy(Reference value) { this.therapy = value; }

    @JsonProperty("value")
    public CodingRecist getValue() { return value; }
    @JsonProperty("value")
    public void setValue(CodingRecist value) { this.value = value; }
}
