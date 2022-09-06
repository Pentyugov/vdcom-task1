package com.apentyugov;

import org.junit.jupiter.api.Test;
import static com.apentyugov.App.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMethodOne() {

        assertAll(
                () -> assertEquals("FooBar", methodOne(270)),
                () -> assertEquals("Foo", methodOne(33)),
                () -> assertEquals("Bar", methodOne(400)),
                () -> assertEquals(String.valueOf(113), methodOne(113))
        );
    }

    @Test
    public void testMethodTwo() {

        assertAll(
                () -> assertEquals("FooBar", methodTwo(9870)),
                () -> assertEquals("Foo", methodTwo(797679)),
                () -> assertEquals("Bar", methodTwo(28475)),
                () -> assertEquals(String.valueOf(111257), methodTwo(111257))
        );
    }

    @Test
    public void testMethodThree() {

        assertAll(
                () -> assertEquals("FooBar", methodThree(12000)),
                () -> assertEquals("Foo", methodThree(125949)),
                () -> assertEquals("Bar", methodThree(3261995)),
                () -> assertEquals(String.valueOf(8569132562L), methodThree(8569132562L))
        );
    }

    @Test
    public void shouldThrowsNumberFormatException() {
        NumberFormatException numberFormatException = assertThrows(NumberFormatException.class,
                () -> checkNumber("FooBar"), "NumberFormatException was expected");
        assertEquals("Number must be Integer", numberFormatException.getMessage());
    }

    @Test
    public void shouldIllegalArgumentException() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> checkNumber("-659"), "IllegalArgumentException was expected");
        assertEquals("Number must be greater than 0", illegalArgumentException.getMessage());
    }

}
