package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Brcaness {
    @Getter(onMethod_ = {@JsonProperty("confidenceRange")})
    @Setter(onMethod_ = {@JsonProperty("confidenceRange")})
    private ConfidenceRange confidenceRange;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("specimen")})
    @Setter(onMethod_ = {@JsonProperty("specimen")})
    private Reference specimen;
    @Getter(onMethod_ = {@JsonProperty("value")})
    @Setter(onMethod_ = {@JsonProperty("value")})
    private double value;
}
