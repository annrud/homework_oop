package homework_5.MVP;

import homework_5.Calculator.Complex;
import homework_5.Calculator.Rational;

public interface View {
    String get();
    Complex getComplex(String str);
    Rational getRational(String str);
    void set(String value);
    String getOperator(String s);
}
