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
public class MtbSystemicTherapy {
    @Getter(onMethod_ = {@JsonProperty("basedOn")})
    @Setter(onMethod_ = {@JsonProperty("basedOn")})
    private Reference basedOn;
    @Getter(onMethod_ = {@JsonProperty("category")})
    @Setter(onMethod_ = {@JsonProperty("category")})
    private MtbSystemicTherapyCategoryCoding category;
    @Getter(onMethod_ = {@JsonProperty("dosage")})
    @Setter(onMethod_ = {@JsonProperty("dosage")})
    private MtbSystemicTherapyDosageDensityCoding dosage;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("intent")})
    @Setter(onMethod_ = {@JsonProperty("intent")})
    private MtbTherapyIntentCoding intent;
    @Getter(onMethod_ = {@JsonProperty("medication")})
    @Setter(onMethod_ = {@JsonProperty("medication")})
    private List<AtcUnregisteredMedicationCoding> medication;
    @Getter(onMethod_ = {@JsonProperty("notes")})
    @Setter(onMethod_ = {@JsonProperty("notes")})
    private List<String> notes;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("period")})
    @Setter(onMethod_ = {@JsonProperty("period")})
    private PeriodDate period;
    @Getter(onMethod_ = {@JsonProperty("reason")})
    @Setter(onMethod_ = {@JsonProperty("reason")})
    private Reference reason;
    @Getter(onMethod_ = {@JsonProperty("recommendationFulfillmentStatus")})
    @Setter(onMethod_ = {@JsonProperty("recommendationFulfillmentStatus")})
    private MtbSystemicTherapyRecommendationFulfillmentStatusCoding recommendationFulfillmentStatus;
    @Getter(onMethod_ = {@JsonProperty("recordedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("recordedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date recordedOn;
    @Getter(onMethod_ = {@JsonProperty("status")})
    @Setter(onMethod_ = {@JsonProperty("status")})
    private TherapyStatusCoding status;
    @Getter(onMethod_ = {@JsonProperty("statusReason")})
    @Setter(onMethod_ = {@JsonProperty("statusReason")})
    private MtbTherapyStatusReasonCoding statusReason;
    @Getter(onMethod_ = {@JsonProperty("therapyLine")})
    @Setter(onMethod_ = {@JsonProperty("therapyLine")})
    private Long therapyLine;
}
