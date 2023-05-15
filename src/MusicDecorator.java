public class MusicDecorator extends WordsDecorator {
    public MusicDecorator(Words words) {
        super(words);
    }

    public String getDescription() {
        return words.getDescription() + ", Music";
    }

    public int getRoads() throws MyException {
        return words.getRoads() + 2;
    }
}

