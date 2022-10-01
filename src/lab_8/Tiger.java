package lab_8;

public class Tiger extends animal{
    public Tiger()
    {
        super.randomSpeed(100);
        System.out.println("Tiger has speed: "+getSpeed()+"km/h");
    }
}
