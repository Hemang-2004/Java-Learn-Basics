import java.util.*;
public class ListsArraylists {
    public static void main(String args[])
    {
        // This list is mutable
        List<String> colors = new ArrayList<>(); // You can create an ArrayList
        List<Integer> numbers = new LinkedList<>(); // You can create a LinkedList also
        colors.add("yellow");
        colors.add("blue");
        colors.add("orange");
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors);


        // For making immutable lists in Java NO ELEMENTS CAN BE ADDED FURTHERLY 
        List<String> unstrlst = List.of(
            "blue",
            "yellow",
            "black"
        );
        //  unstrlst.add("orange"); 
        System.out.println(unstrlst);
    }
}
