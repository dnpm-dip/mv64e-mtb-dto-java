package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DnaFusion {
    @Getter(onMethod_ = {@JsonProperty("externalIds")})
    @Setter(onMethod_ = {@JsonProperty("externalIds")})
    private List<VariantExternalId> externalIds;
    @Getter(onMethod_ = {@JsonProperty("fusionPartner3prime")})
    @Setter(onMethod_ = {@JsonProperty("fusionPartner3prime")})
    private DnaFusionFusionPartner3Prime fusionPartner3Prime;
    @Getter(onMethod_ = {@JsonProperty("fusionPartner5prime")})
    @Setter(onMethod_ = {@JsonProperty("fusionPartner5prime")})
    private DnaFusionFusionPartner5Prime fusionPartner5Prime;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("localization")})
    @Setter(onMethod_ = {@JsonProperty("localization")})
    private List<BaseVariantLocalizationCoding> localization;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("reportedNumReads")})
    @Setter(onMethod_ = {@JsonProperty("reportedNumReads")})
    private long reportedNumReads;
}
