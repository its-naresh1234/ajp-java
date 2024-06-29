class ThreadE2 implements Runnable
{
	String name;
	public ThreadE2(String name) 
	{
		this.name=name;
	}
	@Override
	public void run()
	{
		System.out.println("priority="+Thread.currentThread().getPriority());
		System.out.println("Name="+Thread.currentThread().getName());
		
	}
}
public class MyClass2 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++) {
			ThreadE2 te=new ThreadE2("My tread"+i);
			Thread t1=new Thread(te);
			 t1.setName(te.name);  // Set the thread name here
		     t1.start();
		     
		}
		

	}

}
