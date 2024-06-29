class ThreadE extends Thread{
	String nam;
	public ThreadE(String name) {
		super(name);
		this.nam=name;
	}
	public void run() {
		System.out.println(this.getName());
		try {
			ThreadE.sleep(3000);
			
			System.out.println(this .getPriority());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(this .getPriority());
	}
}
public class MyClass1 {
	public static void main(String []args) {
		for(int i=0;i<5;i++) {
		ThreadE te=new ThreadE("Thread example");
	     te.start();
        System.out.println();
		
		}
	
	}

}
