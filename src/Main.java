public class Main {
    public static void main(String[] args) throws MyException {
        Words singingWords = new SimpleWords();
        Words congratulation = new CongratulationWords();
        Words speech = new SpeechWords();
        congratulation  = new SongDecorator(congratulation);
        congratulation = new PoemDecorator(congratulation);
        singingWords = new SongDecorator(singingWords);
        singingWords = new SongDecorator(singingWords);
        singingWords = new NoSongDecorator(singingWords);
        singingWords = new MusicDecorator(singingWords);
        singingWords = new NoMusicDecorator(singingWords);
        singingWords = new PoemDecorator(singingWords);
        singingWords = new NoPoemDecorator(singingWords);
        speech = new PoemDecorator(speech);
        System.out.println(singingWords.getDescription() + ": " + singingWords.getRoads());
        System.out.println(congratulation.getDescription() + ": " + congratulation.getRoads());
        System.out.println(speech.getDescription() + ": " + speech.getRoads());
    }
}

