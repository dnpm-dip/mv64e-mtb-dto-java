package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MtbEpisodeOfCare {
    @Getter(onMethod_ = {@JsonProperty("diagnoses")})
    @Setter(onMethod_ = {@JsonProperty("diagnoses")})
    private List<Reference> diagnoses;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("period")})
    @Setter(onMethod_ = {@JsonProperty("period")})
    private PeriodDate period;
}
