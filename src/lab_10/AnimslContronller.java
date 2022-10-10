package lab_10;

import java.util.Arrays;
import java.util.List;

public class AnimslContronller {
    public static void main(String[] args) {
        Animal tiger=new Tiger().setSpeed(80);
        Animal horse=new Horse().setSpeed(65);
        Animal dog=new Dog().setSpeed(40);
        List<Animal> animalList= Arrays.asList(tiger,horse,dog);
        animalList.forEach(v -> System.out.println(v.getClass().getSimpleName() + " vs " + v.getSpeed()));
        Animal winner=AnimslContronller.animalWin(animalList);
        int winnerSpeed=winner.getSpeed();
        String nameWinner=winner.getClass().getSimpleName();
        System.out.printf("The winner is: %s - with speed: %d km/h", nameWinner, winnerSpeed);
    }
    private static Animal animalWin(List<Animal> animalList) {

        int maxSpeed = 0;
        int winner = 0;

        for (int i = 0; i < animalList.size(); i++) {

            int animalSpeed = animalList.get(i).getSpeed();
            if (animalSpeed > maxSpeed) {
                maxSpeed = animalSpeed;
                winner = i;
            }
        }
        return animalList.get(winner);
    }

}

