package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class DnaFusion {
    private List<VariantExternalId> externalIds;
    private DnaFusionFusionPartner3Prime fusionPartner3Prime;
    private DnaFusionFusionPartner5Prime fusionPartner5Prime;
    private String id;
    private List<BaseVariantLocalizationCoding> localization;
    private Reference patient;
    private long reportedNumReads;

    @JsonProperty("externalIds")
    public List<VariantExternalId> getExternalIds() { return externalIds; }
    @JsonProperty("externalIds")
    public void setExternalIds(List<VariantExternalId> value) { this.externalIds = value; }

    @JsonProperty("fusionPartner3prime")
    public DnaFusionFusionPartner3Prime getFusionPartner3Prime() { return fusionPartner3Prime; }
    @JsonProperty("fusionPartner3prime")
    public void setFusionPartner3Prime(DnaFusionFusionPartner3Prime value) { this.fusionPartner3Prime = value; }

    @JsonProperty("fusionPartner5prime")
    public DnaFusionFusionPartner5Prime getFusionPartner5Prime() { return fusionPartner5Prime; }
    @JsonProperty("fusionPartner5prime")
    public void setFusionPartner5Prime(DnaFusionFusionPartner5Prime value) { this.fusionPartner5Prime = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("localization")
    public List<BaseVariantLocalizationCoding> getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(List<BaseVariantLocalizationCoding> value) { this.localization = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("reportedNumReads")
    public long getReportedNumReads() { return reportedNumReads; }
    @JsonProperty("reportedNumReads")
    public void setReportedNumReads(long value) { this.reportedNumReads = value; }
}
