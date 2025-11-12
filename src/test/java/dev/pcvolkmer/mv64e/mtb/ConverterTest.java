package dev.pcvolkmer.mv64e.mtb;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConverterTest {

    @Test
    void shouldDeserializeJsonString() throws IOException {
        var resource = getClass().getClassLoader().getResource("mv64e-mtb-fake-patient.json");
        assertNotNull(Converter.fromJsonString(new String(resource.openStream().readAllBytes())));
    }

    @Test
    void shouldKeepPatientBirthdateFormatInYearMonth() throws IOException {
        var resource = getClass().getClassLoader().getResource("mv64e-mtb-fake-patient.json");
        var json = new String(resource.openStream().readAllBytes());
        // Fake birthdate to old format
        json = Pattern.compile("\"birthDate\":\"\\d{4}-\\d{2}(-\\d{2})?\"")
                .matcher(json)
                .replaceAll("\"birthDate\":\"2025-03\"");

        var mtb = Converter.fromJsonString(json);

        var actual = Converter.toJsonString(mtb);
        // Expect new format
        assertThat(actual).contains("\"birthDate\":\"2025-03\"");
    }

    @Test
    void shouldConvertPatientBirthdateFormatToYearMonth() throws IOException {
        var resource = getClass().getClassLoader().getResource("mv64e-mtb-fake-patient.json");
        var json = new String(resource.openStream().readAllBytes());
        // Fake birthdate to old format
        json = Pattern.compile("\"birthDate\":\"\\d{4}-\\d{2}(-\\d{2})?\"")
                .matcher(json)
                .replaceAll("\"birthDate\":\"2025-03-19\"");

        var mtb = Converter.fromJsonString(json);

        var actual = Converter.toJsonString(mtb);
        // Expect new format
        assertThat(actual).contains("\"birthDate\":\"2025-03\"");
    }

}
