package kata;

public class NumeralsService {
    public static int transform(String input) {

        int result = 0;

        if ("".equals(input) || input == null) {
            return 0;
        }

        for (char character : input.toCharArray()) {
            if (character == 'I') {
                result++;
            } else {
                throw new NumberFormatException("Badly formatted roman numeral");
            }
        }

        return result;
    }
}
