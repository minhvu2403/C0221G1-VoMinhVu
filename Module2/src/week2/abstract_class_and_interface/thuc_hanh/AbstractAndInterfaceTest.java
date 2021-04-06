package week2.abstract_class_and_interface.thuc_hanh;

import week2.abstract_class_and_interface.thuc_hanh.fruit.Orange;
import week2.abstract_class_and_interface.thuc_hanh.animal.Animal;
import week2.abstract_class_and_interface.thuc_hanh.animal.Chicken;
import week2.abstract_class_and_interface.thuc_hanh.animal.Tiger;
import week2.abstract_class_and_interface.thuc_hanh.edible.Edible;
import week2.abstract_class_and_interface.thuc_hanh.fruit.Apple;
import week2.abstract_class_and_interface.thuc_hanh.fruit.Fruit;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
         for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
