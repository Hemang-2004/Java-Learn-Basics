


// Important note is that whenever you use the static keyword you should reference it with the
// class rather than the object as the static keyword does not depend on the object
// static keyword rather depends on the class than object

class Friend
{
    static int number;
    String frname;
    Friend(String frname)
    {
        this.frname = frname;
        number++;
    }
}
public class StaticBasics {
    public static void main(String[] args) {
        Friend fr1 = new Friend("a");
        System.out.println(Friend.number);
        Friend fr2 = new Friend("b");
        System.out.println(Friend.number);
        Friend fr3 = new Friend("c");
        System.out.println(Friend.number);
        Friend fr4 = new Friend("d");
        Friend fr5 = new Friend("e");
        System.out.println(Friend.number);
        

    }
}
