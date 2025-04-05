package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class MSIMmr {
    private CodingProteinExpressionIcScore icScore;
    private String id;
    private Reference patient;
    private Coding protein;
    private CodingProteinExpressionTcScore tcScore;
    private Long tpsScore;
    private CodingProteinExpressionResult value;

    @JsonProperty("icScore")
    public CodingProteinExpressionIcScore getIcScore() { return icScore; }
    @JsonProperty("icScore")
    public void setIcScore(CodingProteinExpressionIcScore value) { this.icScore = value; }

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
    public CodingProteinExpressionTcScore getTcScore() { return tcScore; }
    @JsonProperty("tcScore")
    public void setTcScore(CodingProteinExpressionTcScore value) { this.tcScore = value; }

    @JsonProperty("tpsScore")
    public Long getTpsScore() { return tpsScore; }
    @JsonProperty("tpsScore")
    public void setTpsScore(Long value) { this.tpsScore = value; }

    @JsonProperty("value")
    public CodingProteinExpressionResult getValue() { return value; }
    @JsonProperty("value")
    public void setValue(CodingProteinExpressionResult value) { this.value = value; }
}
