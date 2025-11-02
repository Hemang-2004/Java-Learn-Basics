import java.util.*;
public class StacksBasics {
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(2);
        System.out.println(st.peek()); //top most
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}
