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
public class MtbMedicationRecommendation {
    @Getter(onMethod_ = {@JsonProperty("category")})
    @Setter(onMethod_ = {@JsonProperty("category")})
    private MtbMedicationRecommendationCategoryCoding category;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date issuedOn;
    @Getter(onMethod_ = {@JsonProperty("levelOfEvidence")})
    @Setter(onMethod_ = {@JsonProperty("levelOfEvidence")})
    private LevelOfEvidence levelOfEvidence;
    @Getter(onMethod_ = {@JsonProperty("medication")})
    @Setter(onMethod_ = {@JsonProperty("medication")})
    private List<AtcUnregisteredMedicationCoding> medication;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("priority")})
    @Setter(onMethod_ = {@JsonProperty("priority")})
    private RecommendationPriorityCoding priority;
    @Getter(onMethod_ = {@JsonProperty("reason")})
    @Setter(onMethod_ = {@JsonProperty("reason")})
    private Reference reason;
    @Getter(onMethod_ = {@JsonProperty("supportingVariants")})
    @Setter(onMethod_ = {@JsonProperty("supportingVariants")})
    private List<GeneAlterationReference> supportingVariants;
    @Getter(onMethod_ = {@JsonProperty("useType")})
    @Setter(onMethod_ = {@JsonProperty("useType")})
    private MtbMedicationRecommendationUseTypeCoding useType;
}
