package romanNumeralConverter;

public class RomanNumeralConverter {
    public String convert(int number) {
        String romanNumber = "";
        if (number < 3999) {
            for (int i = number; i > 0; i--) {

                if (i > 999 && i < 4000) {
                    romanNumber += "M";
                    i = i - 999;
                    continue;
                }

                if (i > 899 && i < 1000) {
                    romanNumber += "CM";
                    i = i - 899;
                    continue;
                }

                if (i > 499 && i < 900) {
                    romanNumber += "D";
                    i = i - 499;
                    continue;
                }

                if (i > 399 && i < 500) {
                    romanNumber += "CD";
                    i = i - 399;
                    continue;
                }

                if (i > 99 && i < 400) {
                    romanNumber += "C";
                    i = i - 99;
                    continue;
                }

                if (i > 89 && i < 100) {
                    romanNumber += "XC";
                    i = i - 89;
                    continue;
                }

                if (i > 49 && i < 90) {
                    romanNumber += "L";
                    i = i - 49;
                    continue;
                }

                if (i > 39 && i < 50) {
                    romanNumber += "XL";
                    i = i - 39;
                    continue;
                }

                if (i > 9 && i < 40) {
                    romanNumber += "X";
                    i = i - 9;
                    continue;
                }
                if (i == 9) {
                    romanNumber += "IX";
                    i = i - 8;
                    continue;
                }
                if (i > 4 && i < 9) {
                    romanNumber += "V";
                    i = i - 4;
                    continue;
                }
                if (i == 4) {
                    romanNumber += "IV";
                    i = i - 3;
                    continue;
                }
                if (i < 4) {
                    romanNumber += "I";
                    continue;
                }
            }
        }
        return romanNumber;
    }
}
