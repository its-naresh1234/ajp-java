import java.util.ArrayList;
import java.util.Collections;

public class EmployeeExample {

	public static void main(String[] args) {
		ArrayList<Mycls1> ar=new ArrayList<Mycls1>();
		Mycls1 e=new Mycls1(123,"Naresh",50000);
		ar.add(e);
		System.out.println(e);
		//System.out.println(Collections.addAll(ar,124,"suresh",51000));
		Mycls1 e1=new Mycls1(123,"aresh",50000);
		Mycls1 e2=new Mycls1(123,"resh",50000);
		Mycls1 e3=new Mycls1(123,"esh",50000);
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		Collections.sort(ar);
		System.out.println(ar);

	}

}
