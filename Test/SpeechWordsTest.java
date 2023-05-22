import org.junit.Test;

import static org.junit.Assert.*;

public class SpeechWordsTest {

    @Test
    public void getDescription() {
        Words word = new SpeechWords();
        String result = word.getDescription();
        assertEquals("Speech", result);
    }

    @Test
    public void getRoads() throws MyException {
        Words word = new SpeechWords();
        int result = word.getRoads();
        assertEquals(2, result);
    }
}