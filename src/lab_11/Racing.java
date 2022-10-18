package lab_11;

import java.util.Arrays;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Falcon falcon = new Falcon();
        Horse horse = new Horse();


        AnimalController animalController = new AnimalController();
        List<FlyAble> animalList = Arrays.asList(dog, eagle, falcon, horse);
        MoveAble winner = animalController.getWinner(animalList);
        String name = winner.getName();
        String speed = Integer.toString(winner.move());
        System.out.println(animalList);
        System.out.print("Winner is " + name + ", speed:" + speed);
    }
}
