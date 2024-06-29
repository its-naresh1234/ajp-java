
public class Mycls1 implements Comparable<Mycls1>
{

	int id;
	String name;
	int salary;
	public Mycls1(int id,String name,int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
		@Override	
		public String toString()
		{
			return "Employee[id="+id+",name="+name+",salary="+salary+"]";
		}
	@Override
	public int compareTo(Mycls1 o)
	{
	if(this.name.compareTo(o.name)>0) 
	{
		return 1;
	}
	else if(this.name.compareTo(o.name)<0)
	{
	return -1;
			
	}
	else 
	{
	return 0;
	}
	}
}

	


