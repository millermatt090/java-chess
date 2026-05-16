package com.example.chess;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    public boolean isValidMove(int[] from, int[] to, Piece[][] board) {
        int dir = white ? 1 : -1;
        return to[0] == from[0] + dir && from[1] == to[1];
    }

    public String toString() {
        return white ? "P" : "p";
    }
}
