package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    @Getter(onMethod_ = {@JsonProperty("birthDate"), @JsonFormat(pattern = "yyyy-MM")})
    @Setter(onMethod_ = {@JsonProperty("birthDate"), @JsonDeserialize(using = YearMonthDeserializerWithFallback.class)})
    private Date birthDate;
    @Getter(onMethod_ = {@JsonProperty("dateOfDeath"), @JsonFormat(pattern = "yyyy-MM")})
    @Setter(onMethod_ = {@JsonProperty("dateOfDeath"), @JsonDeserialize(using = YearMonthDeserializerWithFallback.class)})
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

    static class YearMonthDeserializerWithFallback extends JsonDeserializer<Date> {

        @Override
        public Date deserialize(
                JsonParser jsonParser,
                DeserializationContext deserializationContext) throws IOException {
            final var dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            final var yearMonthFormat = new SimpleDateFormat("yyyy-MM");

            var str = jsonParser.getText();

            try {
                return yearMonthFormat.parse(str);
            } catch (ParseException e) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException e1) {
                    // left empty
                }
            }

            throw new IOException("Invalid date format for Patient birtDate or dataOfDeath");
        }
    }
}
