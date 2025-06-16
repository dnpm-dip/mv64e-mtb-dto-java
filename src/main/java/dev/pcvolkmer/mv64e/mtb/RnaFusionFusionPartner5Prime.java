package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RnaFusionFusionPartner5Prime {
    @Getter(onMethod_ = {@JsonProperty("exonId")})
    @Setter(onMethod_ = {@JsonProperty("exonId")})
    private String exonId;
    @Getter(onMethod_ = {@JsonProperty("gene")})
    @Setter(onMethod_ = {@JsonProperty("gene")})
    private Coding gene;
    @Getter(onMethod_ = {@JsonProperty("position")})
    @Setter(onMethod_ = {@JsonProperty("position")})
    private double position;
    @Getter(onMethod_ = {@JsonProperty("strand")})
    @Setter(onMethod_ = {@JsonProperty("strand")})
    private RnaFusionStrand strand;
    @Getter(onMethod_ = {@JsonProperty("transcriptId")})
    @Setter(onMethod_ = {@JsonProperty("transcriptId")})
    private TranscriptId transcriptId;
}
