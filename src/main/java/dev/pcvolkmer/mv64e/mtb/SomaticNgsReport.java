package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class SomaticNgsReport {
    private Double brcaness;
    private List<Cnv> copyNumberVariants;
    private List<DnaFusion> dnaFusions;
    private String id;
    private Date issueDate;
    private List<Metadatum> metadata;
    private Double msi;
    private Patient patient;
    private List<RnaFusion> rnaFusions;
    private List<RnaSeq> rnaSeqs;
    private Coding sequencingType;
    private List<Snv> simpleVariants;
    private NgsReportSpecimen specimen;
    private Double tmb;
    private TumorCellContent tumorCellContent;

    @JsonProperty("brcaness")
    public Double getBrcaness() { return brcaness; }
    @JsonProperty("brcaness")
    public void setBrcaness(Double value) { this.brcaness = value; }

    @JsonProperty("copyNumberVariants")
    public List<Cnv> getCopyNumberVariants() { return copyNumberVariants; }
    @JsonProperty("copyNumberVariants")
    public void setCopyNumberVariants(List<Cnv> value) { this.copyNumberVariants = value; }

    @JsonProperty("dnaFusions")
    public List<DnaFusion> getDnaFusions() { return dnaFusions; }
    @JsonProperty("dnaFusions")
    public void setDnaFusions(List<DnaFusion> value) { this.dnaFusions = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issueDate")
    public Date getIssueDate() { return issueDate; }
    @JsonProperty("issueDate")
    public void setIssueDate(Date value) { this.issueDate = value; }

    @JsonProperty("metadata")
    public List<Metadatum> getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(List<Metadatum> value) { this.metadata = value; }

    @JsonProperty("msi")
    public Double getMsi() { return msi; }
    @JsonProperty("msi")
    public void setMsi(Double value) { this.msi = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("rnaFusions")
    public List<RnaFusion> getRnaFusions() { return rnaFusions; }
    @JsonProperty("rnaFusions")
    public void setRnaFusions(List<RnaFusion> value) { this.rnaFusions = value; }

    @JsonProperty("rnaSeqs")
    public List<RnaSeq> getRnaSeqs() { return rnaSeqs; }
    @JsonProperty("rnaSeqs")
    public void setRnaSeqs(List<RnaSeq> value) { this.rnaSeqs = value; }

    @JsonProperty("sequencingType")
    public Coding getSequencingType() { return sequencingType; }
    @JsonProperty("sequencingType")
    public void setSequencingType(Coding value) { this.sequencingType = value; }

    @JsonProperty("simpleVariants")
    public List<Snv> getSimpleVariants() { return simpleVariants; }
    @JsonProperty("simpleVariants")
    public void setSimpleVariants(List<Snv> value) { this.simpleVariants = value; }

    @JsonProperty("specimen")
    public NgsReportSpecimen getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(NgsReportSpecimen value) { this.specimen = value; }

    @JsonProperty("tmb")
    public Double getTmb() { return tmb; }
    @JsonProperty("tmb")
    public void setTmb(Double value) { this.tmb = value; }

    @JsonProperty("tumorCellContent")
    public TumorCellContent getTumorCellContent() { return tumorCellContent; }
    @JsonProperty("tumorCellContent")
    public void setTumorCellContent(TumorCellContent value) { this.tumorCellContent = value; }
}
