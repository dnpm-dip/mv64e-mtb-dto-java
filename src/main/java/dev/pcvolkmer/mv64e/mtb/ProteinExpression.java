package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class ProteinExpression {
    private ProteinExpressionIcScoreCoding icScore;
    private String id;
    private Reference patient;
    private Coding protein;
    private ProteinExpressionTcScoreCoding tcScore;
    private Long tpsScore;
    private ProteinExpressionResultCoding value;

    @JsonProperty("icScore")
    public ProteinExpressionIcScoreCoding getIcScore() { return icScore; }
    @JsonProperty("icScore")
    public void setIcScore(ProteinExpressionIcScoreCoding value) { this.icScore = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("protein")
    public Coding getProtein() { return protein; }
    @JsonProperty("protein")
    public void setProtein(Coding value) { this.protein = value; }

    @JsonProperty("tcScore")
    public ProteinExpressionTcScoreCoding getTcScore() { return tcScore; }
    @JsonProperty("tcScore")
    public void setTcScore(ProteinExpressionTcScoreCoding value) { this.tcScore = value; }

    @JsonProperty("tpsScore")
    public Long getTpsScore() { return tpsScore; }
    @JsonProperty("tpsScore")
    public void setTpsScore(Long value) { this.tpsScore = value; }

    @JsonProperty("value")
    public ProteinExpressionResultCoding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(ProteinExpressionResultCoding value) { this.value = value; }
}
