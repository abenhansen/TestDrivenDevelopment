package romanNumeralConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RomanNumeralConverterTest {

    @Test
   private void mustBeAbleToCreateConverter(){
        //Arrange

       //Act
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();

        //Assert
        assertNotNull(romanConverter);
    }

    private void convertNumberToI(){
        //Arrange
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();
        String expectedResult = "I";

        //Act
        String actualResult = romanConverter.convert(1);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

}
