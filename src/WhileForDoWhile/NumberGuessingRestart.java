package WhileForDoWhile;

import java.util.Scanner;

public class NumberGuessingRestart {
    public static void main(String[] args) {


        int numberToGuess;
        int numberGuessed;
        int score=0;
        char restart;

        do{
            numberToGuess= (int) (Math.random() * 10);
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
            System.out.println("Wollen sie noch einmal spielen? (j/n)");
        restart= Character.toLowerCase(new Scanner(System.in).nextLine().charAt(0));
        } while(restart=='j');
    }
}
