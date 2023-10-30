package WhileForDoWhile;

import java.util.Scanner;

public class NumberGuessingWhile {
    public static void main(String[] args) {
        int numberToGuess= (int) Math.random()*10;
        System.out.println("Zahl raten");
        int numberGuessed=new Scanner(System.in).nextInt();
        while (numberToGuess!=numberGuessed){
            System.out.println("Zahl raten");
            numberGuessed=new Scanner(System.in).nextInt();
        }
        System.out.println("Zahl erraten");
    }
}
