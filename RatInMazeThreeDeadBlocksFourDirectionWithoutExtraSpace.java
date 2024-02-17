package BACKTRACKING;

public class RatInMazeThreeDeadBlocksFourDirectionWithoutExtraSpace {

    public static void main(String[] args) {
        int row = 3, col = 4;
        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 1 }
        };
        printPath(0, 0, row - 1, col - 1, "", maze);
    }

    private static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr < 0 || sc < 0)
            return;
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if (maze[sr][sc] == 0)
            return;
        if (maze[sr][sc] == -1)
            return;

        maze[sr][sc] = -1;
        /* go right */ printPath(sr, sc + 1, er, ec, s + "R", maze);
        /* go down */ printPath(sr + 1, sc, er, ec, s + "D", maze);
        /* go left */ printPath(sr, sc - 1, er, ec, s + "L", maze);
        /* go up */ printPath(sr - 1, sc, er, ec, s + "U", maze);
        maze[sr][sc] = 1;
    }
}
