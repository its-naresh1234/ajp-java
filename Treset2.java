import java.util.Set;
import java.util.TreeSet;

public class Treset2 {

	public static void main(String[] args) {
          Set<String> ts1=new TreeSet<String>();
           ts1.add("Hyderabasd");
           ts1.add("Mumbai");
           ts1.add("Secbad");
           ts1.add("Mancherial");
           ts1.add("Chennur");
           ts1.add("Warangal");
           System.out.println(ts1);
           System.out.println(ts1.isEmpty());
           System.out.println(ts1.contains("Mancherial"));
           System.out.println(ts1.remove("Secbad"));
           System.out.println(ts1);
           System.out.println(ts1.hashCode());
           System.out.println(ts1.size());
           System.out.println(ts1.add("BBc"));
           System.out.println(ts1);
           System.out.println(ts1.size());
	}

}
