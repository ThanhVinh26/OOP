package lab_9;

import lab_8.animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    private List<Animal> NotFly(List<Animal> animalList) {
        List<Animal> notFly = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal.isFlyable() == false) {
                notFly.add(animal);
            }
        }
        return notFly;
    }
    private Animal Speed(List<Animal> animalList) {

        int maxSpeed = 0;
        int speed = 0;

        for (int i = 0; i < animalList.size(); i++) {

            int animalSpeed = animalList.get(i).getSpeed();
            if (animalSpeed > maxSpeed) {
                maxSpeed = animalSpeed;
                speed = i;
            }
        }
        return animalList.get(speed);
    }

    public static void main(String[] args) {
        AnimalController animalController=new AnimalController();
        Animal snake = new Animal.Builder().setName("snake").setSpeed(21).isFlyable(false).build();
        Animal tiger = new Animal.Builder().setSpeed(25).setName("tiger").isFlyable(false).build();
        Animal falcon = new Animal.Builder().setSpeed(27).setName("falcon").isFlyable(true).build();
        Animal eagle = new Animal.Builder().setSpeed(23).setName("eagle").isFlyable(true).build();
        List<Animal> animalList= Arrays.asList(tiger,snake,falcon,eagle);
        Animal winner = animalController.Speed(animalList);
        String animalWinner = winner.getName();
        String speedAnimalWinner = Integer.toString(winner.getSpeed());
        System.out.print("Winner is " +animalWinner +  "+ with speed:" + speedAnimalWinner) ;

    }
}


