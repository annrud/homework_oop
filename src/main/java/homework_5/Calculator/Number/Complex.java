package homework_5.Calculator.Number;

import homework_5.Calculator.Logger;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Complex extends SomeNumber<Complex>{

    public Complex(double real, double imag) {
        super.re = real;
        super.im = imag;
    }

    @Override
    public Complex plus(SomeNumber<Complex> b) {
        double real = this.re + b.re;
        double imag = this.im + b.im;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(this + " + "+ b + " = " + result);
        return result;
    }


    @Override
    public Complex minus(SomeNumber<Complex> b) {
        double real = this.re - b.re;
        double imag = this.im - b.im;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(this + " - "+ b + " = " + result);
        return result;
    }
    @Override
    public Complex multiply(SomeNumber<Complex> b) {
        double real = this.re * b.re - this.im * b.im;
        double imag = this.re * b.im + this.im * b.re;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(this + " * "+ b + " = " + result);
        return result;
    }
    @Override
    public Complex divide(SomeNumber<Complex> b) {
        double scale = Math.pow(10, 1);
        double denominator = b.re * b.re + b.im * b.im;
        double real = Math.ceil(((this.re * b.re + this.im * b.im)/denominator) * scale) / scale;
        double imag = Math.ceil(((this.im * b.re - this.re * b.im)/denominator) * scale) / scale;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(this + " / "+ b + " = " + result);
        return result;
    }

    public String toString() {
        if (im == 0) return "(" + re + ")";
        if (re == 0) return "(" + im + "i)";
        if (im < 0) return "(" + re + " - " + (-im) + "i)";
        return "(" + re + " + " + im + "i)";
    }

}
