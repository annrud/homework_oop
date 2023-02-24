package homework_1;

import lombok.Getter;


@Getter
enum Relationship {
    PARENT("Дети"),
    CHILD("Родители");

    private String translate;

    Relationship(String translate) {
        this.translate = translate;
    }
}
