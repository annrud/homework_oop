package homework_5.Calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rational{

    protected int num;
    protected int den;

    public Rational(int numerator, int denominator) {
        this.num= numerator;
        this.den = denominator;
    }


    public String toString() {
        if (den == 1) return num + "";
        else return num + "/" + den;
    }
}
