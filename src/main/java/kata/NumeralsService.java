package kata;

import static kata.RomanDigit.I;

public class NumeralsService {
    public static int transform(String input) {

        int result = 0;

        if ("".equals(input) || input == null) {
            return 0;
        }

        char previousCharacter = '\0';

        for (char character : input.toCharArray()) {
            RomanDigit digit = RomanDigit.valueOf(String.valueOf(character));

            switch (digit) {
                case I:
                    result++;
                    break;
                case V:
                    if (previousCharacter == 'I') {
                        result-=2;
                    }
                    result+=5;
                    break;
                case X:
                    if (previousCharacter == 'I') {
                        result-=2;
                    } else if (previousCharacter == 'V') {
                        throw new NumberFormatException("Badly formatted roman numeral");
                    }
                    result+=10;
                    break;
                case L:
                    result+=50;
                    if (previousCharacter == 'X') {
                        result-=20;
                    };
                    break;
            }

            previousCharacter = character;
        }

        return result;
    }
}
