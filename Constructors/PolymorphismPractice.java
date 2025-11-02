abstract class Vehicle
{
    abstract void go();
}
class Car extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("Car goes vroom");
    }
}
class Truck extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("Truck goes vrughhh");
    }
}
class Bike extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("Bike goes vro vro");
    }
}
public class PolymorphismPractice {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        // Car[] cars = {car,bike,truck}; // ERROR AS IT IS IMCOMPATIBLE
        Vehicle[] vehicles = {car,bike,truck};
        for(int i=0;i<vehicles.length;i++)
        {
            // System.out.println(vehicles[i]);// THIS WILL ONLY PRINT THE ADDRESS AS THE 
            // BE DEFAULT ADDRESS HEX CODE IS BEING CALLED toString is being called
            // Truck@70dea4e
            vehicles[i].go();
        }
    }
}
