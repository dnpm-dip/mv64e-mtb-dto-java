package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Therapy {
    private List<MTBMedicationTherapy> history;

    @JsonProperty("history")
    public List<MTBMedicationTherapy> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<MTBMedicationTherapy> value) { this.history = value; }
}
