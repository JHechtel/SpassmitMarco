package Uebung0106;

public class Fraction3Main {
    public static void main(String[] args) {
        Fraction3 myFraction1= new Fraction3();
        myFraction1.numerator=1;
        myFraction1.denominator=5;

        Fraction3 myFraction2= new Fraction3();
        myFraction2.numerator=4;
        myFraction2.denominator=5;

        double zahl= myFraction1.toDouble();
        double zahl2= myFraction2.toDouble();
        System.out.println("Bruch 1 als Zahl: " +zahl);
        System.out.println("Bruch 2 als Zahl: " +zahl2);
        myFraction1.add(myFraction2);
        System.out.println("Ergebnis Addition: "+myFraction1.numerator + "/"+ myFraction1.denominator);
        myFraction1.sub(myFraction2);
        System.out.println("Ergebnis Subtraktion: "+myFraction1.numerator + "/"+ myFraction1.denominator);
        myFraction1.mul(myFraction2);
        System.out.println("Ergebnis Multiplikation: "+myFraction1.numerator + "/"+ myFraction1.denominator);
        myFraction1.div(myFraction2);
        System.out.println("Ergebnis Division: "+myFraction1.numerator + "/"+ myFraction1.denominator);
       myFraction1.reduce();
        System.out.println("Ergebnis Kürzung: "+myFraction1.numerator + "/"+ myFraction1.denominator);
    }

}
