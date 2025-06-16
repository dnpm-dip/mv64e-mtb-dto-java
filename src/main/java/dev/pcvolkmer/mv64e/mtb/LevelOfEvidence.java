package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LevelOfEvidence {
    @Getter(onMethod_ = {@JsonProperty("addendums")})
    @Setter(onMethod_ = {@JsonProperty("addendums")})
    private List<LevelOfEvidenceAddendumCoding> addendums;
    @Getter(onMethod_ = {@JsonProperty("grading")})
    @Setter(onMethod_ = {@JsonProperty("grading")})
    private LevelOfEvidenceGradingCoding grading;
    @Getter(onMethod_ = {@JsonProperty("publications")})
    @Setter(onMethod_ = {@JsonProperty("publications")})
    private List<PublicationReference> publications;
}
