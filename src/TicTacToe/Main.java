package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        while(!ticTacToe.isGameOver()) {
            System.out.println();
            System.out.println(ticTacToe);
            System.out.println("Spieler " + ticTacToe.getCurrentPlayer() + " ist am Zug.");
            boolean success = true;
        do {
            System.out.print("\tZeile: ");
            int line = scanner.nextInt();
            System.out.print("\tSpalte: ");
            int column = scanner.nextInt();
            if (!(success = ticTacToe.set(line, column))) {
                System.out.println("<Ungültige Eingabe, nochmal!>");
            }
        } while(!success);
    }
System.out.println();
System.out.println(ticTacToe);
System.out.println();
if (ticTacToe.getWinner() != ' ') {
        System.out.println("And the winner is: Player " + ticTacToe.getWinner());
    } else {
        System.out.println("Unentschieden!");
    }
}
}
