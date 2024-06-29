
public class CalculationRect extends Thread{
	Rect a;
	double l,b;
	public CalculationRect(double l,double b,Rect a) {
		super();
		this.l=l;
		this.b=b;
		this.a=a;
	}
	public void run() {
		Rect.calculate(l, b);
	}

	public static void main(String[] args) {
        Rect rect=new Rect();
        CalculationRect room=new CalculationRect(2,3,rect);
        room.start();
        CalculationRect room1=new CalculationRect(4,3,rect);
        
        room1.start();
        CalculationRect room2=new CalculationRect(4,3,rect);
        room2.start();
	}

}
