package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class MvhMetadata {
    private ModelProjectConsent modelProjectConsent;
    private List<Map<String, Object>> researchConsents;
    private String transferTan;
    private MvhSubmissionType type;

    @JsonProperty("modelProjectConsent")
    public ModelProjectConsent getModelProjectConsent() { return modelProjectConsent; }
    @JsonProperty("modelProjectConsent")
    public void setModelProjectConsent(ModelProjectConsent value) { this.modelProjectConsent = value; }

    @JsonProperty("researchConsents")
    public List<Map<String, Object>> getResearchConsents() { return researchConsents; }
    @JsonProperty("researchConsents")
    public void setResearchConsents(List<Map<String, Object>> value) { this.researchConsents = value; }

    @JsonProperty("transferTAN")
    public String getTransferTan() { return transferTan; }
    @JsonProperty("transferTAN")
    public void setTransferTan(String value) { this.transferTan = value; }

    @JsonProperty("type")
    public MvhSubmissionType getType() { return type; }
    @JsonProperty("type")
    public void setType(MvhSubmissionType value) { this.type = value; }
}
