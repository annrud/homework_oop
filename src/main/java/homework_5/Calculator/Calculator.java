package homework_5.Calculator;

import homework_5.Calculator.Number.SomeNumber;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Calculator<T>{
    private SomeNumber<T> first, second;


    public Calculator(SomeNumber<T> first, SomeNumber<T> second) {
        this.first = first;
        this.second = second;

    }

    public SomeNumber<T> calculate(String action) throws Exception {
        return switch (action){
            case ("+") -> first.plus(second);
            case ("-") -> first.minus(second);
            case ("*") -> first.multiply(second);
            case ("/") ->  first.divide(second);
            default -> throw new Exception("Неверный ввод знака!");
        };
    }
}
