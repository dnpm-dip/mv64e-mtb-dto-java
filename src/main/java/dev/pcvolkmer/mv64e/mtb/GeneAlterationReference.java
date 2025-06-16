package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeneAlterationReference {
    @Getter(onMethod_ = {@JsonProperty("display")})
    @Setter(onMethod_ = {@JsonProperty("display")})
    private String display;
    @Getter(onMethod_ = {@JsonProperty("gene")})
    @Setter(onMethod_ = {@JsonProperty("gene")})
    private Coding gene;
    @Getter(onMethod_ = {@JsonProperty("variant")})
    @Setter(onMethod_ = {@JsonProperty("variant")})
    private Reference variant;
}
