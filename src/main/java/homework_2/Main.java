package homework_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> myPets = new ArrayList<>();
        Cat mark = new Cat("Маркуша");
        Dog black = new Dog("Черныш");
        myPets.add(mark);
        myPets.add(black);
        PetOwner anna = new PetOwner("Анна", "Попова", myPets);

        for (Pet pet: anna.pets) {
            anna.showOwnerAndPet(pet);
            anna.call(pet);
            anna.feed(pet);
            anna.play(pet);
        }
      }
}
