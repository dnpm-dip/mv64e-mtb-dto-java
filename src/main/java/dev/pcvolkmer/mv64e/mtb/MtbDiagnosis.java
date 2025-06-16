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
public class MtbDiagnosis {
    @Getter(onMethod_ = {@JsonProperty("code")})
    @Setter(onMethod_ = {@JsonProperty("code")})
    private Coding code;
    @Getter(onMethod_ = {@JsonProperty("germlineCodes")})
    @Setter(onMethod_ = {@JsonProperty("germlineCodes")})
    private List<Coding> germlineCodes;
    @Getter(onMethod_ = {@JsonProperty("grading")})
    @Setter(onMethod_ = {@JsonProperty("grading")})
    private Grading grading;
    @Getter(onMethod_ = {@JsonProperty("guidelineTreatmentStatus")})
    @Setter(onMethod_ = {@JsonProperty("guidelineTreatmentStatus")})
    private MtbDiagnosisGuidelineTreatmentStatusCoding guidelineTreatmentStatus;
    @Getter(onMethod_ = {@JsonProperty("histology")})
    @Setter(onMethod_ = {@JsonProperty("histology")})
    private List<Reference> histology;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("notes")})
    @Setter(onMethod_ = {@JsonProperty("notes")})
    private List<String> notes;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("recordedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("recordedOn"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date recordedOn;
    @Getter(onMethod_ = {@JsonProperty("staging")})
    @Setter(onMethod_ = {@JsonProperty("staging")})
    private Staging staging;
    @Getter(onMethod_ = {@JsonProperty("topography")})
    @Setter(onMethod_ = {@JsonProperty("topography")})
    private Coding topography;
    @Getter(onMethod_ = {@JsonProperty("type")})
    @Setter(onMethod_ = {@JsonProperty("type")})
    private Type type;
}
