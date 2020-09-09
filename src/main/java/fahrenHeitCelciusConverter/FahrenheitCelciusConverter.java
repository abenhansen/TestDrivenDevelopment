package fahrenHeitCelciusConverter;

import java.util.Scanner;

public class FahrenheitCelciusConverter {

    public String enterInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public String convertToFahrenheit(double i) {
        double number = (i-32)*5/9;
        return number+"°C";
    }
}
