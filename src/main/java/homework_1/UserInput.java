package homework_1;

import java.util.Scanner;

public class UserInput {
    public static Person personInput(String str){
        int age;
        String name, surname;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println(str);
            String[] input = scan.nextLine().split(" ");
            try {
                if (input[0].equals("exit")) {
                    System.exit(0);
                }
                name = input[0];
                surname = input[1];
                return new Person(name, surname);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверный формат ввода!");
            }
        }
    }
    public static int countInput(String str){
        int count;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println(str);
            String input = scan.nextLine();
            try {
                if (input.equals("exit")) {
                    System.exit(0);
                }
                count = Integer.parseInt(input);
                return count;
            } catch (NumberFormatException e){
                System.out.println("Неверный формат ввода!");
            }
        }
    }
    public static boolean answerInput(String str) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(str);
            String input = scan.next();
            try {
                if (input.equals("exit")) {
                    System.exit(0);
                }
                if (input.equals("y") ) {
                    return true;
                } else if (input.equals("n")){
                    return false;
                }
            } catch (Exception e){
                System.out.println("Неверный формат ввода!");
            }
        }
    }
}
