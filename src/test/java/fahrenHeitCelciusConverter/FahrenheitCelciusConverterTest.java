package fahrenHeitCelciusConverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FahrenheitCelciusConverterTest {

    private FahrenheitCelciusConverter fahrenheitConverter;

    @BeforeEach
    public void setup(){
        fahrenheitConverter = new FahrenheitCelciusConverter();
    }

    @Test
    public void mustBeAbleToCreateConverter() {
        //Arrange
        //Act
        //Assert
        assertNotNull(fahrenheitConverter);
    }

    @Test
    public void mustBeAbleToConvertOneFahrenheitToCelcius() {
        //Arrange
        String expectedResult = "-17.22°C";

        //Act
        String actualResult = fahrenheitConverter.convertToCelcius(1);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToRemoveTrailingZeroesFromCelcius() {
        //Arrange
        String expectedResult = "50°C";
        //Act

        String actualResult = fahrenheitConverter.removeTrailingZeros(50.0000, true);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustRoundToTwoDecimals() {
        //Arrange
        String expectedResult = "50.36°C";
        //Act

        String actualResult = fahrenheitConverter.removeTrailingZeros(50.3555555555, true);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToRemoveTrailingZeroesFromFahrenheit() {
        //Arrange
        String expectedResult = "50°F";
        //Act
        String actualResult = fahrenheitConverter.removeTrailingZeros(50.0000, false);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToEnterInput() {
        //Arrange
        String expectedResult = "5";


        //Act
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        String actualResult = fahrenheitConverter.enterInput(scanner);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToEnterInputAndConvert() {
        //Arrange
        String expectedResult = "21.11°C";

        //Act
        ByteArrayInputStream in = new ByteArrayInputStream("70".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        String actualResult = fahrenheitConverter.enterInput(scanner);
        actualResult = fahrenheitConverter.convertToCelcius(Integer.valueOf(actualResult));

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustBeAbleToConvertCelciusToFahrenheit() {
        //Arrange
        String expectedResult = "64.4°F";

        //Act
        String actualResult = fahrenheitConverter.convertToFahrenheit(18);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustOnlyBeAbleToEnterNumberAsInput() {
        //Arrange
        //Act,//Assert
        ByteArrayInputStream in = new ByteArrayInputStream("testInput".getBytes());
        System.setIn(in);
        try {
            Scanner scanner = new Scanner(System.in);
            fahrenheitConverter.enterInput(scanner);
            fail("Should have thrown an exception");
        } catch (NoSuchElementException e) {
        }
    }

    @Test
    public void mustBeAbleChooseCelciusConversion() {
        //Arrange
        String expectedResult = "21.11°C";

        //Act
        String simulatedMultipleUserInputs = "1\n70";
        System.setIn(new ByteArrayInputStream(simulatedMultipleUserInputs.getBytes()));
        String actualExpectedResult =  fahrenheitConverter.enterAndConvertToChosenFormat();
        assertEquals(expectedResult, actualExpectedResult);

    }
    @Test
    public void mustBeAbleChooseFahrenheitConversion() {
        //Arrange
        String expectedResult = "77°F";

        //Act
        String simulatedMultipleUserInputs = "2\n25";
        System.setIn(new ByteArrayInputStream(simulatedMultipleUserInputs.getBytes()));
        String actualResult =  fahrenheitConverter.enterAndConvertToChosenFormat();

        assertEquals(expectedResult, actualResult);

    }

}
