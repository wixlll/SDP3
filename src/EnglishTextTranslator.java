import java.util.HashMap;

public class EnglishTextTranslator {
    private static final HashMap<String, String> englishToMorse = new HashMap<>();

    static {
        englishToMorse.put("A", ".-");
        englishToMorse.put("B", "-...");
        englishToMorse.put("C", "-.-.");
        englishToMorse.put("D", "-..");
        englishToMorse.put("E", ".");
        englishToMorse.put("F", "..-.");
        englishToMorse.put("G", "--.");
        englishToMorse.put("H", "....");
        englishToMorse.put("I", "..");
        englishToMorse.put("J", ".---");
        englishToMorse.put("K", "-.-");
        englishToMorse.put("L", ".-..");
        englishToMorse.put("M", "--");
        englishToMorse.put("N", "-.");
        englishToMorse.put("O", "---");
        englishToMorse.put("P", ".--.");
        englishToMorse.put("Q", "--.-");
        englishToMorse.put("R", ".-.");
        englishToMorse.put("S", "...");
        englishToMorse.put("T", "-");
        englishToMorse.put("U", "..-");
        englishToMorse.put("V", "...-");
        englishToMorse.put("W", ".--");
        englishToMorse.put("X", "-..-");
        englishToMorse.put("Y", "-.--");
        englishToMorse.put("Z", "--..");
        englishToMorse.put(" ", " ");
    }

    public static String englishToMorseTranslation(String text) {
        text = text.toUpperCase();
        StringBuilder morseCode = new StringBuilder();
        for (char character : text.toCharArray()) {
            String letter = englishToMorse.get(String.valueOf(character));
            if (letter != null) {
                morseCode.append(letter).append(" ");
            }
        }
        return morseCode.toString().trim();
    }
}
