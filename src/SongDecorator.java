public class SongDecorator extends WordsDecorator {
    public SongDecorator(Words words) {
        super(words);
    }

    public String getDescription() {
        return words.getDescription() + ", Song";
    }

    public int getRoads() throws MyException {
        return words.getRoads() + 5;
    }
}