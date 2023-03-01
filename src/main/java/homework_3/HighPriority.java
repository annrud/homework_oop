package homework_3;

public class HighPriority extends Priority {
    public HighPriority(Object priority) {
        super(priority);
    }

    public HighPriority() {
    }

    @Override
    public String toString() {
        return "High";
    }
}
