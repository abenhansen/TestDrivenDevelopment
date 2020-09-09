package romanNumeralConverter;

public class RomanNumeralConverter {
    public String convert(int number) {
        String romanNumber = "";
        for (int i = 0; i < number; i++) {
            if (i < 4)
                romanNumber += "I";
            if (i == 5)
                romanNumber += "V";
        }
        return romanNumber;
    }
}
