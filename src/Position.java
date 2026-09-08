public class Position {
    long x;
    long y;

    public Position(long x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
