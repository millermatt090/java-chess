package com.example.chess;

public abstract class Piece {
    protected boolean white;

    public Piece(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract boolean isValidMove(int[] from, int[] to, Piece[][] board);
}
