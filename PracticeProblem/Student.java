// Step 1: Create class Student
class Student {
    // Step 2: Instance variables
    int id;
    String name;
    int age;

    // Step 3: Method to display details
    void displayDetails() {
		String status="active";
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Step 4: Object creation + Step 5: Method call
public class Main {
    public static void main(String[] args) {
        // Create object of Student
        Student s1 = new Student();

        // Assign values
        s1.id = 101;
        s1.name = "Anushka";
        s1.age = 20;

        // Call display method
        s1.displayDetails();
    }
}
