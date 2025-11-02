class Animals
{
    boolean isAlive;
    String nameofAnimal;
    Animals(String nameofAnimal, double animalDimension)
    {
        this.nameofAnimal = nameofAnimal;
        isAlive = true;
    }
    void talks()
    {
        System.out.println("Animals are talking");
    }
}
class Dog extends Animals
{
    Dog(String nameofAnimal, double animalDimension) // yahan par jo constructor hai unme wahi parameter pass hone 
    //chahiye jo parent class me pass hue hain
    {
        super(nameofAnimal, animalDimension);
    }
    @Override
    void talks()
    {
        System.out.println("Bark bark");
    }
}
class Cat extends Animals
{
    
    Cat(String nameofAnimal, double animalDimension)
    {
        super(nameofAnimal, animalDimension);
    }
    @Override
    void talks()
    {
        System.out.println("Meow meow");
    }
}

class Puppy extends Dog
{
    Puppy(String nameofAnimal, double animalDimension)
    {
        super(nameofAnimal, animalDimension);
    }
    @Override
    void talks()
    {
        System.out.println("Bow Bow");
    }
}

public class InheritanceBasics {
    public static void main(String[] args) {
        Animals animals = new Animals("janwar",13.1);
        Dog dog = new Dog("kutta",413.53);
        Cat cat = new Cat("billi",3.23);
        Puppy puppy = new Puppy("tommy",.32);
        dog.talks();
        puppy.talks();
        cat.talks();
    }
}

//Default toString returns a hashcode thats why we have to use a Custom toString type of it
