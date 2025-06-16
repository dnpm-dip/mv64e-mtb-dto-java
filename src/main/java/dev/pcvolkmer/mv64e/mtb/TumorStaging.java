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
public class TumorStaging {
    @Getter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date date;
    @Getter(onMethod_ = {@JsonProperty("method")})
    @Setter(onMethod_ = {@JsonProperty("method")})
    private TumorStagingMethodCoding method;
    @Getter(onMethod_ = {@JsonProperty("otherClassifications")})
    @Setter(onMethod_ = {@JsonProperty("otherClassifications")})
    private List<Coding> otherClassifications;
    @Getter(onMethod_ = {@JsonProperty("tnmClassification")})
    @Setter(onMethod_ = {@JsonProperty("tnmClassification")})
    private TnmClassification tnmClassification;
}
