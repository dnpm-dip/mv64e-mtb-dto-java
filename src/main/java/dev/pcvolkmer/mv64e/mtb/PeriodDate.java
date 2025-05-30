package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class PeriodDate {
    private Date end;
    private Date start;

    @JsonProperty("end")
    public Date getEnd() { return end; }
    @JsonProperty("end")
    public void setEnd(Date value) { this.end = value; }

    @JsonProperty("start")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getStart() { return start; }
    @JsonProperty("start")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setStart(Date value) { this.start = value; }
}
