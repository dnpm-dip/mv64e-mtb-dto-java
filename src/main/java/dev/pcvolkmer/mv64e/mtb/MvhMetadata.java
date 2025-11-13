package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.List;
import java.util.TreeMap;

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
    private List<ResearchConsent> researchConsents;
    @Getter(onMethod_ = {@JsonProperty("reasonResearchConsentMissing")})
    @Setter(onMethod_ = {@JsonProperty("reasonResearchConsentMissing")})
    private ResearchConsentReasonMissing reasonResearchConsentMissing;
    @Getter(onMethod_ = {@JsonProperty("transferTAN")})
    @Setter(onMethod_ = {@JsonProperty("transferTAN")})
    private String transferTan;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private MvhSubmissionType type;

    public static class ResearchConsent extends TreeMap<String, Object> {

        public static ResearchConsent from(JsonNode researchConsents) {
            if (null == researchConsents) {
                throw new IllegalArgumentException("researchConsent cannot be null");
            }

            ObjectMapper mapper = new ObjectMapper();
            return mapper.convertValue(researchConsents, new TypeReference<>() {});
        }

        public JsonNode asJsonNode() {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.convertValue(this, JsonNode.class);
        }
    }

}
