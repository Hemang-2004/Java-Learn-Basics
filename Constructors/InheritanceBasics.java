class Animals
{
    boolean isAlive;
    Animals()
    {
        isAlive = true;
    }
    void talks()
    {
        System.out.println("Animals are talking");
    }
}
class Dog extends Animals
{
    @Override
    void talks()
    {
        System.out.println("Bark bark");
    }
}
class Cat extends Animals
{
    @Override
    void talks()
    {
        System.out.println("Meow meow");
    }
}

class Puppy extends Dog
{
    @Override
    void talks()
    {
        System.out.println("Bow Bow");
    }
}

public class InheritanceBasics {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Puppy puppy = new Puppy();
        dog.talks();
        puppy.talks();
        cat.talks();
    }
}
