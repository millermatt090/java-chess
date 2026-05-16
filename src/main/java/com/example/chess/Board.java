package com.example.chess;

public class Board {
    private Piece[][] board = new Piece[8][8];

    public Board() {
        setup();
    }

    private void setup() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(true);
            board[6][i] = new Pawn(false);
        }
        board[0][0] = new Rook(true);
        board[0][7] = new Rook(true);
        board[7][0] = new Rook(false);
        board[7][7] = new Rook(false);
    }

    public boolean move(String from, String to, boolean whiteTurn) {
        int[] f = parse(from);
        int[] t = parse(to);

        Piece p = board[f[0]][f[1]];
        if (p == null || p.isWhite() != whiteTurn) return false;

        if (p.isValidMove(f, t, board)) {
            board[t[0]][t[1]] = p;
            board[f[0]][f[1]] = null;
            return true;
        }
        return false;
    }

    private int[] parse(String pos) {
        return new int[]{8 - (pos.charAt(1) - '0'), pos.charAt(0) - 'a'};
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] == null ? ". " : board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
