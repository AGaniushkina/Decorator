import org.junit.Test;

import static org.junit.Assert.*;

public class MusicDecoratorTest {

    @Test
    public void getDescription() {
        Words word = new SimpleWords();
        word = new MusicDecorator(word);
        String result = word.getDescription();
        assertEquals("Words, Music", result);
    }

    @Test
    public void getRoads() throws MyException {
        Words word = new SimpleWords();
        word = new MusicDecorator(word);
        int result = word.getRoads();
        assertEquals(3, result);
    }
}