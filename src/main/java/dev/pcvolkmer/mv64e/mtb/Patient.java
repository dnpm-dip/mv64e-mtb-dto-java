package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient {
    @Getter(onMethod_ = {@JsonProperty("address")})
    @Setter(onMethod_ = {@JsonProperty("address")})
    private Address address;
    @Getter(onMethod_ = {@JsonProperty("age")})
    @Setter(onMethod_ = {@JsonProperty("age")})
    private Age age;
    @Getter(onMethod_ = {@JsonProperty("birthDate"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("birthDate"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date birthDate;
    @Getter(onMethod_ = {@JsonProperty("dateOfDeath"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("dateOfDeath"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date dateOfDeath;
    @Getter(onMethod_ = {@JsonProperty("gender")})
    @Setter(onMethod_ = {@JsonProperty("gender")})
    private GenderCoding gender;
    @Getter(onMethod_ = {@JsonProperty("healthInsurance")})
    @Setter(onMethod_ = {@JsonProperty("healthInsurance")})
    private HealthInsurance healthInsurance;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("managingSite")})
    @Setter(onMethod_ = {@JsonProperty("managingSite")})
    private Coding managingSite;
    @Getter(onMethod_ = {@JsonProperty("vitalStatus")})
    @Setter(onMethod_ = {@JsonProperty("vitalStatus")})
    private VitalStatusCoding vitalStatus;
}
