package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class History {
    private Date date;
    private MtbDiagnosisCoding value;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("value")
    public MtbDiagnosisCoding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(MtbDiagnosisCoding value) { this.value = value; }
}
