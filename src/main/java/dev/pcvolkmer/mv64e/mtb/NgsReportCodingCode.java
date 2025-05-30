package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NgsReportCodingCode {
    ARRAY, EXOME, GENOME_LONG_READ, GENOME_SHORT_READ, KARYOTYPING, OTHER, PANEL, SINGLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ARRAY: return "array";
            case EXOME: return "exome";
            case GENOME_LONG_READ: return "genome-long-read";
            case GENOME_SHORT_READ: return "genome-short-read";
            case KARYOTYPING: return "karyotyping";
            case OTHER: return "other";
            case PANEL: return "panel";
            case SINGLE: return "single";
        }
        return null;
    }

    @JsonCreator
    public static NgsReportCodingCode forValue(String value) throws IOException {
        if (value.equals("array")) return ARRAY;
        if (value.equals("exome")) return EXOME;
        if (value.equals("genome-long-read")) return GENOME_LONG_READ;
        if (value.equals("genome-short-read")) return GENOME_SHORT_READ;
        if (value.equals("karyotyping")) return KARYOTYPING;
        if (value.equals("other")) return OTHER;
        if (value.equals("panel")) return PANEL;
        if (value.equals("single")) return SINGLE;
        throw new IOException("Cannot deserialize NgsReportCodingCode");
    }
}
