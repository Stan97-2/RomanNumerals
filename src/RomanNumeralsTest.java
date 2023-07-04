import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    // Tests for intToRoman() method

    // Basic tests
    @Test
    public void shouldReturnI() {
        assertEquals("I", romanNumerals.intToRoman(1));
    }

    @Test
    public void shouldReturnV() {
        assertEquals("V", romanNumerals.intToRoman(5));
    }

    @Test
    public void shouldReturnX() {
        assertEquals("X", romanNumerals.intToRoman(10));
    }

    @Test
    public void shouldReturnL() {
        assertEquals("L", romanNumerals.intToRoman(50));
    }

    @Test
    public void shouldReturnC() {
        assertEquals("C", romanNumerals.intToRoman(100));
    }

    @Test
    public void shouldReturnD() {
        assertEquals("D", romanNumerals.intToRoman(500));
    }

    @Test
    public void shouldReturnM() {
        assertEquals("M", romanNumerals.intToRoman(1000));
    }

    @Test
    public void shouldReturnII() {
        assertEquals("II", romanNumerals.intToRoman(2));
    }

    // Edge cases
    @Test
    public void shouldReturnIV() {
        assertEquals("IV", romanNumerals.intToRoman(4));
    }

    @Test
    public void shouldReturnIX() {
        assertEquals("IX", romanNumerals.intToRoman(9));
    }

    @Test
    public void shouldReturnXL() {
        assertEquals("XL", romanNumerals.intToRoman(40));
    }

    @Test
    public void shouldReturnXC() {
        assertEquals("XC", romanNumerals.intToRoman(90));
    }

    @Test
    public void shouldReturnCD() {
        assertEquals("CD", romanNumerals.intToRoman(400));
    }

    @Test
    public void shouldReturnCM() {
        assertEquals("CM", romanNumerals.intToRoman(900));
    }

    // Complex case

    @Test
    public void shouldReturnMCMXCIV() {
        assertEquals("MCMXCIV", romanNumerals.intToRoman(1994));
    }


    // Tests for romanToInt() method

    // Basic tests
    @Test
    public void shouldReturn1() {
        assertEquals(1, romanNumerals.romanToInt("I"));
    }

    @Test
    public void shouldReturn5() {
        assertEquals(5, romanNumerals.romanToInt("V"));
    }

    @Test
    public void shouldReturn10() {
        assertEquals(10, romanNumerals.romanToInt("X"));
    }

    @Test
    public void shouldReturn50() {
        assertEquals(50, romanNumerals.romanToInt("L"));
    }

    @Test
    public void shouldReturn100() {
        assertEquals(100, romanNumerals.romanToInt("C"));
    }

    @Test
    public void shouldReturn500() {
        assertEquals(500, romanNumerals.romanToInt("D"));
    }

    @Test
    public void shouldReturn1000() {
        assertEquals(1000, romanNumerals.romanToInt("M"));
    }

    @Test
    public void shouldReturn2() {
        assertEquals(2, romanNumerals.romanToInt("II"));
    }

    // Edge cases
    @Test
    public void shouldReturn4() {
        assertEquals(4, romanNumerals.romanToInt("IV"));
    }

    @Test
    public void shouldReturn9() {
        assertEquals(9, romanNumerals.romanToInt("IX"));
    }

    @Test
    public void shouldReturn40() {
        assertEquals(40, romanNumerals.romanToInt("XL"));
    }

    @Test
    public void shouldReturn90() {
        assertEquals(90, romanNumerals.romanToInt("XC"));
    }

    @Test
    public void shouldReturn400() {
        assertEquals(400, romanNumerals.romanToInt("CD"));
    }

    @Test
    public void shouldReturn900() {
        assertEquals(900, romanNumerals.romanToInt("CM"));
    }

    // Complex case
    @Test
    public void shouldReturn1994() {
        assertEquals(1994, romanNumerals.romanToInt("MCMXCIV"));
    }




}

