package lab_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnimalController {
    public animal speed(List<animal> animalsList)
    {
        int winner = animalsList.get(0).getSpeed();
       int indexspeed = 0;

               for (int i = 0; i < animalsList.size(); i++) {
            if (winner < animalsList.get(i).getSpeed())
            {
                winner = animalsList.get(i).getSpeed();
                indexspeed = i;
            }
        }
        return animalsList.get(indexspeed);
    }

    public static void main(String[] args)
    {

          animal tiger = new Tiger();
          animal horse = new Horse();
          animal dog = new Dog();
        AnimalController animalsController = new AnimalController();
        List<animal> animalsList = Arrays.asList(dog,horse,tiger);
        animal winner = animalsController.speed(animalsList);
        String animalWinner = winner.getClass().getSimpleName();
        String speedAnimalWinner = Integer.toString(winner.getSpeed());
        System.out.print("Winner is " +animalWinner +  "+ with speed:" + speedAnimalWinner) ;
    }
}
