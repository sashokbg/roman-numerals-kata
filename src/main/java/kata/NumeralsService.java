package kata;

public class NumeralsService {
    public static int transform(String input) {

        if ("".equals(input) || input == null) {
            return 0;
        }

        if (input.equals("I")) {
            return 1;
        }

        if (input.equals("II")) {
            return 2;
        }

        throw new NumberFormatException("Badly formatted roman numeral");
    }
}
