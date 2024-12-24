package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class IHCReport {
    private ExternalId blockId;
    private Date date;
    private String id;
    private ExternalId journalId;
    private List<MSIMmrResult> msiMmrResults;
    private Reference patient;
    private List<ProteinExpressionResult> proteinExpressionResults;
    private Reference specimen;

    @JsonProperty("blockId")
    public ExternalId getBlockId() { return blockId; }
    @JsonProperty("blockId")
    public void setBlockId(ExternalId value) { this.blockId = value; }

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("journalId")
    public ExternalId getJournalId() { return journalId; }
    @JsonProperty("journalId")
    public void setJournalId(ExternalId value) { this.journalId = value; }

    @JsonProperty("msiMmrResults")
    public List<MSIMmrResult> getMsiMmrResults() { return msiMmrResults; }
    @JsonProperty("msiMmrResults")
    public void setMsiMmrResults(List<MSIMmrResult> value) { this.msiMmrResults = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("proteinExpressionResults")
    public List<ProteinExpressionResult> getProteinExpressionResults() { return proteinExpressionResults; }
    @JsonProperty("proteinExpressionResults")
    public void setProteinExpressionResults(List<ProteinExpressionResult> value) { this.proteinExpressionResults = value; }

    @JsonProperty("specimen")
    public Reference getSpecimen() { return specimen; }
    @JsonProperty("specimen")
    public void setSpecimen(Reference value) { this.specimen = value; }
}
