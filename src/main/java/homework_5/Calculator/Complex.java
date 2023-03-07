package homework_5.Calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Complex {
    protected double re;
    protected double im;


    public Complex(double real, double imag) {
    this.re = real;
    this.im = imag;
}

    public String toString() {
        if (im == 0) return "(" + re + ")";
        if (re == 0) return "(" + im + "i)";
        if (im < 0) return "(" + re + " - " + (-im) + "i)";
        return "(" + re + " + " + im + "i)";
    }
}
