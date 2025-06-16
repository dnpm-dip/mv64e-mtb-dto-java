package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SystemicTherapy {
    @Getter(onMethod_ = {@JsonProperty("history")})
    @Setter(onMethod_ = {@JsonProperty("history")})
    private List<MtbSystemicTherapy> history;
}
