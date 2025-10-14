package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IhcReportResults {
    @Getter(onMethod_ = {@JsonProperty("msiMmr")})
    @Setter(onMethod_ = {@JsonProperty("msiMmr")})
    private List<ProteinExpression> msiMmr;
    @Getter(onMethod_ = {@JsonProperty("proteinExpression")})
    @Setter(onMethod_ = {@JsonProperty("proteinExpression")})
    private List<ProteinExpression> proteinExpression;
}
