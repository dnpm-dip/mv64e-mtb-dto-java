package dev.pcvolkmer.mv64e.mtb;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ConverterTest {

    @Test
    void shouldDeserializeJsonString() throws IOException {
        var ressource = getClass().getClassLoader().getResource("mv64e-mtb-fake-patient.json");

        Converter.fromJsonString(new String(ressource.openStream().readAllBytes()));
    }

}
