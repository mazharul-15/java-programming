import java.util.*;

// Base or Super Class
class Bicycle {
    // two fields
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // 3 methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed -= increment;
    }

    //toString method to print Bicycle info
    public String toString()
    {
        return "No of gears are " + gear + "\n" + "speed of bicycle is " + speed;
    }
}

//Derived or Child or Subclass
class MountainBike extends Bicycle {
    // one Field
    public int seatHeight;

    // constructor
    public MountainBike(int gear, int speed, int seatHeight)
    {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override public String toString()
    {
        return super.toString() + "\n height of seat " + seatHeight;
    }
}

public class Inheritance {
    /// main()
    public static void main(String[] args)
    {
        MountainBike mb = new MountainBike(5, 035, 45);
        System.out.println(mb.toString());
    }
}
