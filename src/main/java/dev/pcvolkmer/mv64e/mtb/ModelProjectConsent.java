package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModelProjectConsent {
    @Getter(onMethod_ = {@JsonProperty("date")})
    @Setter(onMethod_ = {@JsonProperty("date")})
    private Date date;
    @Getter(onMethod_ = {@JsonProperty("provisions")})
    @Setter(onMethod_ = {@JsonProperty("provisions")})
    private List<Provision> provisions;
    @Getter(onMethod_ = {@JsonProperty("version")})
    @Setter(onMethod_ = {@JsonProperty("version")})
    private String version;
}
