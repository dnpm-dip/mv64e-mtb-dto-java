package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
    @Getter(onMethod_ = {@JsonProperty("municipalityCode")})
    @Setter(onMethod_ = {@JsonProperty("municipalityCode")})
    private String municipalityCode;
}
