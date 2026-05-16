package com.example.chess;

import java.util.Scanner;

public class Game {
    private Board board;
    private boolean whiteTurn = true;

    public Game() {
        board = new Board();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.printBoard();
            System.out.println((whiteTurn ? "White" : "Black") + " to move (e.g. e2 e4): ");
            String from = scanner.next();
            String to = scanner.next();

            if (board.move(from, to, whiteTurn)) {
                whiteTurn = !whiteTurn;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }
}
