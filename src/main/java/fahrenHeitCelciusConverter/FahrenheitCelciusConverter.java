package fahrenHeitCelciusConverter;

public class FahrenheitCelciusConverter {
    public String convertToFahrenheit(int i) {
        int number = (i-32)*5/9;
        return Integer.toString(number);
    }
}
