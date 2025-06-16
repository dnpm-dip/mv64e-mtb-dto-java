package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Provision {
    @Getter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date date;
    @Getter(onMethod_ = {@JsonProperty("purpose")})
    @Setter(onMethod_ = {@JsonProperty("purpose")})
    private ModelProjectConsentPurpose purpose;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private ConsentProvision type;
}
