import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns
     * for supported characters.
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
         // Pattern for 'O'
        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return charMap;
    }

    /**
     * Displays the banner message using the character map.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        // Loop through each row of the pattern
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append("  ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}