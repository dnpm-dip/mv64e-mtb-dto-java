package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Snv {
    @Getter(onMethod_ = {@JsonProperty("allelicFrequency")})
    @Setter(onMethod_ = {@JsonProperty("allelicFrequency")})
    private double allelicFrequency;
    @Getter(onMethod_ = {@JsonProperty("altAllele")})
    @Setter(onMethod_ = {@JsonProperty("altAllele")})
    private String altAllele;
    @Getter(onMethod_ = {@JsonProperty("chromosome")})
    @Setter(onMethod_ = {@JsonProperty("chromosome")})
    private Chromosome chromosome;
    @Getter(onMethod_ = {@JsonProperty("dnaChange")})
    @Setter(onMethod_ = {@JsonProperty("dnaChange")})
    private String dnaChange;
    @Getter(onMethod_ = {@JsonProperty("exonId")})
    @Setter(onMethod_ = {@JsonProperty("exonId")})
    private String exonId;
    @Getter(onMethod_ = {@JsonProperty("externalIds")})
    @Setter(onMethod_ = {@JsonProperty("externalIds")})
    private List<VariantExternalId> externalIds;
    @Getter(onMethod_ = {@JsonProperty("gene")})
    @Setter(onMethod_ = {@JsonProperty("gene")})
    private Coding gene;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("interpretation")})
    @Setter(onMethod_ = {@JsonProperty("interpretation")})
    private ClinVarCoding interpretation;
    @Getter(onMethod_ = {@JsonProperty("localization")})
    @Setter(onMethod_ = {@JsonProperty("localization")})
    private List<BaseVariantLocalizationCoding> localization;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("position")})
    @Setter(onMethod_ = {@JsonProperty("position")})
    private Position position;
    @Getter(onMethod_ = {@JsonProperty("proteinChange")})
    @Setter(onMethod_ = {@JsonProperty("proteinChange")})
    private String proteinChange;
    @Getter(onMethod_ = {@JsonProperty("readDepth")})
    @Setter(onMethod_ = {@JsonProperty("readDepth")})
    private long readDepth;
    @Getter(onMethod_ = {@JsonProperty("refAllele")})
    @Setter(onMethod_ = {@JsonProperty("refAllele")})
    private String refAllele;
    @Getter(onMethod_ = {@JsonProperty("transcriptId")})
    @Setter(onMethod_ = {@JsonProperty("transcriptId")})
    private TranscriptId transcriptId;
}
