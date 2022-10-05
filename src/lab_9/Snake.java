package lab_9;

import java.security.SecureRandom;

public class Snake extends Animal{
    private static final int Snake_speed = 50;
    public Snake() {
        super(new SecureRandom().nextInt(Snake_speed));
    }
}
