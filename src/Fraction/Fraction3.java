package Fraction;

public class Fraction3 {

    int numerator;
    int denominator;
    void add(Fraction3 op) {
        numerator = (numerator * op.denominator) +
        (op.numerator * denominator);
        denominator = denominator * op.denominator;
    }

    double toDouble() {
        return numerator / (double) denominator;
    }

    void sub(Fraction3 op){
        numerator = (numerator * op.denominator) - (op.numerator * denominator);
        denominator = denominator * op.denominator;
    }

    void mul (Fraction3 op){
        numerator=numerator*op.numerator;
        denominator=denominator*op.denominator;
    }
    void div(Fraction3 op){
        numerator=numerator*op.denominator;
        denominator=denominator*op.numerator;
    }
}