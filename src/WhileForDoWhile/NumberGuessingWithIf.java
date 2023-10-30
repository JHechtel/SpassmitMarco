package WhileForDoWhile;

import java.util.Scanner;

public class NumberGuessingWithIf {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 10);
        int numberGuessed;
        do {

            System.out.println("Zahl raten");
            numberGuessed = new Scanner(System.in).nextInt();
            if(numberGuessed<numberToGuess){
                System.out.println("Die gesuchte Zahl ist größer");
            }
            if (numberGuessed>numberToGuess){
                System.out.println("Die gesuchte Zahl ist kleiner");
            }
        }

        while (numberToGuess != numberGuessed);
        System.out.println("Zahl erraten");
    }
}
