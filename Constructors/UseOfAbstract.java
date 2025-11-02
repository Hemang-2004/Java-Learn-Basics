import java.util.*;
abstract class Shape
{
    String name;
    int length;
    abstract double calcArea(int length);
    void display()
    {
        System.out.println("The name of the shape is ");
    }
}
class Rectangle extends Shape
{
    int length;
    Rectangle(int length)
    {
        this.length = length;
    }
    @Override
    double calcArea(int length)
    {
        return length*Math.E;
    }   
}
class Circle extends Shape
{   
    int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    @Override
    double calcArea(int radius)
    {
        return radius*Math.PI;
    }
    @Override
    void display() // Method overriding 
    {
        System.out.println("The are of the shape is "+calcArea(radius));
    }

}
public class UseOfAbstract {
    public static void main(String[] args) {
    // Shape shape = new Shape();
    Circle circle = new Circle(2);
    Rectangle rectangle = new Rectangle(10);
    rectangle.display();
        circle.display();
    }
}
