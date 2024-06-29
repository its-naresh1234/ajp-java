import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
         Stack <Integer> st=new Stack<Integer>();
         Stack<Integer> st1=new Stack<Integer>();
         st.push(null);
         st.push(null);
         st.add(0, 45);
         st.add(1, 45);
         st.push(45);
         System.out.println(st);

           st1=st;
         System.out.println(st1);
        System.out.println(st1.addAll(st));
//       
//         System.out.println(st1);

	}

}
