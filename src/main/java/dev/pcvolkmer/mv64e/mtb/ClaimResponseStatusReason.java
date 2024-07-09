package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClaimResponseStatusReason {
    APPROVAL_REVOCATION, FORMAL_REASONS, INCLUSION_IN_STUDY, INSUFFICIENT_EVIDENCE, OTHER, OTHER_THERAPY_RECOMMENDED, STANDARD_THERAPY_NOT_EXHAUSTED, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPROVAL_REVOCATION: return "approval-revocation";
            case FORMAL_REASONS: return "formal-reasons";
            case INCLUSION_IN_STUDY: return "inclusion-in-study";
            case INSUFFICIENT_EVIDENCE: return "insufficient-evidence";
            case OTHER: return "other";
            case OTHER_THERAPY_RECOMMENDED: return "other-therapy-recommended";
            case STANDARD_THERAPY_NOT_EXHAUSTED: return "standard-therapy-not-exhausted";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static ClaimResponseStatusReason forValue(String value) throws IOException {
        switch (value) {
            case "approval-revocation":
                return APPROVAL_REVOCATION;
            case "formal-reasons":
                return FORMAL_REASONS;
            case "inclusion-in-study":
                return INCLUSION_IN_STUDY;
            case "insufficient-evidence":
                return INSUFFICIENT_EVIDENCE;
            case "other":
                return OTHER;
            case "other-therapy-recommended":
                return OTHER_THERAPY_RECOMMENDED;
            case "standard-therapy-not-exhausted":
                return STANDARD_THERAPY_NOT_EXHAUSTED;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize ClaimResponseStatusReason");
    }
}
