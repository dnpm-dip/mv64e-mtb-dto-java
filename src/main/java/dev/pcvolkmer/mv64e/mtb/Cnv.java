package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cnv {
    @Getter(onMethod_ = {@JsonProperty("chromosome")})
    @Setter(onMethod_ = {@JsonProperty("chromosome")})
    private Chromosome chromosome;
    @Getter(onMethod_ = {@JsonProperty("cnA")})
    @Setter(onMethod_ = {@JsonProperty("cnA")})
    private Double cnA;
    @Getter(onMethod_ = {@JsonProperty("cnB")})
    @Setter(onMethod_ = {@JsonProperty("cnB")})
    private Double cnB;
    @Getter(onMethod_ = {@JsonProperty("copyNumberNeutralLoH")})
    @Setter(onMethod_ = {@JsonProperty("copyNumberNeutralLoH")})
    private List<Coding> copyNumberNeutralLoH;
    @Getter(onMethod_ = {@JsonProperty("endRange")})
    @Setter(onMethod_ = {@JsonProperty("endRange")})
    private EndRange endRange;
    @Getter(onMethod_ = {@JsonProperty("externalIds")})
    @Setter(onMethod_ = {@JsonProperty("externalIds")})
    private List<VariantExternalId> externalIds;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("localization")})
    @Setter(onMethod_ = {@JsonProperty("localization")})
    private List<BaseVariantLocalizationCoding> localization;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("relativeCopyNumber")})
    @Setter(onMethod_ = {@JsonProperty("relativeCopyNumber")})
    private Double relativeCopyNumber;
    @Getter(onMethod_ = {@JsonProperty("reportedAffectedGenes")})
    @Setter(onMethod_ = {@JsonProperty("reportedAffectedGenes")})
    private List<Coding> reportedAffectedGenes;
    @Getter(onMethod_ = {@JsonProperty("reportedFocality")})
    @Setter(onMethod_ = {@JsonProperty("reportedFocality")})
    private String reportedFocality;
    @Getter(onMethod_ = {@JsonProperty("startRange")})
    @Setter(onMethod_ = {@JsonProperty("startRange")})
    private StartRange startRange;
    @Getter(onMethod_ = {@JsonProperty("totalCopyNumber")})
    @Setter(onMethod_ = {@JsonProperty("totalCopyNumber")})
    private Long totalCopyNumber;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private CnvCoding type;
}
