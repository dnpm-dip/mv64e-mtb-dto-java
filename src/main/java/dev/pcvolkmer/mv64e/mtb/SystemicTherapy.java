package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class SystemicTherapy {
    private List<MtbSystemicTherapy> history;

    @JsonProperty("history")
    public List<MtbSystemicTherapy> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<MtbSystemicTherapy> value) { this.history = value; }
}
