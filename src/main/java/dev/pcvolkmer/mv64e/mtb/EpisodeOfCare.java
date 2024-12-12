package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class EpisodeOfCare {
    private List<Reference> diagnoses;
    private String id;
    private Reference patient;
    private PeriodLocalDate period;

    @JsonProperty("diagnoses")
    public List<Reference> getDiagnoses() { return diagnoses; }
    @JsonProperty("diagnoses")
    public void setDiagnoses(List<Reference> value) { this.diagnoses = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodLocalDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodLocalDate value) { this.period = value; }
}
