class Shape
{
    private String name; //suppose if there are private methods
    int length;
    void display()
    {
        System.out.println("The name of the shape is ");
    }
    // then we use the getter method here 
    String getName()
    {
        return this.name;
    }
}
class Rectangle extends Shape
{
    int length;
    Rectangle(int length)
    {
        this.length = length;
    }
     
}
class Circle extends Shape
{   
    int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    

}
public class GettersAndSetters
{
    public static void main(String[] args) {
        // here call the getters and the setters

    }
}

