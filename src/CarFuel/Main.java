package CarFuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bitte Verbrauch pro 100km angeben:");
        double fuel= new Scanner(System.in).nextDouble();
        System.out.println("Bitte Ölverbrauch pro 1000km angeben:");
        double oil= new Scanner(System.in).nextDouble();
        Car car = new Car(fuel, oil);
        System.out.println("Bitte zu fahrende Strecke eingeben");
        double distance=new Scanner(System.in).nextDouble();
        System.out.println("Bitte Benzinpreis eingeben");
        double price=new Scanner(System.in).nextDouble();

        car.cost(distance,price);
    }

}
