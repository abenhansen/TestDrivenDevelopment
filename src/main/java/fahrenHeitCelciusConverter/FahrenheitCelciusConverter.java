package fahrenHeitCelciusConverter;

import java.util.Scanner;


public class FahrenheitCelciusConverter {

    public static void main(String[] args)
    {
        System.out.println("Number has been converted to "  + enterAndConvertToCelcius());
    }

    public static String enterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to convert to Celcius from Fahrenheit");
        String input = scanner.nextLine();
        return input;
    }

    public static String convertToCelcius(double i) {
        double number = (i - 32) * 5 / 9;
        return removeTrailingZeros(number, true);
    }

    public static String convertToFahrenheit(double i) {
        double number = i * 9/5 + 32;
        return removeTrailingZeros(number, false);
    }

    public static String enterAndConvertToCelcius() {
        String input = enterInput();
        return convertToCelcius(Double.valueOf(input));
    }

    public static String removeTrailingZeros(double number, boolean isCelcius) {
        String symbol = isCelcius ? "°C" : "°F";
        if (number == (int) number)
            return (int) number + symbol;
        else
            return number + symbol;
    }
}
