package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Position {
    @Getter(onMethod_ = {@JsonProperty("end")})
    @Setter(onMethod_ = {@JsonProperty("end")})
    private Double end;
    @Getter(onMethod_ = {@JsonProperty("start")})
    @Setter(onMethod_ = {@JsonProperty("start")})
    private double start;
}
