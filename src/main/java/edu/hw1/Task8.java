package edu.hw1;

public class Task8 {
    private Task8() {

    }

    private static final int[][] MOVES = {{-2, -1}, {-2, 1}, {2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};

    public static boolean knightBoardCapture(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int[] move : MOVES) {
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
