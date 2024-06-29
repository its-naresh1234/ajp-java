import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String args[])
    {
    	Set<Integer> hs=new HashSet<>();
    	hs.add(503);
    	hs.add(505);
    	hs.add(504);
    	hs.add(506);
    	hs.add(507);
    	hs.add(508);
    	hs.add(null);
    	hs.add(503);//not allow duplicate obj
    	System.out.println(hs);
    	System.out.println(hs.hashCode());
    	System.out.println(hs.add(null));//only one null should be allowed 
    	System.out.println(hs);
    	//System.out.println(((Object) hs).desendingSet());
    	System.out.println(hs.isEmpty());
    	System.out.println(hs);
    	System.out.println(hs.remove(503));
    	System.out.println(hs);
    	
    	
    }
}
