package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NgsReportResults {
    @Getter(onMethod_ = {@JsonProperty("brcaness")})
    @Setter(onMethod_ = {@JsonProperty("brcaness")})
    private Brcaness brcaness;
    @Getter(onMethod_ = {@JsonProperty("copyNumberVariants")})
    @Setter(onMethod_ = {@JsonProperty("copyNumberVariants")})
    private List<Cnv> copyNumberVariants;
    @Getter(onMethod_ = {@JsonProperty("dnaFusions")})
    @Setter(onMethod_ = {@JsonProperty("dnaFusions")})
    private List<DnaFusion> dnaFusions;
    @Getter(onMethod_ = {@JsonProperty("hrdScore")})
    @Setter(onMethod_ = {@JsonProperty("hrdScore")})
    private HrdScore hrdScore;
    @Getter(onMethod_ = {@JsonProperty("rnaFusions")})
    @Setter(onMethod_ = {@JsonProperty("rnaFusions")})
    private List<RnaFusion> rnaFusions;
    @Getter(onMethod_ = {@JsonProperty("rnaSeqs")})
    @Setter(onMethod_ = {@JsonProperty("rnaSeqs")})
    private List<RnaSeq> rnaSeqs;
    @Getter(onMethod_ = {@JsonProperty("simpleVariants")})
    @Setter(onMethod_ = {@JsonProperty("simpleVariants")})
    private List<Snv> simpleVariants;
    @Getter(onMethod_ = {@JsonProperty("tmb")})
    @Setter(onMethod_ = {@JsonProperty("tmb")})
    private Tmb tmb;
    @Getter(onMethod_ = {@JsonProperty("tumorCellContent")})
    @Setter(onMethod_ = {@JsonProperty("tumorCellContent")})
    private TumorCellContent tumorCellContent;
}
