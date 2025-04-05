package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LevelOfEvidence {
    private List<CodingLevelOfEvidenceAddendum> addendums;
    private CodingLevelOfEvidenceGrading grading;
    private List<PublicationReference> publications;

    @JsonProperty("addendums")
    public List<CodingLevelOfEvidenceAddendum> getAddendums() { return addendums; }
    @JsonProperty("addendums")
    public void setAddendums(List<CodingLevelOfEvidenceAddendum> value) { this.addendums = value; }

    @JsonProperty("grading")
    public CodingLevelOfEvidenceGrading getGrading() { return grading; }
    @JsonProperty("grading")
    public void setGrading(CodingLevelOfEvidenceGrading value) { this.grading = value; }

    @JsonProperty("publications")
    public List<PublicationReference> getPublications() { return publications; }
    @JsonProperty("publications")
    public void setPublications(List<PublicationReference> value) { this.publications = value; }
}
