package homework_5.Client;

import homework_5.Calculator.Complex;
import homework_5.Calculator.Rational;
import homework_5.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner scan = new Scanner(System.in);

    public String get() {
        return scan.next();
    }


    @Override
    public void set(String value) {
        System.out.println(value);

    }

    public Complex getComplex(String str) {
        Scanner scan = new Scanner(System.in);
        double re;
        double im;
        while (true) {
            System.out.println(str);
            String[] input = scan.nextLine().split(" ");
            try {
                re = Double.parseDouble(input[0]);
                im = Double.parseDouble(input[1]);
                return new Complex(re, im);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверный формат ввода!");
            }
        }
    }

    public Rational getRational(String str) {
        Scanner scan = new Scanner(System.in);
        int num;
        int den;
        while (true) {
            System.out.println(str);
            String[] input = scan.nextLine().split(" ");
            try {
                num = Integer.parseInt(input[0]);
                den = Integer.parseInt(input[1]);
                if (den == 0) {
                    System.out.println("Деление на 0 невозможно!");
                } else {return new Rational(num, den);}
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверный формат ввода!");
            }
        }
    }

    public String getOperator(String str) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder()
                .append("+")
                .append("-")
                .append("*")
                .append("/");
        while (true) {
            System.out.println(str);
            String input = scan.next();
            try {
                if (input.equals("0")) {
                    System.exit(0);
                }
                if (sb.indexOf(input) != -1) {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Неверный формат ввода!");
            }
        }
    }
}
