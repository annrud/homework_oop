package homework_5.Calculator.Number;

public abstract class SomeNumber<T> {
    int num;
    int den;
    double re;
    double im;
    public abstract SomeNumber<T> plus(SomeNumber<T> z);
    public abstract SomeNumber<T> minus(SomeNumber<T> z);
    public abstract SomeNumber<T> multiply(SomeNumber<T> z);
    public abstract SomeNumber<T> divide(SomeNumber<T> z);

}
