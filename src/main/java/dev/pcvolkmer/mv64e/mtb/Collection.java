package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Collection {
    @Getter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date date;
    @Getter(onMethod_ = {@JsonProperty("localization")})
    @Setter(onMethod_ = {@JsonProperty("localization")})
    private TumorSpecimenCollectionLocalizationCoding localization;
    @Getter(onMethod_ = {@JsonProperty("method")})
    @Setter(onMethod_ = {@JsonProperty("method")})
    private TumorSpecimenCollectionMethodCoding method;
}
