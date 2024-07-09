package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Chromosome {
    CHR1, CHR10, CHR11, CHR12, CHR13, CHR14, CHR15, CHR16, CHR17, CHR18, CHR19, CHR2, CHR20, CHR21, CHR22, CHR3, CHR4, CHR5, CHR6, CHR7, CHR8, CHR9, CHR_X, CHR_Y;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHR1: return "chr1";
            case CHR10: return "chr10";
            case CHR11: return "chr11";
            case CHR12: return "chr12";
            case CHR13: return "chr13";
            case CHR14: return "chr14";
            case CHR15: return "chr15";
            case CHR16: return "chr16";
            case CHR17: return "chr17";
            case CHR18: return "chr18";
            case CHR19: return "chr19";
            case CHR2: return "chr2";
            case CHR20: return "chr20";
            case CHR21: return "chr21";
            case CHR22: return "chr22";
            case CHR3: return "chr3";
            case CHR4: return "chr4";
            case CHR5: return "chr5";
            case CHR6: return "chr6";
            case CHR7: return "chr7";
            case CHR8: return "chr8";
            case CHR9: return "chr9";
            case CHR_X: return "chrX";
            case CHR_Y: return "chrY";
        }
        return null;
    }

    @JsonCreator
    public static Chromosome forValue(String value) throws IOException {
        switch (value) {
            case "chr1":
                return CHR1;
            case "chr10":
                return CHR10;
            case "chr11":
                return CHR11;
            case "chr12":
                return CHR12;
            case "chr13":
                return CHR13;
            case "chr14":
                return CHR14;
            case "chr15":
                return CHR15;
            case "chr16":
                return CHR16;
            case "chr17":
                return CHR17;
            case "chr18":
                return CHR18;
            case "chr19":
                return CHR19;
            case "chr2":
                return CHR2;
            case "chr20":
                return CHR20;
            case "chr21":
                return CHR21;
            case "chr22":
                return CHR22;
            case "chr3":
                return CHR3;
            case "chr4":
                return CHR4;
            case "chr5":
                return CHR5;
            case "chr6":
                return CHR6;
            case "chr7":
                return CHR7;
            case "chr8":
                return CHR8;
            case "chr9":
                return CHR9;
            case "chrX":
                return CHR_X;
            case "chrY":
                return CHR_Y;
        }
        throw new IOException("Cannot deserialize Chromosome");
    }
}
