import java.util.*;
public class WrapperClasses {
    public static void main(String[] args) {
        String a = Integer.toString(1);
        String b = Double.toString(32.34);
        String c = Character.toString('@');
        String d = Boolean.toString(true); // wrapper classes
        String x = a+b+c+d;
        System.out.println(x);
        char le = '$';
        char letter = 'b';
        System.out.println(Character.isLetter(le));
        System.out.println(Character.isLetter(letter));
        //Character. ---- here we get the wrapper classes here 
    }
}
