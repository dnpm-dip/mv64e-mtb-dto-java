package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Components {
    @Getter(onMethod_ = {@JsonProperty("loh")})
    @Setter(onMethod_ = {@JsonProperty("loh")})
    private double loh;
    @Getter(onMethod_ = {@JsonProperty("lst")})
    @Setter(onMethod_ = {@JsonProperty("lst")})
    private double lst;
    @Getter(onMethod_ = {@JsonProperty("tai")})
    @Setter(onMethod_ = {@JsonProperty("tai")})
    private double tai;
}
