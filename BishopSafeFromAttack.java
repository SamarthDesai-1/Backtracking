public class BishopSafeFromAttack {

    public static void main(String[] args) {
        int n = 4;
        char[][] chess = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '.';
            }
        }
        nBishops(chess, 0, 0);
    }

    private static void nBishops(char[][] chess, int row, int col) {
        int n = chess.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(chess[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if (isSafe(chess, row, col)) {
            chess[row][col] = 'B';
            if (col != n - 1)
                nBishops(chess, row, col + 1);
            else
                nBishops(chess, row + 1, 0);

            chess[row][col] = '.';
        }
        if (col != n - 1)
            nBishops(chess, row, col + 1);
        else
            nBishops(chess, row + 1, 0);
    }

    private static boolean isSafe(char[][] chess, int row, int col) {
        int n = chess.length;

        /* North east */
        int i = row;
        int j = col;
        while (i >= 0 && j < n) {
            if (chess[i][j] == 'B')
                return false;
            i--;
            j++;
        }

        /* South east */
        i = row;
        j = col;
        while (i < n && j < n) {
            if (chess[i][j] == 'B')
                return false;
            i++;
            j++;
        }

        /* South west */
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (chess[i][j] == 'B')
                return false;
            i++;
            j--;
        }

        /* North west */
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (chess[i][j] == 'B')
                return false;
            i--;
            j--;
        }
        return true;
    }
}
