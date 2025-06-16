package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VariantExternalId {
    @Getter(onMethod_ = {@JsonProperty("system")})
    @Setter(onMethod_ = {@JsonProperty("system")})
    private ExternalIdSystem system;
    @Getter(onMethod_ = {@JsonProperty("value")})
    @Setter(onMethod_ = {@JsonProperty("value")})
    private String value;
}
