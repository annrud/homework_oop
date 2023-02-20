package homework_2;

public class Dog extends Pet{

    public Dog(String namePet) {
        super(namePet);
    }

    @Override
    public String toString() {
        return String.format("собака %s", namePet);
    }
}
