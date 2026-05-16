package com.example.chess;

public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }

    public boolean isValidMove(int[] from, int[] to, Piece[][] board) {
        return from[0] == to[0] || from[1] == to[1];
    }

    public String toString() {
        return white ? "R" : "r";
    }
}
