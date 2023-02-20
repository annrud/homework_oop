package homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Программа поможет исследовать ваше гениалогическое древо. " +
                "Для прерывания программы введите \"exit\"."
        );
        ResearchTree currentTree = new ResearchTree();
        while(true) {
            Person person = personInput(
                    "Введите данные персоны(имя фамилия):"
            );
            Person father = personInput(String.format(
                    "Введите данные отца персоны %s(имя фамилия):", person)
            );
            Person mother = personInput(String.format(
                    "Введите данные матери персоны %s(имя фамилия):", person)
            );
            currentTree.append(father, person);
            currentTree.append(mother, person);
            int count = countInput(String.format("Сколько у персоны %s детей?", person));
            for (int i = 0; i < count; i++) {
                Person child = personInput(
                        "Введите данные ребенка (имя фамилия):");
                currentTree.append(person, child);
            }
            if (answerInput("Продолжим вводить данные персон? (y/n)")) {
                continue;
            }
            while (true) {
                if (answerInput("Будем исследовать персон? (y/n)")) {
                    Person object = personInput("Введите данные персоны(имя фамилия): ");
                    currentTree.research(object);
                } else {
                    break;
                }
            }
        }
    }

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