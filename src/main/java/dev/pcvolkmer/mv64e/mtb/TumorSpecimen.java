package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TumorSpecimen {
    @Getter(onMethod_ = {@JsonProperty("collection")})
    @Setter(onMethod_ = {@JsonProperty("collection")})
    private Collection collection;
    @Getter(onMethod_ = {@JsonProperty("diagnosis")})
    @Setter(onMethod_ = {@JsonProperty("diagnosis")})
    private Reference diagnosis;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private TumorSpecimenCoding type;
}
