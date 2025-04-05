package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class TumorStaging {
    private Date date;
    private CodingTumorStagingMethod method;
    private List<Coding> otherClassifications;
    private TnmClassification tnmClassification;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("method")
    public CodingTumorStagingMethod getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(CodingTumorStagingMethod value) { this.method = value; }

    @JsonProperty("otherClassifications")
    public List<Coding> getOtherClassifications() { return otherClassifications; }
    @JsonProperty("otherClassifications")
    public void setOtherClassifications(List<Coding> value) { this.otherClassifications = value; }

    @JsonProperty("tnmClassification")
    public TnmClassification getTnmClassification() { return tnmClassification; }
    @JsonProperty("tnmClassification")
    public void setTnmClassification(TnmClassification value) { this.tnmClassification = value; }
}
