package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DnaFusionFusionPartner3Prime {
    @Getter(onMethod_ = {@JsonProperty("chromosome")})
    @Setter(onMethod_ = {@JsonProperty("chromosome")})
    private Chromosome chromosome;
    @Getter(onMethod_ = {@JsonProperty("gene")})
    @Setter(onMethod_ = {@JsonProperty("gene")})
    private Coding gene;
    @Getter(onMethod_ = {@JsonProperty("position")})
    @Setter(onMethod_ = {@JsonProperty("position")})
    private double position;
}
