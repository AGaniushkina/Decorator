import org.junit.Test;

import static org.junit.Assert.*;

public class NoPoemDecoratorTest {

    @Test
    public void getDescription() {
        Words word = new SimpleWords();
        word = new PoemDecorator(word);
        word = new NoPoemDecorator(word);
        String result = word.getDescription();
        assertEquals("Words", result);
    }
    @Test
    public void getRoads() throws MyException {
        Words word = new SimpleWords();
        word = new PoemDecorator(word);
        word = new NoPoemDecorator(word);
        int result = word.getRoads();
        assertEquals(1, result);
    }
}