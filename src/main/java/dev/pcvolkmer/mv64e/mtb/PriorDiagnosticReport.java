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
public class PriorDiagnosticReport {
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("issuedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date issuedOn;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("performer")})
    @Setter(onMethod_ = {@JsonProperty("performer")})
    private Reference performer;
    @Getter(onMethod_ = {@JsonProperty("results")})
    @Setter(onMethod_ = {@JsonProperty("results")})
    private List<String> results;
    @Getter(onMethod_ = {@JsonProperty("specimen")})
    @Setter(onMethod_ = {@JsonProperty("specimen")})
    private Reference specimen;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private MolecularDiagnosticReportCoding type;
}
