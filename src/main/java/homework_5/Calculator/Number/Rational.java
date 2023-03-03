package homework_5.Calculator.Number;

import homework_5.Calculator.Logger;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rational extends SomeNumber<Rational>{

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator is zero");
        }
        super.num= numerator;
        super.den = denominator;
    }

    @Override
    public Rational plus(SomeNumber<Rational> b) {
        int numerator = (this.num * b.den) + (this.den * b.num);
        int denominator = this.den * b.den;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(this + " + "+ b + " = " + result);
        return result;
    }
    @Override
    public Rational minus(SomeNumber<Rational> b) {
        int numerator = (this.num * b.den) - (this.den * b.num);
        int denominator = this.den * b.den;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(this + " - "+ b + " = " + result);
        return result;
    }
    @Override
    public Rational multiply(SomeNumber<Rational> b) {
        int numerator = this.num * b.num;
        int denominator = this.den * b.den;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(this + " * "+ b + " = " + result);
        return result;
    }

    @Override
    public Rational divide(SomeNumber<Rational> b) {
        int numerator = this.num * b.den;
        int denominator = this.den * b.num;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(this + " / "+ b + " = " + result);
        return result;
    }

    public String toString() {
        if (den == 1) return num + "";
        else return num + "/" + den;
    }
}
