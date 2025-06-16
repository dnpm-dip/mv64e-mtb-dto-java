package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistologyReportResults {
    @Getter(onMethod_ = {@JsonProperty("tumorCellContent")})
    @Setter(onMethod_ = {@JsonProperty("tumorCellContent")})
    private TumorCellContent tumorCellContent;
    @Getter(onMethod_ = {@JsonProperty("tumorMorphology")})
    @Setter(onMethod_ = {@JsonProperty("tumorMorphology")})
    private TumorMorphology tumorMorphology;
}
