package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingBaseVariantLocalizationCode {
    CODING_REGION, INTERGENIC, INTRONIC, REGULATORY_REGION, SPLICING_REGION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CODING_REGION: return "coding-region";
            case INTERGENIC: return "intergenic";
            case INTRONIC: return "intronic";
            case REGULATORY_REGION: return "regulatory-region";
            case SPLICING_REGION: return "splicing-region";
        }
        return null;
    }

    @JsonCreator
    public static CodingBaseVariantLocalizationCode forValue(String value) throws IOException {
        if (value.equals("coding-region")) return CODING_REGION;
        if (value.equals("intergenic")) return INTERGENIC;
        if (value.equals("intronic")) return INTRONIC;
        if (value.equals("regulatory-region")) return REGULATORY_REGION;
        if (value.equals("splicing-region")) return SPLICING_REGION;
        throw new IOException("Cannot deserialize CodingBaseVariantLocalizationCode");
    }
}
