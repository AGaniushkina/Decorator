import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CongratulationWordsTest {

    @Test
    public void getDescription() {
        Words word = new CongratulationWords();
        String result = word.getDescription();
        assertEquals("Congratulations", result);
    }

    @Test
    public void getRoads() throws MyException {
        Words word = new CongratulationWords();
        int result = word.getRoads();
        assertEquals(3, result);
    }
}

