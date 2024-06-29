
public class Rect {
	
  static synchronized void calculate(double l,double b) {
	  System.out.println("area="+(l*b));
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  System.out.println("perimeter="+(2*(l+b)));
  }


	

}
