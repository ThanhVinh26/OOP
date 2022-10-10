package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private static final int TIGER_MAX_SPEED = 100;

    public Tiger() {}

    @Override
    public Tiger setSpeed(int tocdo) {
        speed = new SecureRandom().nextInt(tocdo);
        return this;
    }
}
