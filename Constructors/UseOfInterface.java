interface Predators
{
    void hunt();
}
interface Prey
{
    void flee();
}
class Rabbit implements Prey
{
    @Override
    public void flee() // YOU WILL HAVE TO CREATE PUBLIC METHOD HERE FOR ERROR NOT TO COME
    {
        System.out.println("Prey is escaping");
    }
}
class Hawk implements Predators
{
    @Override
    public void hunt()
    {
        System.out.println("Predator is hunting");
    }
}
class Fish implements Predators,Prey
{
    @Override
    public void hunt()
    {
        System.out.println("FIsh is hunting");
    }
    @Override
    public void flee() // YOU WILL HAVE TO CREATE PUBLIC METHOD HERE FOR ERROR NOT TO COME
    {
        System.out.println("Fish is escaping");
    }
}
public class UseOfInterface {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
