package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class StageHistory {
    private Date date;
    private CodingTumorSpread stage;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("stage")
    public CodingTumorSpread getStage() { return stage; }
    @JsonProperty("stage")
    public void setStage(CodingTumorSpread value) { this.stage = value; }
}
