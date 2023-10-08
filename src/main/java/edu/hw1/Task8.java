package edu.hw1;

public class Task8 {
    private Task8() {

    }

    @SuppressWarnings("Magic Number")
    public static boolean knightBoardCapture(int[][] board) {
        int[][] moves = {{-2, -1}, {-2, 1}, {2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int[] move : moves) {
                        int x = i + move[0];
                        int y = j + move[1];
                        if (x >= 0 && y >= 0 && x < board.length && y < board.length && board[x][y] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
