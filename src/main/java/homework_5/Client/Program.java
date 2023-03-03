package homework_5.Client;

import homework_5.Calculator.Calculator;
import homework_5.Calculator.Number.Complex;
import homework_5.Calculator.Number.Rational;

public class Program {
    public static void main(String[] args) throws Exception {
        Complex complex1 = new Complex(10.0, 15.0);
        System.out.println(complex1);

        Complex complex2 = new Complex(7.0, 20.0);
        System.out.println(complex2);

        Calculator<Complex> calc1 = new Calculator<>(complex1, complex2);
        calc1.calculate("+");
        calc1.calculate("-");
        calc1.calculate("*");
        calc1.calculate("/");


        Rational rational1 = new Rational(10, 15);
        System.out.println(rational1);

        Rational rational2 = new Rational(4, 2);
        System.out.println(rational2);
        Calculator<Rational> calc2 = new Calculator<>(rational1, rational2);
        calc2.calculate("+");
        calc2.calculate("-");
        calc2.calculate("*");
        calc2.calculate("/");


    }
}
