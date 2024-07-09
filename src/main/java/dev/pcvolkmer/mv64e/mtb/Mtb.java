package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Mtb {
    private List<MtbCarePlan> carePlans;
    private List<ClaimResponse> claimResponses;
    private List<Claim> claims;
    private Consent consent;
    private List<MtbDiagnosis> diagnoses;
    private List<PerformanceStatus> ecogStatus;
    private MtbEpisode episode;
    private List<GeneticCounselingRecommendation> geneticCounsellingRequests;
    private List<HistologyReport> histologyReports;
    private List<MtbMedicationTherapy> lastGuidelineTherapies;
    private List<MolecularTherapy> molecularTherapies;
    private List<SomaticNgsReport> ngsReports;
    private MtbPatient patient;
    private List<MtbMedicationTherapy> previousGuidelineTherapies;
    private List<MtbMedicationRecommendation> recommendations;
    private List<Response> responses;
    private List<TumorSpecimen> specimens;
    private List<StudyEnrollmentRecommendation> studyInclusionRequests;

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

    @JsonProperty("consent")
    public Consent getConsent() { return consent; }
    @JsonProperty("consent")
    public void setConsent(Consent value) { this.consent = value; }

    @JsonProperty("diagnoses")
    public List<MtbDiagnosis> getDiagnoses() { return diagnoses; }
    @JsonProperty("diagnoses")
    public void setDiagnoses(List<MtbDiagnosis> value) { this.diagnoses = value; }

    @JsonProperty("ecogStatus")
    public List<PerformanceStatus> getEcogStatus() { return ecogStatus; }
    @JsonProperty("ecogStatus")
    public void setEcogStatus(List<PerformanceStatus> value) { this.ecogStatus = value; }

    @JsonProperty("episode")
    public MtbEpisode getEpisode() { return episode; }
    @JsonProperty("episode")
    public void setEpisode(MtbEpisode value) { this.episode = value; }

    @JsonProperty("geneticCounsellingRequests")
    public List<GeneticCounselingRecommendation> getGeneticCounsellingRequests() { return geneticCounsellingRequests; }
    @JsonProperty("geneticCounsellingRequests")
    public void setGeneticCounsellingRequests(List<GeneticCounselingRecommendation> value) { this.geneticCounsellingRequests = value; }

    @JsonProperty("histologyReports")
    public List<HistologyReport> getHistologyReports() { return histologyReports; }
    @JsonProperty("histologyReports")
    public void setHistologyReports(List<HistologyReport> value) { this.histologyReports = value; }

    @JsonProperty("lastGuidelineTherapies")
    public List<MtbMedicationTherapy> getLastGuidelineTherapies() { return lastGuidelineTherapies; }
    @JsonProperty("lastGuidelineTherapies")
    public void setLastGuidelineTherapies(List<MtbMedicationTherapy> value) { this.lastGuidelineTherapies = value; }

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

    @JsonProperty("previousGuidelineTherapies")
    public List<MtbMedicationTherapy> getPreviousGuidelineTherapies() { return previousGuidelineTherapies; }
    @JsonProperty("previousGuidelineTherapies")
    public void setPreviousGuidelineTherapies(List<MtbMedicationTherapy> value) { this.previousGuidelineTherapies = value; }

    @JsonProperty("recommendations")
    public List<MtbMedicationRecommendation> getRecommendations() { return recommendations; }
    @JsonProperty("recommendations")
    public void setRecommendations(List<MtbMedicationRecommendation> value) { this.recommendations = value; }

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
