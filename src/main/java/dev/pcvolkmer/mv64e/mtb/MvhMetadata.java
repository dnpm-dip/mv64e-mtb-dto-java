package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MvhMetadata {
    @Getter(onMethod_ = {@JsonProperty("modelProjectConsent")})
    @Setter(onMethod_ = {@JsonProperty("modelProjectConsent")})
    private ModelProjectConsent modelProjectConsent;
    @Getter(onMethod_ = {@JsonProperty("researchConsents")})
    @Setter(onMethod_ = {@JsonProperty("researchConsents")})
    private List<Map<String, Object>> researchConsents;
    @Getter(onMethod_ = {@JsonProperty("reasonResearchConsentMissing")})
    @Setter(onMethod_ = {@JsonProperty("reasonResearchConsentMissing")})
    private ResearchConsentReasonMissing reasonResearchConsentMissing;
    @Getter(onMethod_ = {@JsonProperty("transferTAN")})
    @Setter(onMethod_ = {@JsonProperty("transferTAN")})
    private String transferTan;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private MvhSubmissionType type;
}
