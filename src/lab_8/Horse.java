package lab_8;

public class Horse extends animal{
    public Horse()
    {
        super.randomSpeed(75);
        System.out.println("Horse has speed: "+getSpeed()+"km/h");
    }
}
