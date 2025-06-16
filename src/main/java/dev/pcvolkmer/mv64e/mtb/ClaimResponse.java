package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClaimResponse {
    @Getter(onMethod_ = {@JsonProperty("claim")})
    @Setter(onMethod_ = {@JsonProperty("claim")})
    private Reference claim;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date issuedOn;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("status")})
    @Setter(onMethod_ = {@JsonProperty("status")})
    private ClaimResponseStatusCoding status;
    @Getter(onMethod_ = {@JsonProperty("statusReason")})
    @Setter(onMethod_ = {@JsonProperty("statusReason")})
    private ClaimResponseStatusReasonCoding statusReason;
}
