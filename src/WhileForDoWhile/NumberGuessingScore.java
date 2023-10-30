package WhileForDoWhile;

import java.util.Scanner;

public class NumberGuessingScore {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 10);
        int numberGuessed;
        int score=0;
        do {

            System.out.println("Zahl raten");
            score++;
            numberGuessed = new Scanner(System.in).nextInt();
            if(numberGuessed<numberToGuess){
                System.out.println("Die gesuchte Zahl ist größer");
            }
            if (numberGuessed>numberToGuess){
                System.out.println("Die gesuchte Zahl ist kleiner");
            }
            if (score==5){
                break;
            }
        }

        while (numberToGuess != numberGuessed);
        if (numberGuessed==numberToGuess){
        System.out.println("Zahl erraten");}
        else {
            System.out.println("Leider verloren!");
        }
    }
}
