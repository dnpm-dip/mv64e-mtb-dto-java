package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class IhcReportResults {
    private List<MSIMmr> msiMmr;
    private List<ProteinExpression> proteinExpression;

    @JsonProperty("msiMmr")
    public List<MSIMmr> getMsiMmr() { return msiMmr; }
    @JsonProperty("msiMmr")
    public void setMsiMmr(List<MSIMmr> value) { this.msiMmr = value; }

    @JsonProperty("proteinExpression")
    public List<ProteinExpression> getProteinExpression() { return proteinExpression; }
    @JsonProperty("proteinExpression")
    public void setProteinExpression(List<ProteinExpression> value) { this.proteinExpression = value; }
}
