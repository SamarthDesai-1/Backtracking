package BACKTRACKING;

public class RatInMazeThreeDeadBlocksFourDirection {

    public static void main(String[] args) {
        int row = 3, col = 4;

        /* using extra spaze O(n * n) */
        boolean[][] isVisited = new boolean[row][col];

        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 1 }
        };
        printPath(0, 0, row - 1, col - 1, "", maze, isVisited);
    }

    private static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] isVisited) {
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
        if (isVisited[sr][sc] == true)
            return;

        isVisited[sr][sc] = true;
        /* go right */ printPath(sr, sc + 1, er, ec, s + "R", maze, isVisited);
        /* go down */ printPath(sr + 1, sc, er, ec, s + "D", maze, isVisited);
        /* go left */ printPath(sr, sc - 1, er, ec, s + "L", maze, isVisited);
        /* go up */ printPath(sr - 1, sc, er, ec, s + "U", maze, isVisited);
        isVisited[sr][sc] = false;
    }
}
