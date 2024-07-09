package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Cnv {
    private Chromosome chromosome;
    private Double cnA;
    private Double cnB;
    private List<CopyNumberNeutralLoH> copyNumberNeutralLoH;
    private EndRange endRange;
    private String id;
    private Double relativeCopyNumber;
    private List<ReportedAffectedGene> reportedAffectedGenes;
    private String reportedFocality;
    private StartRange startRange;
    private Long totalCopyNumber;
    private CnvType type;

    @JsonProperty("chromosome")
    public Chromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(Chromosome value) { this.chromosome = value; }

    @JsonProperty("cnA")
    public Double getCnA() { return cnA; }
    @JsonProperty("cnA")
    public void setCnA(Double value) { this.cnA = value; }

    @JsonProperty("cnB")
    public Double getCnB() { return cnB; }
    @JsonProperty("cnB")
    public void setCnB(Double value) { this.cnB = value; }

    @JsonProperty("copyNumberNeutralLoH")
    public List<CopyNumberNeutralLoH> getCopyNumberNeutralLoH() { return copyNumberNeutralLoH; }
    @JsonProperty("copyNumberNeutralLoH")
    public void setCopyNumberNeutralLoH(List<CopyNumberNeutralLoH> value) { this.copyNumberNeutralLoH = value; }

    @JsonProperty("endRange")
    public EndRange getEndRange() { return endRange; }
    @JsonProperty("endRange")
    public void setEndRange(EndRange value) { this.endRange = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("relativeCopyNumber")
    public Double getRelativeCopyNumber() { return relativeCopyNumber; }
    @JsonProperty("relativeCopyNumber")
    public void setRelativeCopyNumber(Double value) { this.relativeCopyNumber = value; }

    @JsonProperty("reportedAffectedGenes")
    public List<ReportedAffectedGene> getReportedAffectedGenes() { return reportedAffectedGenes; }
    @JsonProperty("reportedAffectedGenes")
    public void setReportedAffectedGenes(List<ReportedAffectedGene> value) { this.reportedAffectedGenes = value; }

    @JsonProperty("reportedFocality")
    public String getReportedFocality() { return reportedFocality; }
    @JsonProperty("reportedFocality")
    public void setReportedFocality(String value) { this.reportedFocality = value; }

    @JsonProperty("startRange")
    public StartRange getStartRange() { return startRange; }
    @JsonProperty("startRange")
    public void setStartRange(StartRange value) { this.startRange = value; }

    @JsonProperty("totalCopyNumber")
    public Long getTotalCopyNumber() { return totalCopyNumber; }
    @JsonProperty("totalCopyNumber")
    public void setTotalCopyNumber(Long value) { this.totalCopyNumber = value; }

    @JsonProperty("type")
    public CnvType getType() { return type; }
    @JsonProperty("type")
    public void setType(CnvType value) { this.type = value; }
}
