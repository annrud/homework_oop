package homework_1;

import java.util.Scanner;

import static homework_1.UserInput.*;

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
            } break;
        }
    }
}