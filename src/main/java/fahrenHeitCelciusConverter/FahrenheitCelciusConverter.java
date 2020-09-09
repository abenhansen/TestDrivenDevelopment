package fahrenHeitCelciusConverter;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class FahrenheitCelciusConverter {

    public static void main(String[] args) {
        System.out.println(enterAndConvertToChosenFormat());
    }


    public static String enterInput(Scanner scanner) {
        String input = "";
        System.out.println("Enter a number to convert to Celcius from Fahrenheit");
        while (true) {
            try {
                int numberInput = scanner.nextInt();
                input = Integer.toString(numberInput);
                break;
            } catch (NoSuchElementException e) {
                System.out.println("Invalid input, you must enter a number");
                scanner.next();
            }
        }
        return input;
    }

    public static String convertToCelcius(double i) {
        double number = (i - 32) * 5 / 9;
        return removeTrailingZeros(number, true);
    }

    public static String convertToFahrenheit(double i) {
        double number = i * 9 / 5 + 32;
        return removeTrailingZeros(number, false);
    }

    public static String enterAndConvertToChosenFormat() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean finished = true;
        while (finished) {
            System.out.println("Enter 1 to convert to celcius, press 2 to convert to fahrenheit");
            switch (scanner.next()) {
                case "1":
                    finished = false;
                    scanner.nextLine();
                    input = enterInput(scanner);
                    return convertToCelcius(Double.valueOf(input));
                case "2":
                    finished = false;
                    scanner.nextLine();
                    input = enterInput(scanner);
                    return convertToFahrenheit(Double.valueOf(input));
            }
        }
        return "";
    }

    public static String removeTrailingZeros(double number, boolean isCelcius) {
        String symbol = isCelcius ? "°C" : "°F";
        if (number == (int) number)
            return (int) number + symbol;
        else
            return number + symbol;
    }
}
