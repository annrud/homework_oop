package homework_5.Calculator;

public class ComplexCalc implements SimpleOperation<Complex> {

    @Override
    public Complex plus(Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(a + " + "+ b + " = " + result);
        return result;
    }

    @Override
    public Complex minus(Complex a, Complex b) {
        double real = a.re - b.re;
        double imag = a.im - b.im;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(a + " - "+ b + " = " + result);
        return result;
    }

    @Override
    public Complex multiply(Complex a, Complex b) {
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(a + " * "+ b + " = " + result);
        return result;
    }

    @Override
    public Complex divide(Complex a, Complex b) {
        double scale = Math.pow(10, 1);
        double denominator = b.re * b.re + b.im * b.im;
        double real = Math.ceil(((a.re * b.re + a.im * b.im)/denominator) * scale) / scale;
        double imag = Math.ceil(((a.im * b.re - a.re * b.im)/denominator) * scale) / scale;
        Complex result = new Complex(real, imag);
        Logger.writeToFile(a + " / "+ b + " = " + result);
        return result;
    }
}
