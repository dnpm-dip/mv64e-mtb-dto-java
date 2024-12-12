package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class HistologyReportResults {
    private TumorCellContent tumorCellContent;
    private TumorMorphology tumorMorphology;

    @JsonProperty("tumorCellContent")
    public TumorCellContent getTumorCellContent() { return tumorCellContent; }
    @JsonProperty("tumorCellContent")
    public void setTumorCellContent(TumorCellContent value) { this.tumorCellContent = value; }

    @JsonProperty("tumorMorphology")
    public TumorMorphology getTumorMorphology() { return tumorMorphology; }
    @JsonProperty("tumorMorphology")
    public void setTumorMorphology(TumorMorphology value) { this.tumorMorphology = value; }
}
