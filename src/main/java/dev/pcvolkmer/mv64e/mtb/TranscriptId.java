package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TranscriptId {
    @Getter(onMethod_ = {@JsonProperty("system")})
    @Setter(onMethod_ = {@JsonProperty("system")})
    private TranscriptIdSystem system;
    @Getter(onMethod_ = {@JsonProperty("value")})
    @Setter(onMethod_ = {@JsonProperty("value")})
    private String value;
}
