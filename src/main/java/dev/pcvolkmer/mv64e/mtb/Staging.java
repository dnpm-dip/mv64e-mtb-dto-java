package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Staging {
    private List<TumorStaging> history;

    @JsonProperty("history")
    public List<TumorStaging> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<TumorStaging> value) { this.history = value; }
}
