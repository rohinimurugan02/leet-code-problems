public class colorofchessboard {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        char row = coordinates.charAt(1);
        return (col + row) % 2 != 0;
    }
}
