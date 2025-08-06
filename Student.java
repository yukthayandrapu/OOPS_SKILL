package oops_programs;

public class Student {
	    String name;
	    int age;

	    // Constructor
	    Student(String StudentName, int StudentAge) {
	        name = StudentName;
	        age = StudentAge;
	    }

	    // Method to display student info
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Create object and pass values to constructor
	        Student s1 = new Student("Alice", 20);
	        s1.display();
	    }
	}


