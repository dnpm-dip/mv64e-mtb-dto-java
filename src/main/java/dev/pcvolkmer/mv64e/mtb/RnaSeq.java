package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RnaSeq {
    @Getter(onMethod_ = {@JsonProperty("cohortRanking")})
    @Setter(onMethod_ = {@JsonProperty("cohortRanking")})
    private Long cohortRanking;
    @Getter(onMethod_ = {@JsonProperty("externalIds")})
    @Setter(onMethod_ = {@JsonProperty("externalIds")})
    private List<VariantExternalId> externalIds;
    @Getter(onMethod_ = {@JsonProperty("gene")})
    @Setter(onMethod_ = {@JsonProperty("gene")})
    private Coding gene;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("librarySize")})
    @Setter(onMethod_ = {@JsonProperty("librarySize")})
    private Long librarySize;
    @Getter(onMethod_ = {@JsonProperty("localization")})
    @Setter(onMethod_ = {@JsonProperty("localization")})
    private List<BaseVariantLocalizationCoding> localization;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("rawCounts")})
    @Setter(onMethod_ = {@JsonProperty("rawCounts")})
    private long rawCounts;
    @Getter(onMethod_ = {@JsonProperty("tissueCorrectedExpression")})
    @Setter(onMethod_ = {@JsonProperty("tissueCorrectedExpression")})
    private Boolean tissueCorrectedExpression;
    @Getter(onMethod_ = {@JsonProperty("transcriptId")})
    @Setter(onMethod_ = {@JsonProperty("transcriptId")})
    private TranscriptId transcriptId;
    @Getter(onMethod_ = {@JsonProperty("transcriptsPerMillion")})
    @Setter(onMethod_ = {@JsonProperty("transcriptsPerMillion")})
    private double transcriptsPerMillion;
    @Getter(onMethod_ = {@JsonProperty("variant")})
    @Setter(onMethod_ = {@JsonProperty("variant")})
    private Reference variant;
}
