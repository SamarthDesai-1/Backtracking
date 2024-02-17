package BACKTRACKING;

public class CountWaysFromSourceToDestination {

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int countWays = maze(1, 1, row, col);
        System.out.println("Ways : " + countWays);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;
        int downWays = maze(sr + 1, sc, er, ec);
        int rightWays = maze(sr, sc + 1, er, ec);
        int total = downWays + rightWays;
        return total;
    }
}
