package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Mtb {
    private List<MtbCarePlan> carePlans;
    private List<ClaimResponse> claimResponses;
    private List<Claim> claims;
    private List<MtbDiagnosis> diagnoses;
    private List<MtbEpisodeOfCare> episodesOfCare;
    private List<FollowUp> followUps;
    private List<OncoProcedure> guidelineProcedures;
    private List<MtbSystemicTherapy> guidelineTherapies;
    private List<HistologyReport> histologyReports;
    private List<IhcReport> ihcReports;
    private MvhMetadata metadata;
    private List<SomaticNgsReport> ngsReports;
    private Patient patient;
    private List<PerformanceStatus> performanceStatus;
    private List<PriorDiagnosticReport> priorDiagnosticReports;
    private List<Response> responses;
    private List<TumorSpecimen> specimens;
    private List<SystemicTherapy> systemicTherapies;

    @JsonProperty("carePlans")
    public List<MtbCarePlan> getCarePlans() { return carePlans; }
    @JsonProperty("carePlans")
    public void setCarePlans(List<MtbCarePlan> value) { this.carePlans = value; }

    @JsonProperty("claimResponses")
    public List<ClaimResponse> getClaimResponses() { return claimResponses; }
    @JsonProperty("claimResponses")
    public void setClaimResponses(List<ClaimResponse> value) { this.claimResponses = value; }

    @JsonProperty("claims")
    public List<Claim> getClaims() { return claims; }
    @JsonProperty("claims")
    public void setClaims(List<Claim> value) { this.claims = value; }

    @JsonProperty("diagnoses")
    public List<MtbDiagnosis> getDiagnoses() { return diagnoses; }
    @JsonProperty("diagnoses")
    public void setDiagnoses(List<MtbDiagnosis> value) { this.diagnoses = value; }

    @JsonProperty("episodesOfCare")
    public List<MtbEpisodeOfCare> getEpisodesOfCare() { return episodesOfCare; }
    @JsonProperty("episodesOfCare")
    public void setEpisodesOfCare(List<MtbEpisodeOfCare> value) { this.episodesOfCare = value; }

    @JsonProperty("followUps")
    public List<FollowUp> getFollowUps() { return followUps; }
    @JsonProperty("followUps")
    public void setFollowUps(List<FollowUp> value) { this.followUps = value; }

    @JsonProperty("guidelineProcedures")
    public List<OncoProcedure> getGuidelineProcedures() { return guidelineProcedures; }
    @JsonProperty("guidelineProcedures")
    public void setGuidelineProcedures(List<OncoProcedure> value) { this.guidelineProcedures = value; }

    @JsonProperty("guidelineTherapies")
    public List<MtbSystemicTherapy> getGuidelineTherapies() { return guidelineTherapies; }
    @JsonProperty("guidelineTherapies")
    public void setGuidelineTherapies(List<MtbSystemicTherapy> value) { this.guidelineTherapies = value; }

    @JsonProperty("histologyReports")
    public List<HistologyReport> getHistologyReports() { return histologyReports; }
    @JsonProperty("histologyReports")
    public void setHistologyReports(List<HistologyReport> value) { this.histologyReports = value; }

    @JsonProperty("ihcReports")
    public List<IhcReport> getIhcReports() { return ihcReports; }
    @JsonProperty("ihcReports")
    public void setIhcReports(List<IhcReport> value) { this.ihcReports = value; }

    @JsonProperty("metadata")
    public MvhMetadata getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(MvhMetadata value) { this.metadata = value; }

    @JsonProperty("ngsReports")
    public List<SomaticNgsReport> getNgsReports() { return ngsReports; }
    @JsonProperty("ngsReports")
    public void setNgsReports(List<SomaticNgsReport> value) { this.ngsReports = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("performanceStatus")
    public List<PerformanceStatus> getPerformanceStatus() { return performanceStatus; }
    @JsonProperty("performanceStatus")
    public void setPerformanceStatus(List<PerformanceStatus> value) { this.performanceStatus = value; }

    @JsonProperty("priorDiagnosticReports")
    public List<PriorDiagnosticReport> getPriorDiagnosticReports() { return priorDiagnosticReports; }
    @JsonProperty("priorDiagnosticReports")
    public void setPriorDiagnosticReports(List<PriorDiagnosticReport> value) { this.priorDiagnosticReports = value; }

    @JsonProperty("responses")
    public List<Response> getResponses() { return responses; }
    @JsonProperty("responses")
    public void setResponses(List<Response> value) { this.responses = value; }

    @JsonProperty("specimens")
    public List<TumorSpecimen> getSpecimens() { return specimens; }
    @JsonProperty("specimens")
    public void setSpecimens(List<TumorSpecimen> value) { this.specimens = value; }

    @JsonProperty("systemicTherapies")
    public List<SystemicTherapy> getSystemicTherapies() { return systemicTherapies; }
    @JsonProperty("systemicTherapies")
    public void setSystemicTherapies(List<SystemicTherapy> value) { this.systemicTherapies = value; }
}
