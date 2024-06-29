import java.util.TreeMap;


public class StudentManager {
	    TreeMap<Integer, Student> studentMap;

	    public StudentManager() {
	        studentMap = new TreeMap<>();
	    }

	    public void addStudent(int id, String name, int age, String course) 
	    {
	        Student student = new Student(id, name, age, course);
	        studentMap.put(id, student);
	        System.out.println( student);
	    }

	    public static void main(String[] args) {
	        StudentManager manager = new StudentManager();

	        // Adding students
	        manager.addStudent(101, "NARESH", 20, "Computer Science");
	        manager.addStudent(102, "MALTHU", 22, "Mechanical Engineering");
	        manager.addStudent(103, "SAI", 19, "Electrical Engineering");

	   
	    }
	}



