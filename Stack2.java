import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
	

		         Stack <Integer> st=new Stack<Integer>();
		         Stack<Integer> st1=new Stack<Integer>();
		         st.push(null);
		         st.push(null);
		       System.out.println(st);
		         st.add(0, 45);
		         System.out.println(st);
		         st.add(1, 45);
		         System.out.println(st);
		         st.push(45);
		       System.out.println(st);
		         System.out.println(st.isEmpty());
		         System.out.println(st.capacity());
		         System.out.println(st.empty());
		         System.out.println(st.size());
		           st=st1;
		         System.out.println(st1.addAll(st));
		         System.out.println(st1);
		         System.out.println(st1.addAll(st));
		         System.out.println(st1);
		         System.out.println(st1);
		         System.out.println(st1.size());
		         System.out.println(st1.capacity());
		         System.out.println(st1.isEmpty());
		         int size=st.size();
		         System.out.println(size);
			}

	}
