import java.util.LinkedHashSet;

public class LHashSet1 {

	public static void main(String[] args) {
     LinkedHashSet<String> ls=new  LinkedHashSet<String>();
     ls.add("Naresh1");//by implemented linked list
     ls.add("Naresh2");
     ls.add("Naresh3");
     ls.add("Naresh4");//preserve insertion order
     System.out.println(ls);
     for(String s:ls)
    	 System.out.println(s);
     System.out.println(ls.remove("Naresh4"));//true	
     System.out.println(ls);
     System.out.println(ls.contains("Naresh3"));
	}

}
