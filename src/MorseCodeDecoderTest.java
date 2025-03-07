import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MorseCodeDecoderTest {
    @Test
    public void testBasicMorseDecoding() {
        assertEquals(MorseCodeDecoder.decode(".-"), "A");
        assertEquals(MorseCodeDecoder.decode("."), ("E"));
        assertEquals(MorseCodeDecoder.decode(".."), ("I"));
        assertEquals(MorseCodeDecoder.decode(". ."), ("EE"));
        assertEquals(MorseCodeDecoder.decode(". ."), ("E E"));
        assertEquals(MorseCodeDecoder.decode("...---..."), ("SOS"));
        assertEquals(MorseCodeDecoder.decode("... --- ..."), ("SOS"));
        assertEquals(MorseCodeDecoder.decode("...   ---   ..."), ("S O S"));
    }

    @Test
    public void testMoreComplexTests() {
        assertEquals(MorseCodeDecoder.decode(" . "), ("E"));
        assertEquals(MorseCodeDecoder.decode(" . . "), ("E E"));
        assertEquals(MorseCodeDecoder.decode(
                " ...---... -.-.-- - .... . --.- ..- .. -.-. -.- -... .-. --- .-- -. ..-. --- -..- .--- ..- -- .--. ... --- ...- . .-. - .... . .-.. .- --.. -.-- -.. --- --. .-.-.- "),
                ("SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
    }
}