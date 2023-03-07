package homework_5.Calculator;

public interface SimpleOperation<T> {
    T plus(T a, T b);
    T minus(T a, T b);
    T multiply(T a, T b);
    T divide(T a, T b);
}

