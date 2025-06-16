package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NgsReportMetadata {
    @Getter(onMethod_ = {@JsonProperty("kitManufacturer")})
    @Setter(onMethod_ = {@JsonProperty("kitManufacturer")})
    private String kitManufacturer;
    @Getter(onMethod_ = {@JsonProperty("kitType")})
    @Setter(onMethod_ = {@JsonProperty("kitType")})
    private String kitType;
    @Getter(onMethod_ = {@JsonProperty("pipeline")})
    @Setter(onMethod_ = {@JsonProperty("pipeline")})
    private String pipeline;
    @Getter(onMethod_ = {@JsonProperty("referenceGenome")})
    @Setter(onMethod_ = {@JsonProperty("referenceGenome")})
    private String referenceGenome;
    @Getter(onMethod_ = {@JsonProperty("sequencer")})
    @Setter(onMethod_ = {@JsonProperty("sequencer")})
    private String sequencer;
}
