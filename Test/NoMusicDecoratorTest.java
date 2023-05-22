import org.junit.Test;

import static org.junit.Assert.*;

public class NoMusicDecoratorTest {

    @Test
    public void getDescription() {
        Words word = new SimpleWords();
        word = new MusicDecorator(word);
        word = new NoMusicDecorator(word);
        String result = word.getDescription();
        assertEquals("Words", result);
    }

    @Test
    public void getRoads() throws MyException {
        Words word = new SimpleWords();
        word = new MusicDecorator(word);
        word = new NoMusicDecorator(word);
        int result = word.getRoads();
        assertEquals(1, result);
    }
}