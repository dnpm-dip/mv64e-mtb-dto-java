package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class MolecularTherapy {
    private List<MtbMedicationTherapy> history;

    @JsonProperty("history")
    public List<MtbMedicationTherapy> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<MtbMedicationTherapy> value) { this.history = value; }
}
