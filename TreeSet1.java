import java.util.TreeSet;
import java.util.Set;
public class TreeSet1 {

	public static void main(String[] args) {
       Set<String> ts=new TreeSet<String>();
       ts.add("n5");
       ts.add("n4");
       ts.add("n1");
       ts.add("n2");//follows ascending order
       ts.add("n3");
       System.out.println(ts);
       for(String s:ts)
    	   System.out.println(s);
  //    System.out.println(ts.getClass());
      // ts.getClass();
   //   System.out.println(ts.parallelStream());
 //    ((TreeSet<String>) ts).descendingSet();
      System.out.println( ((TreeSet<String>) ts).descendingSet());
      TreeSet ts1=new TreeSet();
      ts1.add(1);
      ts1.add(5);
      ts1.add(2);
      System.out.println(ts1.descendingSet()); 
	}

}
