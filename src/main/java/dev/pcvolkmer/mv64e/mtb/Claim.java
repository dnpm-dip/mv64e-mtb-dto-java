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
public class Claim {
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date issuedOn;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("recommendation")})
    @Setter(onMethod_ = {@JsonProperty("recommendation")})
    private Reference recommendation;
    @Getter(onMethod_ = {@JsonProperty("requestedMedication")})
    @Setter(onMethod_ = {@JsonProperty("requestedMedication")})
    private List<AtcUnregisteredMedicationCoding> requestedMedication;
    @Getter(onMethod_ = {@JsonProperty("stage")})
    @Setter(onMethod_ = {@JsonProperty("stage")})
    private ClaimStageCoding stage;
}
