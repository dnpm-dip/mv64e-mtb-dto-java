package dev.pcvolkmer.mv64e.mtb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum ClaimResponseStatusReasonCodingCode {
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
    public static ClaimResponseStatusReasonCodingCode forValue(String value) throws IOException {
        if (value.equals("approval-revocation")) return APPROVAL_REVOCATION;
        if (value.equals("formal-reasons")) return FORMAL_REASONS;
        if (value.equals("inclusion-in-study")) return INCLUSION_IN_STUDY;
        if (value.equals("insufficient-evidence")) return INSUFFICIENT_EVIDENCE;
        if (value.equals("other")) return OTHER;
        if (value.equals("other-therapy-recommended")) return OTHER_THERAPY_RECOMMENDED;
        if (value.equals("standard-therapy-not-exhausted")) return STANDARD_THERAPY_NOT_EXHAUSTED;
        if (value.equals("unknown")) return UNKNOWN;
        throw new IOException("Cannot deserialize ClaimResponseStatusReasonCodingCode");
    }
}
