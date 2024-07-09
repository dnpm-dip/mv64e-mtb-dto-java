package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClaimResponseClaimType {
    CLAIM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CLAIM: return "Claim";
        }
        return null;
    }

    @JsonCreator
    public static ClaimResponseClaimType forValue(String value) throws IOException {
        if (value.equals("Claim")) return CLAIM;
        throw new IOException("Cannot deserialize ClaimResponseClaimType");
    }
}
