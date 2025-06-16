package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeriodDate {
    @Getter(onMethod_ = {@JsonProperty("end")})
    @Setter(onMethod_ = {@JsonProperty("end")})
    private Date end;
    @Getter(onMethod_ = {@JsonProperty("start"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("start"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date start;
}
