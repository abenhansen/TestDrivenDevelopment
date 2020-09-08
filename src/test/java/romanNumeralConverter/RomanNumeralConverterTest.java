package romanNumeralConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RomanNumeralConverterTest {

    @Test
   public void mustBeAbleToCreateConverter(){
        //Arrange

       //Act
        RomanNumeralConverter romanConverter = new RomanNumeralConverter();

        //Assert
        assertNotNull(romanConverter);
    }

}
