package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal{
    private static final int DOG_MAX_SPEED = 50;

    public Dog() {}

    @Override
    public Dog setSpeed(int tocdo) {
        speed = new SecureRandom().nextInt(tocdo);
        return this;
    }
}
