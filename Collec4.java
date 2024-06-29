import java.util.LinkedList;
import java.util.*;

public class Collec4 {
public static void main(String args[])
{
	List<String> ll=new LinkedList<String>();
	ll.add("naresh");
	ll.add("madhu");
	ll.add("Sai");
	LinkedList<String> ll2=new LinkedList<String>();
	ll2.addAll(ll);
    ll2.add(1,"Reddy");
    ll2.add(2,"Bandan");
	
	System.out.println(ll); 
	//ll2.pop();
	Iterator it=ll.iterator();
	while(it.hasNext());
	
	System.out.println(it);
		
	}
	
}

