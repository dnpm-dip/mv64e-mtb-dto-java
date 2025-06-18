package dev.pcvolkmer.mv64e.mtb;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConverterTest {

    @Test
    void shouldDeserializeJsonString() throws IOException {
        var resource = getClass().getClassLoader().getResource("mv64e-mtb-fake-patient.json");
        assertNotNull(Converter.fromJsonString(new String(resource.openStream().readAllBytes())));
    }

}
