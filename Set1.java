import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<String> st = new HashSet<String>();
		
		  st.add("Naresh"); st.add("Naresh2");//not allow duplicates st.add("Sai");
		  st.add("ajay"); st.add("Sai2");//not preserve insertion order
		  System.out.println(st.size());//size is 5 System.out.println(st);
		  System.out.println(st.isEmpty()); System.out.println(st.contains("Sai"));
		  System.out.println(st.remove("Naresh2")); System.out.println(st);
		  
		  System.out.println(st.size());//now size is 4
		  
		  st.add(null); st.add(null); st.add(null); st.add(null); st.add(null);
		  System.out.println(st);
		 
	}

}
