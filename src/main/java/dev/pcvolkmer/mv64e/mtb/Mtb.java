package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mtb {
    @Getter(onMethod_ = {@JsonProperty("carePlans")})
    @Setter(onMethod_ = {@JsonProperty("carePlans")})
    private List<MtbCarePlan> carePlans;
    @Getter(onMethod_ = {@JsonProperty("claimResponses")})
    @Setter(onMethod_ = {@JsonProperty("claimResponses")})
    private List<ClaimResponse> claimResponses;
    @Getter(onMethod_ = {@JsonProperty("claims")})
    @Setter(onMethod_ = {@JsonProperty("claims")})
    private List<Claim> claims;
    @Getter(onMethod_ = {@JsonProperty("diagnoses")})
    @Setter(onMethod_ = {@JsonProperty("diagnoses")})
    private List<MtbDiagnosis> diagnoses;
    @Getter(onMethod_ = {@JsonProperty("episodesOfCare")})
    @Setter(onMethod_ = {@JsonProperty("episodesOfCare")})
    private List<MtbEpisodeOfCare> episodesOfCare;
    @Getter(onMethod_ = {@JsonProperty("followUps")})
    @Setter(onMethod_ = {@JsonProperty("followUps")})
    private List<FollowUp> followUps;
    @Getter(onMethod_ = {@JsonProperty("guidelineProcedures")})
    @Setter(onMethod_ = {@JsonProperty("guidelineProcedures")})
    private List<OncoProcedure> guidelineProcedures;
    @Getter(onMethod_ = {@JsonProperty("guidelineTherapies")})
    @Setter(onMethod_ = {@JsonProperty("guidelineTherapies")})
    private List<MtbSystemicTherapy> guidelineTherapies;
    @Getter(onMethod_ = {@JsonProperty("histologyReports")})
    @Setter(onMethod_ = {@JsonProperty("histologyReports")})
    private List<HistologyReport> histologyReports;
    @Getter(onMethod_ = {@JsonProperty("ihcReports")})
    @Setter(onMethod_ = {@JsonProperty("ihcReports")})
    private List<IhcReport> ihcReports;
    @Getter(onMethod_ = {@JsonProperty("metadata")})
    @Setter(onMethod_ = {@JsonProperty("metadata")})
    private MvhMetadata metadata;
    @Getter(onMethod_ = {@JsonProperty("ngsReports")})
    @Setter(onMethod_ = {@JsonProperty("ngsReports")})
    private List<SomaticNgsReport> ngsReports;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Patient patient;
    @Getter(onMethod_ = {@JsonProperty("performanceStatus")})
    @Setter(onMethod_ = {@JsonProperty("performanceStatus")})
    private List<PerformanceStatus> performanceStatus;
    @Getter(onMethod_ = {@JsonProperty("priorDiagnosticReports")})
    @Setter(onMethod_ = {@JsonProperty("priorDiagnosticReports")})
    private List<PriorDiagnosticReport> priorDiagnosticReports;
    @Getter(onMethod_ = {@JsonProperty("responses")})
    @Setter(onMethod_ = {@JsonProperty("responses")})
    private List<Response> responses;
    @Getter(onMethod_ = {@JsonProperty("specimens")})
    @Setter(onMethod_ = {@JsonProperty("specimens")})
    private List<TumorSpecimen> specimens;
    @Getter(onMethod_ = {@JsonProperty("systemicTherapies")})
    @Setter(onMethod_ = {@JsonProperty("systemicTherapies")})
    private List<SystemicTherapy> systemicTherapies;
}
