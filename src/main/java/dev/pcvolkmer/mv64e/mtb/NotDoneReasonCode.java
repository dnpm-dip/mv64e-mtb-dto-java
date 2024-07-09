package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NotDoneReasonCode {
    CHRONIC_REMISSION, CONTINUED_EXTERNALLY, DETERIORATION, LOST_TO_FU, MEDICAL_REASON, NO_INDICATION, OTHER, OTHER_THERAPY_CHOSEN, PATIENT_DEATH, PATIENT_REFUSAL, PATIENT_WISH, PAYMENT_ENDED, PAYMENT_PENDING, PAYMENT_REFUSED, PROGRESSION, TOXICITY, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHRONIC_REMISSION: return "chronic-remission";
            case CONTINUED_EXTERNALLY: return "continued-externally";
            case DETERIORATION: return "deterioration";
            case LOST_TO_FU: return "lost-to-fu";
            case MEDICAL_REASON: return "medical-reason";
            case NO_INDICATION: return "no-indication";
            case OTHER: return "other";
            case OTHER_THERAPY_CHOSEN: return "other-therapy-chosen";
            case PATIENT_DEATH: return "patient-death";
            case PATIENT_REFUSAL: return "patient-refusal";
            case PATIENT_WISH: return "patient-wish";
            case PAYMENT_ENDED: return "payment-ended";
            case PAYMENT_PENDING: return "payment-pending";
            case PAYMENT_REFUSED: return "payment-refused";
            case PROGRESSION: return "progression";
            case TOXICITY: return "toxicity";
            case UNKNOWN: return "unknown";
        }
        return null;
    }

    @JsonCreator
    public static NotDoneReasonCode forValue(String value) throws IOException {
        switch (value) {
            case "chronic-remission":
                return CHRONIC_REMISSION;
            case "continued-externally":
                return CONTINUED_EXTERNALLY;
            case "deterioration":
                return DETERIORATION;
            case "lost-to-fu":
                return LOST_TO_FU;
            case "medical-reason":
                return MEDICAL_REASON;
            case "no-indication":
                return NO_INDICATION;
            case "other":
                return OTHER;
            case "other-therapy-chosen":
                return OTHER_THERAPY_CHOSEN;
            case "patient-death":
                return PATIENT_DEATH;
            case "patient-refusal":
                return PATIENT_REFUSAL;
            case "patient-wish":
                return PATIENT_WISH;
            case "payment-ended":
                return PAYMENT_ENDED;
            case "payment-pending":
                return PAYMENT_PENDING;
            case "payment-refused":
                return PAYMENT_REFUSED;
            case "progression":
                return PROGRESSION;
            case "toxicity":
                return TOXICITY;
            case "unknown":
                return UNKNOWN;
        }
        throw new IOException("Cannot deserialize NotDoneReasonCode");
    }
}
