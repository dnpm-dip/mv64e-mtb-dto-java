package dev.pcvolkmer.mv64e.mtb;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodingMolecularDiagnosticReportCode {
    ARRAY, EXOME, FISH, FUSION_PANEL, GENE_PANEL, GENOME_LONG_READ, GENOME_SHORT_READ, KARYOTYPING, OTHER, PANEL, PCR, SINGLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ARRAY: return "array";
            case EXOME: return "exome";
            case FISH: return "FISH";
            case FUSION_PANEL: return "fusion-panel";
            case GENE_PANEL: return "gene-panel";
            case GENOME_LONG_READ: return "genome-long-read";
            case GENOME_SHORT_READ: return "genome-short-read";
            case KARYOTYPING: return "karyotyping";
            case OTHER: return "other";
            case PANEL: return "panel";
            case PCR: return "PCR";
            case SINGLE: return "single";
        }
        return null;
    }

    @JsonCreator
    public static CodingMolecularDiagnosticReportCode forValue(String value) throws IOException {
        if (value.equals("array")) return ARRAY;
        if (value.equals("exome")) return EXOME;
        if (value.equals("FISH")) return FISH;
        if (value.equals("fusion-panel")) return FUSION_PANEL;
        if (value.equals("gene-panel")) return GENE_PANEL;
        if (value.equals("genome-long-read")) return GENOME_LONG_READ;
        if (value.equals("genome-short-read")) return GENOME_SHORT_READ;
        if (value.equals("karyotyping")) return KARYOTYPING;
        if (value.equals("other")) return OTHER;
        if (value.equals("panel")) return PANEL;
        if (value.equals("PCR")) return PCR;
        if (value.equals("single")) return SINGLE;
        throw new IOException("Cannot deserialize CodingMolecularDiagnosticReportCode");
    }
}
