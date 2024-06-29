
import java.util.*;

public class Collec1 {
public static void main(String args[]) {
	List al=new ArrayList();
	al.add(2);
	al.add('a');
	al.add("Naresh");
	al.add(3);
	al.add(2);//it allows duplicats
	al.add(2,30);
	//al.remove("Naresh");
	//al.remove(2);
	//al.remove(2);
	//al.remove('a');
	System.out.println(al);
	System.out.println("size:"+al.size());
   Iterator  itr=al.iterator();
   
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
   
}
}
