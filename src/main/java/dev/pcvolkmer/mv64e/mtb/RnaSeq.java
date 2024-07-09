package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class RnaSeq {
    private Long cohortRanking;
    private String ensemblId;
    private String entrezId;
    private double fragmentsPerKilobaseMillion;
    private boolean fromNgs;
    private RnaSeqGene gene;
    private String id;
    private long librarySize;
    private long rawCounts;
    private boolean tissueCorrectedExpression;
    private String transcriptId;

    @JsonProperty("cohortRanking")
    public Long getCohortRanking() { return cohortRanking; }
    @JsonProperty("cohortRanking")
    public void setCohortRanking(Long value) { this.cohortRanking = value; }

    @JsonProperty("ensemblId")
    public String getEnsemblId() { return ensemblId; }
    @JsonProperty("ensemblId")
    public void setEnsemblId(String value) { this.ensemblId = value; }

    @JsonProperty("entrezId")
    public String getEntrezId() { return entrezId; }
    @JsonProperty("entrezId")
    public void setEntrezId(String value) { this.entrezId = value; }

    @JsonProperty("fragmentsPerKilobaseMillion")
    public double getFragmentsPerKilobaseMillion() { return fragmentsPerKilobaseMillion; }
    @JsonProperty("fragmentsPerKilobaseMillion")
    public void setFragmentsPerKilobaseMillion(double value) { this.fragmentsPerKilobaseMillion = value; }

    @JsonProperty("fromNGS")
    public boolean getFromNgs() { return fromNgs; }
    @JsonProperty("fromNGS")
    public void setFromNgs(boolean value) { this.fromNgs = value; }

    @JsonProperty("gene")
    public RnaSeqGene getGene() { return gene; }
    @JsonProperty("gene")
    public void setGene(RnaSeqGene value) { this.gene = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("librarySize")
    public long getLibrarySize() { return librarySize; }
    @JsonProperty("librarySize")
    public void setLibrarySize(long value) { this.librarySize = value; }

    @JsonProperty("rawCounts")
    public long getRawCounts() { return rawCounts; }
    @JsonProperty("rawCounts")
    public void setRawCounts(long value) { this.rawCounts = value; }

    @JsonProperty("tissueCorrectedExpression")
    public boolean getTissueCorrectedExpression() { return tissueCorrectedExpression; }
    @JsonProperty("tissueCorrectedExpression")
    public void setTissueCorrectedExpression(boolean value) { this.tissueCorrectedExpression = value; }

    @JsonProperty("transcriptId")
    public String getTranscriptId() { return transcriptId; }
    @JsonProperty("transcriptId")
    public void setTranscriptId(String value) { this.transcriptId = value; }
}
