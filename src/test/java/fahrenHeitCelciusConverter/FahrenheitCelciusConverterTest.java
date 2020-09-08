package fahrenHeitCelciusConverter;

import org.junit.jupiter.api.Test;
import romanNumeralConverter.RomanNumeralConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FahrenheitCelciusConverterTest {

    @Test
    private void mustBeAbleToCreateConverter(){
        //Arrange

        //Act
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();

        //Assert
        assertNotNull(fahrenheitConverter);
    }

    @Test
    private void convertFahrenHeitToCelcius()
    {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "1°F";

        //Act
        String actualResult =  fahrenheitConverter.convertToFahrenheit(1);

        //Assert
        assertEquals(expectedResult, actualResult);
    }


}
