package homework_2;

public class Cat extends Pet{

    public Cat(String namePet) {
        super(namePet);
    }

    @Override
    public String toString() {
        return String.format("кот %s", namePet);
    }
}
