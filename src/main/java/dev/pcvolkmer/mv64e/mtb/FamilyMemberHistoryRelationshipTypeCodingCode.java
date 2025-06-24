package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FamilyMemberHistoryRelationshipTypeCodingCode {
    EXT, FAMMEMB;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXT: return "EXT";
            case FAMMEMB: return "FAMMEMB";
        }
        return null;
    }

    @JsonCreator
    public static FamilyMemberHistoryRelationshipTypeCodingCode forValue(String value) throws IOException {
        if (value.equals("EXT")) return EXT;
        if (value.equals("FAMMEMB")) return FAMMEMB;
        throw new IOException("Cannot deserialize FamilyMemberHistoryRelationshipTypeCodingCode");
    }
}
