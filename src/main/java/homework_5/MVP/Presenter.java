package homework_5.MVP;
import homework_5.Calculator.Complex;
import homework_5.Calculator.ComplexCalc;
import homework_5.Calculator.Rational;
import homework_5.Calculator.RationalCalc;
import homework_5.Client.ConsoleView;


public class Presenter {
    View view;

    public Presenter(ConsoleView view) {
        this.view = view;
    }
    public void readme() {
        System.out.println(
                "Программа \"Калькулятор\" для " +
                "комплексных и рациональных чисел."
        );
    }

    public void start() {
        ComplexCalc complexCalc = new ComplexCalc();
        RationalCalc rationalCalc = new RationalCalc();

        StringBuilder sb = new StringBuilder()
                .append("\n Выберите:\n")
                .append("1 - Операции с комплексными числами\n")
                .append("2 - Операции с рациональными числами\n")
                .append("0 - exit\n");


        while (true) {
            view.set(sb.toString());
            switch (view.get()) {
                case "1" -> {
                    Complex a = view.getComplex(
                            "Введите вещественную и мнимую " +
                                    "части первого числа в формате -2.5 5: "
                    );

                    Complex b = view.getComplex(
                                    "Введите вещественную и мнимую " +
                                            "части второго числа в формате 10 5.7: "
                            );
                    switch (choiceOperator()){
                        case ("+") -> printResult(complexCalc.plus(a, b));
                        case ("-") -> printResult(complexCalc.minus(a, b));
                        case ("*") -> printResult(complexCalc.multiply(a, b));
                        case ("/") -> printResult(complexCalc.divide(a, b));
                    }
                }
                case "2" -> {
                    Rational a = view.getRational(
                            "Введите числитель и " +
                                    "знаменатель первого числа в формате 7 2: "
                    );
                    Rational b = view.getRational(
                                    "Введите числитель и " +
                                            "знаменатель второго числа в формате 7 2: "
                            );
                    switch (choiceOperator()){
                        case ("+") -> printResult(rationalCalc.plus(a, b));
                        case ("-") -> printResult(rationalCalc.minus(a, b));
                        case ("*") -> printResult(rationalCalc.multiply(a, b));
                        case ("/") -> printResult(rationalCalc.divide(a, b));
                    }
                }
                case "0" -> {
                    return;
                }
            }
        }

    }
    public String choiceOperator() {
        return view.getOperator(
                "Введите оператор \"+\", \"-\", \"*\", \"/\" или 0 - exit:"
        );
    }
    
    public void printResult(Object result){
        System.out.println("Результат: " + result);
    }
}
