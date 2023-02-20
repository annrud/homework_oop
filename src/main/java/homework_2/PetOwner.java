package homework_2;

import homework_1.Person;

import java.util.ArrayList;

public class PetOwner extends Person implements Action{
    ArrayList<Pet> pets;

    public PetOwner(String name, String surname, ArrayList<Pet> pets) {
        super(name, surname);
        this.pets = pets;
    }

    public void call(Pet pet){
        System.out.printf("Позвать %s\n", pet);
    }
    public void feed(Pet pet) {
        System.out.printf("Покормить %s\n", pet);
    }
    public void play(Pet pet){
        System.out.printf("Поиграть с %s\n", pet);
    }

    public void showOwnerAndPet(Pet pet) {
        System.out.printf(
                "%s владелец животного - %s.\n", getFullName(), pet
        );
    }
}
