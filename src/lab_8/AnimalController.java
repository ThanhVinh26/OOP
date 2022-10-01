package lab_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {
        //AnimalController aniController = new AnimalController();
        //List<animal> aniList = Arrays.asList(tiger, horse, dog);
        int round=0;
        do {
            int speed = new Tiger().getSpeed();
            int speed1 = new Horse().getSpeed();
            int speed2 = new Dog().getSpeed();
            int winer=0;
            String animal;
            if(speed>speed1)
            {
                winer=speed;
                animal="tiger";
            }else{
                winer=speed1;
                animal="horse";
            }
            if (winer < speed2){
                winer = speed2;
                animal="dog";
            }

            System.out.println("Winer is: " +animal+ "+ speed: " +winer+"km/h");
            round++;
        }while(round<3);
    }
}
