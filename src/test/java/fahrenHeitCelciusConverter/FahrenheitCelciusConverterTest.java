package fahrenHeitCelciusConverter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;

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
    public void mustBeAbleToConvertOneFahrenheitToCelcius()
    {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "-17.22222222222222°C";

        //Act
        String actualResult =  fahrenheitConverter.convertToCelcius(1);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void removeTralingZerosFromConversion() {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "50°C";
        //Act

        String actualResult = fahrenheitConverter.removeTrailingZeros(50.0000, true);

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
        String actualResult = fahrenheitConverter.enterAndConvertToCelcius();

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToConvertCelciusToFahrenheit()
    {
        //Arrange
        FahrenheitCelciusConverter fahrenheitConverter = new FahrenheitCelciusConverter();
        String expectedResult = "64.4°F";

        //Act
        String actualResult =  fahrenheitConverter.convertToFahrenheit(18);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

}
