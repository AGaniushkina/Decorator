public class MyException extends Exception {
    private int roads;

    public MyException(int roads) {
        this.roads = roads;
    }

    public int GetRoads(){
        return roads;
    }
}
