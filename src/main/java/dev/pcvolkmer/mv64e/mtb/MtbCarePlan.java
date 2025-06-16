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
public class MtbCarePlan {
    @Getter(onMethod_ = {@JsonProperty("geneticCounselingRecommendation")})
    @Setter(onMethod_ = {@JsonProperty("geneticCounselingRecommendation")})
    private GeneticCounselingRecommendation geneticCounselingRecommendation;
    @Getter(onMethod_ = {@JsonProperty("histologyReevaluationRequests")})
    @Setter(onMethod_ = {@JsonProperty("histologyReevaluationRequests")})
    private List<HistologyReevaluationRequest> histologyReevaluationRequests;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date issuedOn;
    @Getter(onMethod_ = {@JsonProperty("medicationRecommendations")})
    @Setter(onMethod_ = {@JsonProperty("medicationRecommendations")})
    private List<MtbMedicationRecommendation> medicationRecommendations;
    @Getter(onMethod_ = {@JsonProperty("noSequencingPerformedReason")})
    @Setter(onMethod_ = {@JsonProperty("noSequencingPerformedReason")})
    private CarePlanNoSequencingPerformedReasonCoding noSequencingPerformedReason;
    @Getter(onMethod_ = {@JsonProperty("notes")})
    @Setter(onMethod_ = {@JsonProperty("notes")})
    private List<String> notes;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("procedureRecommendations")})
    @Setter(onMethod_ = {@JsonProperty("procedureRecommendations")})
    private List<ProcedureRecommendation> procedureRecommendations;
    @Getter(onMethod_ = {@JsonProperty("reason")})
    @Setter(onMethod_ = {@JsonProperty("reason")})
    private Reference reason;
    @Getter(onMethod_ = {@JsonProperty("rebiopsyRequests")})
    @Setter(onMethod_ = {@JsonProperty("rebiopsyRequests")})
    private List<RebiopsyRequest> rebiopsyRequests;
    @Getter(onMethod_ = {@JsonProperty("recommendationsMissingReason")})
    @Setter(onMethod_ = {@JsonProperty("recommendationsMissingReason")})
    private MtbCarePlanRecommendationsMissingReasonCoding recommendationsMissingReason;
    @Getter(onMethod_ = {@JsonProperty("studyEnrollmentRecommendations")})
    @Setter(onMethod_ = {@JsonProperty("studyEnrollmentRecommendations")})
    private List<MtbStudyEnrollmentRecommendation> studyEnrollmentRecommendations;
}
