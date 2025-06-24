package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FamilyMemberHistory {
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @Getter(onMethod_ = {@JsonProperty("patient")})
    @Setter(onMethod_ = {@JsonProperty("patient")})
    private Reference patient;
    @Getter(onMethod_ = {@JsonProperty("relationship")})
    @Setter(onMethod_ = {@JsonProperty("relationship")})
    private FamilyMemberHistoryRelationshipTypeCoding relationship;
}
