package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TnmClassification {
    @Getter(onMethod_ = {@JsonProperty("metastasis")})
    @Setter(onMethod_ = {@JsonProperty("metastasis")})
    private Coding metastasis;
    @Getter(onMethod_ = {@JsonProperty("nodes")})
    @Setter(onMethod_ = {@JsonProperty("nodes")})
    private Coding nodes;
    @Getter(onMethod_ = {@JsonProperty("tumor")})
    @Setter(onMethod_ = {@JsonProperty("tumor")})
    private Coding tumor;
}
