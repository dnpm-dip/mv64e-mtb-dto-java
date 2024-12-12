package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Cnv {
    private CodingChromosome chromosome;
    private Double cnA;
    private Double cnB;
    private List<CodingGene> copyNumberNeutralLoH;
    private EndRange endRange;
    private String id;
    private Reference indication;
    private Patient patient;
    private Double relativeCopyNumber;
    private List<CodingGene> reportedAffectedGenes;
    private String reportedFocality;
    private StartRange startRange;
    private Long totalCopyNumber;
    private CodingCnvType type;

    @JsonProperty("chromosome")
    public CodingChromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(CodingChromosome value) { this.chromosome = value; }

    @JsonProperty("cnA")
    public Double getCnA() { return cnA; }
    @JsonProperty("cnA")
    public void setCnA(Double value) { this.cnA = value; }

    @JsonProperty("cnB")
    public Double getCnB() { return cnB; }
    @JsonProperty("cnB")
    public void setCnB(Double value) { this.cnB = value; }

    @JsonProperty("copyNumberNeutralLoH")
    public List<CodingGene> getCopyNumberNeutralLoH() { return copyNumberNeutralLoH; }
    @JsonProperty("copyNumberNeutralLoH")
    public void setCopyNumberNeutralLoH(List<CodingGene> value) { this.copyNumberNeutralLoH = value; }

    @JsonProperty("endRange")
    public EndRange getEndRange() { return endRange; }
    @JsonProperty("endRange")
    public void setEndRange(EndRange value) { this.endRange = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("indication")
    public Reference getIndication() { return indication; }
    @JsonProperty("indication")
    public void setIndication(Reference value) { this.indication = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("relativeCopyNumber")
    public Double getRelativeCopyNumber() { return relativeCopyNumber; }
    @JsonProperty("relativeCopyNumber")
    public void setRelativeCopyNumber(Double value) { this.relativeCopyNumber = value; }

    @JsonProperty("reportedAffectedGenes")
    public List<CodingGene> getReportedAffectedGenes() { return reportedAffectedGenes; }
    @JsonProperty("reportedAffectedGenes")
    public void setReportedAffectedGenes(List<CodingGene> value) { this.reportedAffectedGenes = value; }

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
    public CodingCnvType getType() { return type; }
    @JsonProperty("type")
    public void setType(CodingCnvType value) { this.type = value; }
}
