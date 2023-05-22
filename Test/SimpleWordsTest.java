import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleWordsTest {

    @Test
    public void getDescription() {
        Words word = new SimpleWords();
        String result = word.getDescription();
        assertEquals("Words", result);
    }


    @Test
    public void getRoads() throws MyException {
        Words word = new SimpleWords();
        int result = word.getRoads();
        assertEquals(1, result);
    }
}