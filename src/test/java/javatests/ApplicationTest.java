package javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {
    @Test
    public void shouldReturnTrue() {
        assertTrue(true, String.valueOf(Boolean.TRUE));
    }
}
