package fahrenHeitCelciusConverter;

import java.util.Scanner;


public class FahrenheitCelciusConverter {

    public static void main(String[] args)
    {
        System.out.println("Number has been converted to "  + enterAndConvert());
    }

    public static String enterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to convert to Celcius from Fahrenheit");
        String input = scanner.nextLine();
        return input;
    }

    public static String convertToFahrenheit(double i) {
        double number = (i - 32) * 5 / 9;
        if (number == (int) number)
            return (int) number + "°C";
        else
            return number + "°C";
    }

    public static String enterAndConvert() {
        String input = enterInput();
        return convertToFahrenheit(Double.valueOf(input));
    }
}
