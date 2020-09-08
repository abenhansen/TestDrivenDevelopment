import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RomanNumeralConverterTest {

    @Test
   public void createConverter(){
        //Assign
       RomanNumeralConverter romanConverter = new RomanNumeralConverter();

       //Act

        //Assert
        assertNotNull(romanConverter);
    }

}
