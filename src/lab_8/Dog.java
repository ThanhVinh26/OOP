package lab_8;

public class Dog extends animal{
    public Dog()
    {
        super.randomSpeed(60);
        System.out.println("Dog has speed: "+getSpeed()+"km/h");
    }
}
