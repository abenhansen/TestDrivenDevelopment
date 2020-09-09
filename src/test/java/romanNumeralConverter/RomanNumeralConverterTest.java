package romanNumeralConverter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RomanNumeralConverterTest {

    @Test
    public void mustBeAbleToCreateConverter() {
        //Arrange

        //Act
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();

        //Assert
        assertNotNull(romanConverter);
    }

    @Test
    public void convertOneToI() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "I";

        //Act
        String actualResult = romanConverter.convert(1);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertTwoToII() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "II";

        //Act
        String actualResult = romanConverter.convert(2);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertFourToIV() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "IV";

        //Act
        String actualResult = romanConverter.convert(4);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertSixToVI() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "VI";

        //Act
        String actualResult = romanConverter.convert(6);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertEightToVIII() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "VIII";

        //Act
        String actualResult = romanConverter.convert(8);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertNineTo9() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "IX";

        //Act
        String actualResult = romanConverter.convert(9);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertTenToX() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "X";

        //Act
        String actualResult = romanConverter.convert(10);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertThirteenToXIII() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "XIII";

        //Act
        String actualResult = romanConverter.convert(13);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertNineteenToXIX() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "XIX";

        //Act
        String actualResult = romanConverter.convert(19);

        //Assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void convertFortiesToXL() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "XLII";

        //Act
        String actualResult = romanConverter.convert(42);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertFiftiesToL() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "LXV";

        //Act
        String actualResult = romanConverter.convert(65);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertNineTeesToXC() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "XCIV";

        //Act
        String actualResult = romanConverter.convert(94);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertHundredsToC() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "CCLIX";

        //Act
        String actualResult = romanConverter.convert(259);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertFourHundredsToCD() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "CDXXXIII";

        //Act
        String actualResult = romanConverter.convert(433);

        //Assert
        assertEquals(expectedResult, actualResult);

    }


    @Test
    public void convertFiveHundredsToD() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "DCCCXCII";

        //Act
        String actualResult = romanConverter.convert(892);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertNineHundredsToCM() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "CMXCIX";

        //Act
        String actualResult = romanConverter.convert(999);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void convertThousandsToM() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "MMMCCCLII";

        //Act
        String actualResult = romanConverter.convert(3352);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void EmptyIfAbove3999() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        //Act
        String actualResult = romanConverter.convert(4555);

        //Assert
        assertEquals("", actualResult);
    }

    @Test
    public void MustBeAbleToTakeUserInput() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "DCCXXI";
        //Act
        ByteArrayInputStream in = new ByteArrayInputStream("721".getBytes());
        System.setIn(in);
        String actualResult = romanConverter.convertUserInput();

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userInputMustBeANumber() {
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        //Act
        ByteArrayInputStream in = new ByteArrayInputStream("stringInput".getBytes());
        System.setIn(in);
        try {
            Scanner scanner = new Scanner(System.in);
            romanConverter.convertUserInput();
            fail("Should have thrown an exception");
        } catch (NoSuchElementException e) {
            //Assert
        }
    }


}
