
enum Course{
	java,
	Python,
	c,
	AWS,
	Dbms
	
	
}
public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Course c=Course.AWS;
         System.out.println(c.name());
         System.out.println(c.ordinal());//returns the assigned value
	}

}
