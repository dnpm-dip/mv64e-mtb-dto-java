package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response {
    @Getter(onMethod_ = {@JsonProperty("effectiveDate"), @JsonFormat(pattern = "yyyy-MM-dd")})
    @Setter(onMethod_ = {@JsonProperty("effectiveDate"), @JsonFormat(pattern = "yyyy-MM-dd")})
    private Date effectiveDate;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("method")})
    @Setter(onMethod_ = {@JsonProperty("method")})
    private ResponseMethodCoding method;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("therapy")})
    @Setter(onMethod_ = {@JsonProperty("therapy")})
    private Reference therapy;
    @Getter(onMethod_ = {@JsonProperty("value")})
    @Setter(onMethod_ = {@JsonProperty("value")})
    private RecistCoding value;
}
