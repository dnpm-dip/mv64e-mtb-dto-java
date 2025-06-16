package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HealthInsurance {
    @Getter(onMethod_ = {@JsonProperty("reference")})
    @Setter(onMethod_ = {@JsonProperty("reference")})
    private Reference reference;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private HealthInsuranceCoding type;
}
