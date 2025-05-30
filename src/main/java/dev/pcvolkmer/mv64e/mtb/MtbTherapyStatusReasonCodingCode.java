package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MtbTherapyStatusReasonCodingCode {
    BEST_SUPPORTIVE_CARE, CHRONIC_REMISSION, DETERIORATION, LOST_TO_FU, MEDICAL_REASONS, NO_INDICATION, OTHER, OTHER_THERAPY_CHOSEN, PATIENT_DEATH, PATIENT_REFUSAL, PATIENT_WISH, PAYMENT_ENDED, PAYMENT_PENDING, PAYMENT_REFUSED, PROGRESSION, REGULAR_COMPLETION, REGULAR_COMPLETION_WITH_DOSAGE_REDUCTION, REGULAR_COMPLETION_WITH_SUBSTANCE_CHANGE, TOXICITY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BEST_SUPPORTIVE_CARE: return "best-supportive-care";
            case CHRONIC_REMISSION: return "chronic-remission";
            case DETERIORATION: return "deterioration";
            case LOST_TO_FU: return "lost-to-fu";
            case MEDICAL_REASONS: return "medical-reasons";
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
            case REGULAR_COMPLETION: return "regular-completion";
            case REGULAR_COMPLETION_WITH_DOSAGE_REDUCTION: return "regular-completion-with-dosage-reduction";
            case REGULAR_COMPLETION_WITH_SUBSTANCE_CHANGE: return "regular-completion-with-substance-change";
            case TOXICITY: return "toxicity";
        }
        return null;
    }

    @JsonCreator
    public static MtbTherapyStatusReasonCodingCode forValue(String value) throws IOException {
        if (value.equals("best-supportive-care")) return BEST_SUPPORTIVE_CARE;
        if (value.equals("chronic-remission")) return CHRONIC_REMISSION;
        if (value.equals("deterioration")) return DETERIORATION;
        if (value.equals("lost-to-fu")) return LOST_TO_FU;
        if (value.equals("medical-reasons")) return MEDICAL_REASONS;
        if (value.equals("no-indication")) return NO_INDICATION;
        if (value.equals("other")) return OTHER;
        if (value.equals("other-therapy-chosen")) return OTHER_THERAPY_CHOSEN;
        if (value.equals("patient-death")) return PATIENT_DEATH;
        if (value.equals("patient-refusal")) return PATIENT_REFUSAL;
        if (value.equals("patient-wish")) return PATIENT_WISH;
        if (value.equals("payment-ended")) return PAYMENT_ENDED;
        if (value.equals("payment-pending")) return PAYMENT_PENDING;
        if (value.equals("payment-refused")) return PAYMENT_REFUSED;
        if (value.equals("progression")) return PROGRESSION;
        if (value.equals("regular-completion")) return REGULAR_COMPLETION;
        if (value.equals("regular-completion-with-dosage-reduction")) return REGULAR_COMPLETION_WITH_DOSAGE_REDUCTION;
        if (value.equals("regular-completion-with-substance-change")) return REGULAR_COMPLETION_WITH_SUBSTANCE_CHANGE;
        if (value.equals("toxicity")) return TOXICITY;
        throw new IOException("Cannot deserialize MtbTherapyStatusReasonCodingCode");
    }
}
