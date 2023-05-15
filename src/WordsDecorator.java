public abstract class WordsDecorator implements Words {
    protected Words words;
    public WordsDecorator(Words words) {
        this.words = words;
    }
    @Override
    public String getDescription() {
        return "Words";
    }
    @Override
    public int getRoads() throws MyException {
        return 1;
    }
}

