package week2.abstract_class_and_interface.thuc_hanh.edible;

import week2.abstract_class_and_interface.thuc_hanh.animal.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken:cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
