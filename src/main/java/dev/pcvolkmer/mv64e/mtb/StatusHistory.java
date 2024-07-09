package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class StatusHistory {
    private Date date;
    private MtbDiagnosisTumorSpread status;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("status")
    public MtbDiagnosisTumorSpread getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(MtbDiagnosisTumorSpread value) { this.status = value; }
}
