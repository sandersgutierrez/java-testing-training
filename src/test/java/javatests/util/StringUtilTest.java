package javatests.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    @Test
    public void should_repeat_string_once() {
        assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test
    public void should_repeat_string_two_times() {
        assertEquals("HolaHola", StringUtil.repeat("Hola", 2));
    }

    @Test
    public void should_repeat_string_zero_times() {
        assertEquals("", StringUtil.repeat("Hola", 0));
    }

    @Test
    public void should_repeat_string_negative_times() {
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("Hola", -1);
        });

        assertEquals("A negative number of times is not allowed", exception.getMessage());
    }

    @Test
    public void should_validate_that_string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("sanders"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "\t", "\n", "\r"})
    public void should_validate_that_string_is_empty(String str) {
        assertTrue(StringUtil.isEmpty(str));
    }
}
