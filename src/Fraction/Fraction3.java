package Fraction;

class Fraction3 {

    int numerator;
    int denominator;
    void add(Fraction3 op) {
        numerator = (numerator * op.denominator) + (op.numerator * denominator);
        denominator = denominator * op.denominator;
    }
    void sub(Fraction3 op) {
        Fraction3 frac = new Fraction3();
        frac.numerator= -op.numerator;
        frac.denominator= op.denominator;
           add(frac);
    }
    void mul(Fraction3 op) {
        numerator = numerator * op.numerator;
        denominator = denominator * op.denominator;
    }
    void div(Fraction3 op) {
        Fraction3 frac = new Fraction3();
        frac.numerator= op.denominator;
        frac.denominator= op.numerator;
        mul(frac);
    }
    double toDouble(){
        return numerator/(double) denominator;
    }
    static int gcd(int a, int b){
        if (a==0) {
            return b;
        }
        else {
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }}
                return a;
            }

        }
    void reduce(){
       int kurz= gcd(numerator,denominator);
        numerator=numerator/kurz;
        denominator=denominator/kurz;}


}
