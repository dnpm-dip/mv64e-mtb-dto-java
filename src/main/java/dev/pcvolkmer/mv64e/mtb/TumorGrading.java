package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TumorGrading {
    @Getter(onMethod_ = {@JsonProperty("codes")})
    @Setter(onMethod_ = {@JsonProperty("codes")})
    private List<Coding> codes;
    @Getter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date date;
}
