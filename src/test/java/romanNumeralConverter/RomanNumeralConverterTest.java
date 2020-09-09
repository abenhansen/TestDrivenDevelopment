package romanNumeralConverter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RomanNumeralConverterTest {

    @Test
   public void mustBeAbleToCreateConverter(){
        //Arrange

       //Act
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();

        //Assert
        assertNotNull(romanConverter);
    }

    @Test
    public void convertOneToI(){
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

}
