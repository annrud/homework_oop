package homework_3;

import lombok.Getter;

@Getter
enum Priority {
    HIGH("1"),
    MEDIUM("2"),
    LOW("3");
    private String translate;

    Priority(String translate) {
        this.translate = translate;
    }
}
