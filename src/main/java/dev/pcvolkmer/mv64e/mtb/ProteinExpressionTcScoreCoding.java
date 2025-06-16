package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProteinExpressionTcScoreCoding {
    @Getter(onMethod_ = {@JsonProperty("code")})
    @Setter(onMethod_ = {@JsonProperty("code")})
    private ProteinExpressionTcScoreCodingCode code;
    @Getter(onMethod_ = {@JsonProperty("display")})
    @Setter(onMethod_ = {@JsonProperty("display")})
    private String display;
    @Getter(onMethod_ = {@JsonProperty("system")})
    @Setter(onMethod_ = {@JsonProperty("system")})
    private String system;
    @Getter(onMethod_ = {@JsonProperty("version")})
    @Setter(onMethod_ = {@JsonProperty("version")})
    private String version;
}
