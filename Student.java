
public class Student {
        int id;
	    String name;
	    int age;
	    String course;

	    public Student(int id, String name, int age, String course) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.course = course;
	    }

	    @Override
	    public String toString() {
	        return "Student ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course;
	    }
	}


