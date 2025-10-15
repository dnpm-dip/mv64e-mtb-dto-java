package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ResearchConsentReasonMissing {
    CONSENT_NOT_RETURNED, ORGANIZATIONAL_ISSUES, OTHER_PATIENT_REASON, PATIENT_INABILITY, PATIENT_REFUSAL, TECHNICAL_ISSUES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONSENT_NOT_RETURNED: return "consent-not-returned";
            case ORGANIZATIONAL_ISSUES: return "organizational-issues";
            case OTHER_PATIENT_REASON: return "other-patient-reason";
            case PATIENT_INABILITY: return "patient-inability";
            case PATIENT_REFUSAL: return "patient-refusal";
            case TECHNICAL_ISSUES: return "technical-issues";
        }
        return null;
    }

    @JsonCreator
    public static ResearchConsentReasonMissing forValue(String value) throws IOException {
        if (value.equals("consent-not-returned")) return CONSENT_NOT_RETURNED;
        if (value.equals("organizational-issues")) return ORGANIZATIONAL_ISSUES;
        if (value.equals("other-patient-reason")) return OTHER_PATIENT_REASON;
        if (value.equals("patient-inability")) return PATIENT_INABILITY;
        if (value.equals("patient-refusal")) return PATIENT_REFUSAL;
        if (value.equals("technical-issues")) return TECHNICAL_ISSUES;
        throw new IOException("Cannot deserialize ResearchConsentReasonMissing");
    }
}