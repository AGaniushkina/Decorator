public class NoPoemDecorator extends WordsDecorator {
    public NoPoemDecorator(Words words) {
        super(words);
    }

    public String getDescription() {
        return words.getDescription().replaceFirst(", Poem", "");
    }

    public int getRoads() throws MyException {
        if (words.getDescription().indexOf(", Poem") == -1)
        {
            throw new MyException(words.getRoads());
        }
        else
        {
            return words.getRoads() - 1;
        }
    }
}

