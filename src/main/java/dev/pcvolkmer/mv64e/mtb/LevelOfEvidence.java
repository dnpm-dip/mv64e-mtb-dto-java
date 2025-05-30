package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LevelOfEvidence {
    private List<LevelOfEvidenceAddendumCoding> addendums;
    private LevelOfEvidenceGradingCoding grading;
    private List<PublicationReference> publications;

    @JsonProperty("addendums")
    public List<LevelOfEvidenceAddendumCoding> getAddendums() { return addendums; }
    @JsonProperty("addendums")
    public void setAddendums(List<LevelOfEvidenceAddendumCoding> value) { this.addendums = value; }

    @JsonProperty("grading")
    public LevelOfEvidenceGradingCoding getGrading() { return grading; }
    @JsonProperty("grading")
    public void setGrading(LevelOfEvidenceGradingCoding value) { this.grading = value; }

    @JsonProperty("publications")
    public List<PublicationReference> getPublications() { return publications; }
    @JsonProperty("publications")
    public void setPublications(List<PublicationReference> value) { this.publications = value; }
}
