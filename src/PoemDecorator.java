public class PoemDecorator extends WordsDecorator {
    public PoemDecorator(Words words)
    {
        super(words);
    }
    public String getDescription()
    {
        return words.getDescription() + ", Poem";
    }
    public int getRoads() throws MyException
    {
        return words.getRoads() + 1;
    }
}

