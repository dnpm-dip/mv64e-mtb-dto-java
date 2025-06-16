package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Age {
    @Getter(onMethod_ = {@JsonProperty("unit")})
    @Setter(onMethod_ = {@JsonProperty("unit")})
    private Unit unit;
    @Getter(onMethod_ = {@JsonProperty("value")})
    @Setter(onMethod_ = {@JsonProperty("value")})
    private double value;
}
