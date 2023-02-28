package homework_3;

import homework_1.Person;
import lombok.Getter;

@Getter
public class Author extends Person {
    private String patronymic;

    public Author(String name, String surname, String patronymic) {
        super(name, surname);
        this.patronymic = patronymic;
    }

    @Override
    public String getFullName() {
        return String.format("%s %s %s", super.getName(), patronymic, super.getSurname());
    }
}
