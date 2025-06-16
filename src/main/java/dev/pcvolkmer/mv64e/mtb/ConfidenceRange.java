package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfidenceRange {
    @Getter(onMethod_ = {@JsonProperty("max")})
    @Setter(onMethod_ = {@JsonProperty("max")})
    private double max;
    @Getter(onMethod_ = {@JsonProperty("min")})
    @Setter(onMethod_ = {@JsonProperty("min")})
    private double min;
}
