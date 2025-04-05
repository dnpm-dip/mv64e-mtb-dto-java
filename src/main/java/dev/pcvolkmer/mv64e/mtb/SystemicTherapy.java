package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class SystemicTherapy {
    private List<MTBSystemicTherapy> history;

    @JsonProperty("history")
    public List<MTBSystemicTherapy> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<MTBSystemicTherapy> value) { this.history = value; }
}
