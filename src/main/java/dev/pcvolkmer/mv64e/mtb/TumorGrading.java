package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class TumorGrading {
    private List<Coding> codes;
    private Date date;

    @JsonProperty("codes")
    public List<Coding> getCodes() { return codes; }
    @JsonProperty("codes")
    public void setCodes(List<Coding> value) { this.codes = value; }

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }
}
