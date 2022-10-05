package lab_9;

import java.security.SecureRandom;

public class Eagle extends Animal{
    private static final int Eagle_speed = 20;
    public Eagle() {
        super(new SecureRandom().nextInt(Eagle_speed));
    }
}
