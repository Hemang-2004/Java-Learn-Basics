import java.util.*;
public class StringMethods
{
    
    public static void main(String args[])
    {   
        String name = "Hemang is there";
        int len = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("e");
        int lastindex = name.lastIndexOf(" ");
        System.out.println(len);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        name = name.replace("e","x");
        System.out.println(name);
        if(name.isEmpty())
        {
            System.out.println("Bhai Pagal hai kya ");
        }
        else 
        {
             System.out.println("Koi na all is well");
        }
        if(name.contains("j"))
        {
             System.out.println("Bhai tussi god ho");
        }
        else
        {
             System.out.println("Bhai tussi pagal ho");
        }
    }
}