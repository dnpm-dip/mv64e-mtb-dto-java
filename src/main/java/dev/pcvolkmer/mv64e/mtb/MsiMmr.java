package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MsiMmr {
    @Getter(onMethod_ = {@JsonProperty("icScore")})
    @Setter(onMethod_ = {@JsonProperty("icScore")})
    private ProteinExpressionIcScoreCoding icScore;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("protein")})
    @Setter(onMethod_ = {@JsonProperty("protein")})
    private Coding protein;
    @Getter(onMethod_ = {@JsonProperty("tcScore")})
    @Setter(onMethod_ = {@JsonProperty("tcScore")})
    private ProteinExpressionTcScoreCoding tcScore;
    @Getter(onMethod_ = {@JsonProperty("tpsScore")})
    @Setter(onMethod_ = {@JsonProperty("tpsScore")})
    private Long tpsScore;
    @Getter(onMethod_ = {@JsonProperty("value")})
    @Setter(onMethod_ = {@JsonProperty("value")})
    private ProteinExpressionResultCoding value;
}
