import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Collectrion1 {

	public static void main(String[] args) {
             LinkedList<Integer> lc=new LinkedList<Integer>();
             lc.add(501);
             lc.add(502);
             lc.add(503);
             lc.add(504);
             lc.add(505);
             lc.add(506);
             System.out.println(lc);
             System.out.println(Collections.max(lc));
             System.out.println(Collections.min(lc));
             System.out.println(Collections.addAll(lc,507,508));
             System.out.println(lc);
             Collections.shuffle(lc);
             System.out.println(lc);
	}

}
