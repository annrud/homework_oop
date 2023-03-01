package homework_3;

import lombok.Getter;

@Getter
public class Priority<T> {
    T priority;

    public Priority(T priority) {
        this.priority = priority;
    }

    public Priority(){
    }
}
