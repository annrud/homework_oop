package homework_5.Calculator;

public class RationalCalc implements SimpleOperation<Rational> {
    
    @Override
    public Rational plus(Rational a, Rational b) {
        int numerator = (a.num * b.den) + (a.den * b.num);
        int denominator = a.den * b.den;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(a + " + "+ b + " = " + result);
        return result;
    }
    
    @Override
    public Rational minus(Rational a, Rational b) {
        int numerator = (a.num * b.den) - (a.den * b.num);
        int denominator = a.den * b.den;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(a + " - "+ b + " = " + result);
        return result;
    }
    
    @Override
    public Rational multiply(Rational a, Rational b) {
        int numerator = a.num * b.num;
        int denominator = a.den * b.den;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(a + " * "+ b + " = " + result);
        return result;
    }

    @Override
    public Rational divide(Rational a, Rational b) {
        int numerator = a.num * b.den;
        int denominator = a.den * b.num;
        Rational result = new Rational(numerator, denominator);
        Logger.writeToFile(a + " / "+ b + " = " + result);
        return result;
    }
}
