import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    /**
     * Decodes a Morse code string into human-readable text.
     * 
     * @param morseCode The Morse code string to decode.
     * @return The decoded human-readable string.
     */
    public static String decode(String morseCode) {
        // TODO: Implement the decoding logic
        return "";
    }

    /**
     * Predefined Morse code map
     */
    private static final Map<String, String> MORSE_CODE_MAP = new HashMap<>();

    static {
        MORSE_CODE_MAP.put(".-", "A");
        MORSE_CODE_MAP.put("-...", "B");
        MORSE_CODE_MAP.put("-.-.", "C");
        MORSE_CODE_MAP.put("-..", "D");
        MORSE_CODE_MAP.put(".", "E");
        MORSE_CODE_MAP.put("..-.", "F");
        MORSE_CODE_MAP.put("--.", "G");
        MORSE_CODE_MAP.put("....", "H");
        MORSE_CODE_MAP.put("..", "I");
        MORSE_CODE_MAP.put(".---", "J");
        MORSE_CODE_MAP.put("-.-", "K");
        MORSE_CODE_MAP.put(".-..", "L");
        MORSE_CODE_MAP.put("--", "M");
        MORSE_CODE_MAP.put("-.", "N");
        MORSE_CODE_MAP.put("---", "O");
        MORSE_CODE_MAP.put(".--.", "P");
        MORSE_CODE_MAP.put("--.-", "Q");
        MORSE_CODE_MAP.put(".-.", "R");
        MORSE_CODE_MAP.put("...", "S");
        MORSE_CODE_MAP.put("-", "T");
        MORSE_CODE_MAP.put("..-", "U");
        MORSE_CODE_MAP.put("...-", "V");
        MORSE_CODE_MAP.put(".--", "W");
        MORSE_CODE_MAP.put("-..-", "X");
        MORSE_CODE_MAP.put("-.--", "Y");
        MORSE_CODE_MAP.put("--..", "Z");
        MORSE_CODE_MAP.put("-----", "0");
        MORSE_CODE_MAP.put(".----", "1");
        MORSE_CODE_MAP.put("..---", "2");
        MORSE_CODE_MAP.put("...--", "3");
        MORSE_CODE_MAP.put("....-", "4");
        MORSE_CODE_MAP.put(".....", "5");
        MORSE_CODE_MAP.put("-....", "6");
        MORSE_CODE_MAP.put("--...", "7");
        MORSE_CODE_MAP.put("---..", "8");
        MORSE_CODE_MAP.put("----.", "9");
        MORSE_CODE_MAP.put(".-.-.-", ".");
        MORSE_CODE_MAP.put("--..--", ",");
        MORSE_CODE_MAP.put("-.-.--", "!");
        MORSE_CODE_MAP.put("...---...", "SOS"); // Distress signal
    }

    /**
     * Retrieves the corresponding character for a given Morse code sequence.
     */
    public static String get(String morseCode) {
        return MORSE_CODE_MAP.getOrDefault(morseCode, "");
    }

    public static void main(String[] args) {
        // Test cases (Remove after implementing decode)
        System.out.println(MorseCodeDecoder.get("...---..."));
    }
}