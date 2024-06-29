
public class Employee {
		Integer id;
		String name;
		Integer Salary;
		public Employee(String name,int id,int Salary) {
			this.id=id;
			this.name=name;
			this.Salary=Salary;
		}
	
	 public String toString() {
		 return"Employee id="+id+ " "+"name="+name+" "+"salary="+Salary;
		 }
	 
}

