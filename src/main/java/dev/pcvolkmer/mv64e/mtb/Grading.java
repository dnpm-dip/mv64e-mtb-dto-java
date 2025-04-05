package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Grading {
    private List<TumorGrading> history;

    @JsonProperty("history")
    public List<TumorGrading> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<TumorGrading> value) { this.history = value; }
}
