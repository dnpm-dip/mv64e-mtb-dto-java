package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;

public class MTBEpisode {
    private String id;
    private Patient patient;
    private PeriodLocalDate period;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodLocalDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodLocalDate value) { this.period = value; }
}
