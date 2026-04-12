 // Student class
class Student {
   


    // Fields (data members)
    int rollNumber;
    String name;
    int marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student();

        // Assigning values to fields
        s1.rollNumber = 1010;
        s1.name = "Sudhanshu";
        s1.marks = 85;

        // Calling method to display details
        s1.displayDetails();
    }
} 

