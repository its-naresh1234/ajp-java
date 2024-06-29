import java.util.List;
import java.util.Vector;

public class Collec5 {

	public static void main(String[] args) {
	List<String> ls=new Vector<String>();
	ls.add("null");
	ls.add("null2");
	ls.add("null2");
	ls.add("null4");
	ls.add("null5");
	System.out.println(ls);//list will be printed
    List<String> ls1=new Vector<String>();
    ls1.add("null6");
    ls=ls1;
    System.out.println(ls.addAll(ls1));
    System.out.println(ls1);
    System.out.println(ls.equals(ls1));
//    System.out.println(ls.containsAll(ls1));
//    System.out.println(ls.containsAll(ls1));
//    System.out.println(ls1.containsAll(ls));
	}

}
