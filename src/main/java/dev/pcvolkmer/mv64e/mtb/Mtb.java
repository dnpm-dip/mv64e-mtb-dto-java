package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Mtb {
    private List<MTBCarePlan> carePlans;
    private List<ClaimResponse> claimResponses;
    private List<Claim> claims;
    private List<MTBDiagnosis> diagnoses;
    private MTBEpisode episode;
    private List<EpisodeOfCare> episodesOfCare;
    private List<GeneticCounselingRecommendation> geneticCounsellingRequests;
    private List<OncoProdecure> guidelineProcedures;
    private List<MTBMedicationTherapy> guidelineTherapies;
    private List<HistologyReport> histologyReports;
    private List<MolecularTherapy> molecularTherapies;
    private List<SomaticNgsReport> ngsReports;
    private MtbPatient patient;
    private List<PerformanceStatus> performanceStatus;
    private List<MTBMedicationRecommendation> recommendations;
    private List<Response> responses;
    private List<TumorSpecimen> specimens;
    private List<StudyEnrollmentRecommendation> studyInclusionRequests;

    @JsonProperty("carePlans")
    public List<MTBCarePlan> getCarePlans() { return carePlans; }
    @JsonProperty("carePlans")
    public void setCarePlans(List<MTBCarePlan> value) { this.carePlans = value; }

    @JsonProperty("claimResponses")
    public List<ClaimResponse> getClaimResponses() { return claimResponses; }
    @JsonProperty("claimResponses")
    public void setClaimResponses(List<ClaimResponse> value) { this.claimResponses = value; }

    @JsonProperty("claims")
    public List<Claim> getClaims() { return claims; }
    @JsonProperty("claims")
    public void setClaims(List<Claim> value) { this.claims = value; }

    @JsonProperty("diagnoses")
    public List<MTBDiagnosis> getDiagnoses() { return diagnoses; }
    @JsonProperty("diagnoses")
    public void setDiagnoses(List<MTBDiagnosis> value) { this.diagnoses = value; }

    @JsonProperty("episode")
    public MTBEpisode getEpisode() { return episode; }
    @JsonProperty("episode")
    public void setEpisode(MTBEpisode value) { this.episode = value; }

    @JsonProperty("episodesOfCare")
    public List<EpisodeOfCare> getEpisodesOfCare() { return episodesOfCare; }
    @JsonProperty("episodesOfCare")
    public void setEpisodesOfCare(List<EpisodeOfCare> value) { this.episodesOfCare = value; }

    @JsonProperty("geneticCounsellingRequests")
    public List<GeneticCounselingRecommendation> getGeneticCounsellingRequests() { return geneticCounsellingRequests; }
    @JsonProperty("geneticCounsellingRequests")
    public void setGeneticCounsellingRequests(List<GeneticCounselingRecommendation> value) { this.geneticCounsellingRequests = value; }

    @JsonProperty("guidelineProcedures")
    public List<OncoProdecure> getGuidelineProcedures() { return guidelineProcedures; }
    @JsonProperty("guidelineProcedures")
    public void setGuidelineProcedures(List<OncoProdecure> value) { this.guidelineProcedures = value; }

    @JsonProperty("guidelineTherapies")
    public List<MTBMedicationTherapy> getGuidelineTherapies() { return guidelineTherapies; }
    @JsonProperty("guidelineTherapies")
    public void setGuidelineTherapies(List<MTBMedicationTherapy> value) { this.guidelineTherapies = value; }

    @JsonProperty("histologyReports")
    public List<HistologyReport> getHistologyReports() { return histologyReports; }
    @JsonProperty("histologyReports")
    public void setHistologyReports(List<HistologyReport> value) { this.histologyReports = value; }

    @JsonProperty("molecularTherapies")
    public List<MolecularTherapy> getMolecularTherapies() { return molecularTherapies; }
    @JsonProperty("molecularTherapies")
    public void setMolecularTherapies(List<MolecularTherapy> value) { this.molecularTherapies = value; }

    @JsonProperty("ngsReports")
    public List<SomaticNgsReport> getNgsReports() { return ngsReports; }
    @JsonProperty("ngsReports")
    public void setNgsReports(List<SomaticNgsReport> value) { this.ngsReports = value; }

    @JsonProperty("patient")
    public MtbPatient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(MtbPatient value) { this.patient = value; }

    @JsonProperty("performanceStatus")
    public List<PerformanceStatus> getPerformanceStatus() { return performanceStatus; }
    @JsonProperty("performanceStatus")
    public void setPerformanceStatus(List<PerformanceStatus> value) { this.performanceStatus = value; }

    @JsonProperty("recommendations")
    public List<MTBMedicationRecommendation> getRecommendations() { return recommendations; }
    @JsonProperty("recommendations")
    public void setRecommendations(List<MTBMedicationRecommendation> value) { this.recommendations = value; }

    @JsonProperty("responses")
    public List<Response> getResponses() { return responses; }
    @JsonProperty("responses")
    public void setResponses(List<Response> value) { this.responses = value; }

    @JsonProperty("specimens")
    public List<TumorSpecimen> getSpecimens() { return specimens; }
    @JsonProperty("specimens")
    public void setSpecimens(List<TumorSpecimen> value) { this.specimens = value; }

    @JsonProperty("studyInclusionRequests")
    public List<StudyEnrollmentRecommendation> getStudyInclusionRequests() { return studyInclusionRequests; }
    @JsonProperty("studyInclusionRequests")
    public void setStudyInclusionRequests(List<StudyEnrollmentRecommendation> value) { this.studyInclusionRequests = value; }
}
