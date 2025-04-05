package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Type {
    private List<History> history;

    @JsonProperty("history")
    public List<History> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<History> value) { this.history = value; }
}
