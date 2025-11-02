import java.util.*;

public class ArraysBasics
{
    public static void main(String args[])
    {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[2] = 234;
        arr[3] = 134;
        arr[4] = -23;
        System.out.println(Arrays.toString(arr)); //To print the array else it will 
        //print the address
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        String[] strs = new String[3];
        strs[0] = "53";
        strs[1] = "booya";
        strs[2] = "apple";
        for(String peeps:strs)
        {
            System.out.printf("%s ",peeps);
        }
    }
    
}