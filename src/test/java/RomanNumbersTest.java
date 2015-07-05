import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTest {

    @Test
    public void givenZeroWhenArabicToRomanCalledShouldReturnEmptyString() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(0);

        assertEquals("", translation);
    }

    @Test
    public void givenDirectTranslationNumbersWhenArabicToRomanCalledShouldReturnCorrectRomanNumbers() {
        RomanNumbers romanNumbers = new RomanNumbers();

        assertEquals("I", romanNumbers.arabicToRoman(1));
        assertEquals("V", romanNumbers.arabicToRoman(5));
        assertEquals("X", romanNumbers.arabicToRoman(10));
        assertEquals("L", romanNumbers.arabicToRoman(50));
        assertEquals("C", romanNumbers.arabicToRoman(100));
        assertEquals("D", romanNumbers.arabicToRoman(500));
        assertEquals("M", romanNumbers.arabicToRoman(1000));
    }
}
