package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleTests {

    @Test
    void multiplicationTest() {
        int a = 3;
        int b = 1;

        assertEquals(a * b, 3);
    }

    @Tag("simple_for_jenkins")
    @Test
    void parametrizedSimpleTest () {
        String expected = "apple";
        String b = System.getProperty("item");

        assertEquals(expected, b);
    }
}