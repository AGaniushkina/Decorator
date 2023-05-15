public class NoMusicDecorator extends WordsDecorator {
    public NoMusicDecorator(Words words) {
        super(words);
    }

    public String getDescription() {
        return words.getDescription().replaceFirst(", Music", "");
    }

    public int getRoads() throws MyException{
        if (words.getDescription().indexOf(", Music") == -1)
        {
            throw new MyException(words.getRoads());
        }
        else
        {
            return words.getRoads() - 2;
        }
    }
}

