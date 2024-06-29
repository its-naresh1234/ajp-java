import java.util.*;
public class Collection3 {
	public static void main(String args[]) {
		List<Employee> stulist=new ArrayList<Employee>();
		Employee s =new Employee("naresh",504,20000);
		stulist.add(s);
		stulist.add(new Employee("naresh2",503,30000));
		stulist.add(new Employee("Sathvik",505,40000));
		
		stulist.add(new Employee("ssss",506,50000));
		/*
		 * Student1 s1=new Student1(); s1.setId(506); s1.setName("naresh");
		 * stulist.add(s1);
		 */
		System.out.println(stulist);
		
	}	}


