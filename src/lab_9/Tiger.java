package lab_9;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private static final int Tiger_speed = 34;
    public Tiger() {
        super(new SecureRandom().nextInt(Tiger_speed));
    }
}
