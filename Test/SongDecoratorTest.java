import org.junit.Test;

import static org.junit.Assert.*;

public class SongDecoratorTest {

    @Test
    public void getDescription() {
        Words word = new SimpleWords();
        word = new SongDecorator(word);
        String result = word.getDescription();
        assertEquals("Words, Song", result);
    }

    @Test
    public void getRoads() throws MyException {
        Words word = new SimpleWords();
        word = new SongDecorator(word);
        int result = word.getRoads();
        assertEquals(6, result);
    }
}