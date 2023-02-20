package homework_2;

abstract class Pet {
    String namePet;

    public Pet(String namePet) {
        this.namePet = namePet;
    }

    @Override
    public String toString() {
        return namePet;
    }
}
