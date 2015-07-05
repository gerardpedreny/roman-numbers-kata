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
    public void givenOneWhenArabicToRomanCalledShouldReturnI() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(1);

        assertEquals("I", translation);
    }

    @Test
    public void givenFiveWhenArabicToRomanCalledShouldReturnV() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(5);

        assertEquals("V", translation);
    }

    @Test
    public void givenTenWhenArabicToRomanCalledShouldReturnX() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(10);

        assertEquals("X", translation);
    }

    @Test
    public void givenFiftyWhenArabicToRomanCalledShouldReturnL() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(50);

        assertEquals("L", translation);
    }

    @Test
    public void givenAHundredWhenArabicToRomanCalledShouldReturnC() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(100);

        assertEquals("C", translation);
    }

    @Test
    public void givenFiveHundredWhenArabicToRomanCalledShouldReturnD() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(500);

        assertEquals("D", translation);
    }

    @Test
    public void givenAThousandWhenArabicToRomanCalledShouldReturnM() {
        RomanNumbers romanNumbers = new RomanNumbers();

        String translation = romanNumbers.arabicToRoman(1000);

        assertEquals("M", translation);
    }
}
