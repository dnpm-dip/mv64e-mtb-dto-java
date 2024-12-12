package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class NgsReportResults {
    private BRCAness brcaness;
    private List<Cnv> copyNumberVariants;
    private List<DNAFusion> dnaFusions;
    private HRDScore hrdScore;
    private List<RNAFusion> rnaFusions;
    private List<RNASeq> rnaSeqs;
    private List<Snv> simpleVariants;
    private Tmb tmb;
    private TumorCellContent tumorCellContent;

    @JsonProperty("brcaness")
    public BRCAness getBrcaness() { return brcaness; }
    @JsonProperty("brcaness")
    public void setBrcaness(BRCAness value) { this.brcaness = value; }

    @JsonProperty("copyNumberVariants")
    public List<Cnv> getCopyNumberVariants() { return copyNumberVariants; }
    @JsonProperty("copyNumberVariants")
    public void setCopyNumberVariants(List<Cnv> value) { this.copyNumberVariants = value; }

    @JsonProperty("dnaFusions")
    public List<DNAFusion> getDnaFusions() { return dnaFusions; }
    @JsonProperty("dnaFusions")
    public void setDnaFusions(List<DNAFusion> value) { this.dnaFusions = value; }

    @JsonProperty("hrdScore")
    public HRDScore getHrdScore() { return hrdScore; }
    @JsonProperty("hrdScore")
    public void setHrdScore(HRDScore value) { this.hrdScore = value; }

    @JsonProperty("rnaFusions")
    public List<RNAFusion> getRnaFusions() { return rnaFusions; }
    @JsonProperty("rnaFusions")
    public void setRnaFusions(List<RNAFusion> value) { this.rnaFusions = value; }

    @JsonProperty("rnaSeqs")
    public List<RNASeq> getRnaSeqs() { return rnaSeqs; }
    @JsonProperty("rnaSeqs")
    public void setRnaSeqs(List<RNASeq> value) { this.rnaSeqs = value; }

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
