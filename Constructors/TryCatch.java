import java.util.*;
public class TryCatch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    try
    {
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int c = a/b;
    }
    catch(ArithmeticException e)
    {
        System.out.println("Bhai chutiya hai kya"+ e);
    }
    catch(InputMismatchException e)
    {
        System.out.println("Bhai bhosdiwala hai kya");
    }
    catch(Exception e) // most safe catches all exceptions
    {
        System.out.println("BHAI TU RAHANE DE "); 
    }
    finally 
    // Always execute
    {
        System.out.println(12);
        sc.close();
    }
    }
}
