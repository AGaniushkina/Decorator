public class NoSongDecorator extends WordsDecorator {
    public NoSongDecorator(Words words) {
        super(words);
    }

    public String getDescription() {
        return words.getDescription().replaceFirst(", Song", "");
    }

    public int getRoads() throws MyException{
        if (words.getDescription().indexOf(", Song") == -1)
        {
            throw new MyException(words.getRoads());
        }
        else
        {
            return words.getRoads() - 5;
        }
    }
}
