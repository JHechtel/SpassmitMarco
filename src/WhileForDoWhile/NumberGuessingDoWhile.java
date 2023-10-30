package WhileForDoWhile;

import java.util.Scanner;

public class NumberGuessingDoWhile {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 10);
        int numberGuessed;
        do {
            System.out.println("Zahl raten");
            numberGuessed = new Scanner(System.in).nextInt();
        }

        while (numberToGuess != numberGuessed);
        System.out.println("Zahl erraten");
    }
}
