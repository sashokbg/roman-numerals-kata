package kata;

public class NumeralsService {
    public static int transform(String input) {

        int result = 0;

        if ("".equals(input) || input == null) {
            return 0;
        }

        char previousCharacter = '\0';

        for (char character : input.toCharArray()) {
            if (character == 'I') {
                result++;
            } else if (character == 'V') {
                if (previousCharacter == 'I') {
                    result-=2;
                }
                result+=5;
            } else if (character == 'X') {
                if (previousCharacter == 'I') {
                    result-=2;
                }
                result+=10;
            }  else if (character == 'L') {
                result+=50;
                if (previousCharacter == 'X') {
                    result-=20;
                }
            }
            else {
                throw new NumberFormatException("Badly formatted roman numeral");
            }
            previousCharacter = character;
        }

        return result;
    }
}
