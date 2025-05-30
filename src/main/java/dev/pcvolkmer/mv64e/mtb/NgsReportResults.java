package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class NgsReportResults {
    private Brcaness brcaness;
    private List<Cnv> copyNumberVariants;
    private List<DnaFusion> dnaFusions;
    private HrdScore hrdScore;
    private List<RnaFusion> rnaFusions;
    private List<RnaSeq> rnaSeqs;
    private List<Snv> simpleVariants;
    private Tmb tmb;
    private TumorCellContent tumorCellContent;

    @JsonProperty("brcaness")
    public Brcaness getBrcaness() { return brcaness; }
    @JsonProperty("brcaness")
    public void setBrcaness(Brcaness value) { this.brcaness = value; }

    @JsonProperty("copyNumberVariants")
    public List<Cnv> getCopyNumberVariants() { return copyNumberVariants; }
    @JsonProperty("copyNumberVariants")
    public void setCopyNumberVariants(List<Cnv> value) { this.copyNumberVariants = value; }

    @JsonProperty("dnaFusions")
    public List<DnaFusion> getDnaFusions() { return dnaFusions; }
    @JsonProperty("dnaFusions")
    public void setDnaFusions(List<DnaFusion> value) { this.dnaFusions = value; }

    @JsonProperty("hrdScore")
    public HrdScore getHrdScore() { return hrdScore; }
    @JsonProperty("hrdScore")
    public void setHrdScore(HrdScore value) { this.hrdScore = value; }

    @JsonProperty("rnaFusions")
    public List<RnaFusion> getRnaFusions() { return rnaFusions; }
    @JsonProperty("rnaFusions")
    public void setRnaFusions(List<RnaFusion> value) { this.rnaFusions = value; }

    @JsonProperty("rnaSeqs")
    public List<RnaSeq> getRnaSeqs() { return rnaSeqs; }
    @JsonProperty("rnaSeqs")
    public void setRnaSeqs(List<RnaSeq> value) { this.rnaSeqs = value; }

    @JsonProperty("simpleVariants")
    public List<Snv> getSimpleVariants() { return simpleVariants; }
    @JsonProperty("simpleVariants")
    public void setSimpleVariants(List<Snv> value) { this.simpleVariants = value; }

    @JsonProperty("tmb")
    public Tmb getTmb() { return tmb; }
    @JsonProperty("tmb")
    public void setTmb(Tmb value) { this.tmb = value; }

    @JsonProperty("tumorCellContent")
    public TumorCellContent getTumorCellContent() { return tumorCellContent; }
    @JsonProperty("tumorCellContent")
    public void setTumorCellContent(TumorCellContent value) { this.tumorCellContent = value; }
}
