package homework_1;

import lombok.Getter;

@Getter
public class Person {

    private String name;
    private String surname;


    public Person(String name, String surname) {
                this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
