class Car
{
    String name;
    String model;
    int year;
    Car(String name, String model, int year)
    {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String toString()
    {
        return name+year+model; 
    }
}

public class UseOfToString {
    public static void main(String[] args) {
        Car car = new Car("Rolls-Royce","Phantom",2024);
        // System.out.println(car); // this will print out Car@2a139a55
        // Instead of that we will 
        System.out.println(car); // NOW AFTER THE TOSTRING ONE IT WILL PRINT NORMALLY
    }
}
