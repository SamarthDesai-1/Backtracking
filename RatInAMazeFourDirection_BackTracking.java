public class RatInAMazeFourDirection_BackTracking {

    public static void main(String[] args) {
        int row = 3, col = 3;
        boolean[][] isVisited = new boolean[row][col];
        printPath(0, 0, row - 1, col - 1, "", isVisited);
    }

    private static void printPath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if (sr < 0 || sc < 0)
            return;
        if (sr > er || sc > ec)
            return;

        if (isVisited[sr][sc] == true)
            return;
        if (sr == er && sc == ec) { 
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        /* go right */ printPath(sr, sc + 1, er, ec, s + "R", isVisited);
        /* go down */ printPath(sr + 1, sc, er, ec, s + "D", isVisited);
        /* go left */ printPath(sr, sc - 1, er, ec, s + "L", isVisited);
        /* go up */ printPath(sr - 1, sc, er, ec, s + "U", isVisited);

        isVisited[sr][sc] = false;
    }
}
