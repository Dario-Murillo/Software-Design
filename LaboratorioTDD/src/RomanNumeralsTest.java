/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsTest {
    @Test 
    public void Number1ConvertedToI() {
        var result = RomanNumerals.convert(1);
        assertEquals("I", result);
    }
    @Test
    public void Number2ConvertedToII() {
        var result = RomanNumerals.convert(2);
        assertEquals("II", result);
    }
    @Test
    public void Number3ConvertedToIII() {
        var result = RomanNumerals.convert(3);
        assertEquals("III", result);
    }
    @Test
    public void Number4ConvertedToIV() {
        var result = RomanNumerals.convert(4);
        assertEquals("IV", result);
    }
    @Test
    public void Number5ConvertedToV() {
        var result = RomanNumerals.convert(5);
        assertEquals("V", result);
    }
    @Test
    public void Number6ConvertedToVI() {
        var result = RomanNumerals.convert(6);
        assertEquals("VI", result);
    }
    @Test
    public void Number7ConvertedToVII() {
        var result = RomanNumerals.convert(7);
        assertEquals("VII", result);
    }
    @Test
    public void Number8ConvertedToVIII() {
        var result = RomanNumerals.convert(8);
        assertEquals("VIII", result);
    }
    @Test
    public void Number9ConvertedToIX() {
        var result = RomanNumerals.convert(9);
        assertEquals("IX", result);
    }
    @Test
    public void Number10ConvertedToX() {
        var result = RomanNumerals.convert(10);
        assertEquals("X", result);
    }

    @Test
    public void Number15ConvertedToXV() {
        var result = RomanNumerals.convert(15);
        assertEquals("XV", result);
    }

    @Test
    public void Number80ConvertedToLXXX() {
        var result = RomanNumerals.convert(80);
        assertEquals("LXXX", result);
    }

    @Test
    public void Number2019ConvertedToRoman() {
        var result = RomanNumerals.convert(2019);
        assertEquals("MMXIX", result);
    }
    @Test
    public void Number29ConvertedToRoman() {
        var result = RomanNumerals.convert(29);
        assertEquals("XXIX", result);
    }

    @Test
    public void Number294ConvertedToRoman() {
        var result = RomanNumerals.convert(294);
        assertEquals("CCXCIV", result);
    }


    @Test
    public void Number2094ConvertedToRoman() {
        var result = RomanNumerals.convert(2024);
        assertEquals("MMXXIV", result);
    }

    @Test
    public void Number560ConvertedToRoman() {
        var result = RomanNumerals.convert(560);
        assertEquals("DLX", result);
    }

    @Test
    public void Number3999ConvertedToRoman() {
        var result = RomanNumerals.convert(3999);
        assertEquals("MMMCMXCIX", result);
    }
}

