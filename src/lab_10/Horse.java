package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal{
    private static final int HORSE_MAX_SPEED = 75;

    public Horse() {}

    @Override
    public Horse setSpeed(int tocdo) {
        speed = new SecureRandom().nextInt(tocdo);
        return this;
    }
}
