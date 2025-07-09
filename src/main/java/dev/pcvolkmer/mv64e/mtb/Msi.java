package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Msi {
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("interpretation")})
    @Setter(onMethod_ = {@JsonProperty("interpretation")})
    private MsiInterpretationCoding interpretation;
    @Getter(onMethod_ = {@JsonProperty("method")})
    @Setter(onMethod_ = {@JsonProperty("method")})
    private MsiMethodCoding method;
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
