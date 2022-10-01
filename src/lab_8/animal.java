package lab_8;

import java.security.SecureRandom;

public class animal {
    private int speed;

    public animal() {
    }

    public animal(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int randomSpeed(int maxSpeed)
    {
        do{
            speed = new SecureRandom().nextInt(maxSpeed);
        }while (speed==0);
        return speed;

    }
}
