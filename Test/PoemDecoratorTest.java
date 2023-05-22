import org.junit.Test;

import static org.junit.Assert.*;

public class PoemDecoratorTest {

    @Test
    public void getDescription() {
        Words word = new SimpleWords();
        word = new PoemDecorator(word);
        String result = word.getDescription();
        assertEquals("Words, Poem", result);
    }

    @Test
    public void getRoads() throws MyException {
        Words word = new SimpleWords();
        word = new PoemDecorator(word);
        int result = word.getRoads();
        assertEquals(2, result);
    }

}