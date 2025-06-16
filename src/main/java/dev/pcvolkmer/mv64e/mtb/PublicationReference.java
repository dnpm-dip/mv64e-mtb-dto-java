package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublicationReference {
    @Getter(onMethod_ = {@JsonProperty("display")})
    @Setter(onMethod_ = {@JsonProperty("display")})
    private String display;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("system")})
    @Setter(onMethod_ = {@JsonProperty("system")})
    private PublicationSystem system;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
}
