package fahrenHeitCelciusConverter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import romanNumeralConverter.RomanNumeralConverter;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FahrenheitCelciusConverterTest {

    @Test
    public void mustBeAbleToCreateConverter() {
        //Arrange

        //Act
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();

        //Assert
        assertNotNull(fahrenheitConverter);
    }

    @Test
    public void convertOneFahrenheitToCelcius()
    {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "-17.22222222222222°C";

        //Act
        String actualResult =  fahrenheitConverter.convertToFahrenheit(1);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void removeTralingZerosFromConversion() {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "10°C";

        //Act

        String actualResult = fahrenheitConverter.convertToFahrenheit(50);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToEnterInput()
    {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "testInput";


        //Act
        ByteArrayInputStream in = new ByteArrayInputStream("testInput".getBytes());
        System.setIn(in);
        String actualResult = fahrenheitConverter.enterInput();

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToEnterInputAndConvert()
    {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "21.11111111111111°C";

        //Act
        ByteArrayInputStream in = new ByteArrayInputStream("70".getBytes());
        System.setIn(in);
        String actualResult = fahrenheitConverter.enterAndConvert();

        //Assert
        assertEquals(expectedResult, actualResult);
    }


}
