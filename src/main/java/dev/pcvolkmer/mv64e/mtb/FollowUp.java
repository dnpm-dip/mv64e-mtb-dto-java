package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FollowUp {
    @Getter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("date"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date date;
    @Getter(onMethod_ = {@JsonProperty("lastContactDate"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("lastContactDate"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date lastContactDate;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("patientStatus")})
    @Setter(onMethod_ = {@JsonProperty("patientStatus")})
    private FollowUpPatientStatusCoding patientStatus;
}
