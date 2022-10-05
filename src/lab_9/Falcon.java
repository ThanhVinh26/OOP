package lab_9;

import java.security.SecureRandom;

public class Falcon extends Animal{
    private static final int Falcon_speed = 30;
    public Falcon() {
        super(new SecureRandom().nextInt(Falcon_speed));
    }
}
