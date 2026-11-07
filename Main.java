public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ana Cruz", "STU001", "BSIT", 2);
        Student student2 = new Student("Mark Reyes", "STU002", "BSCS", 1);

        CollegeStudent student3 = new CollegeStudent(
                "Lea Santos", "STU003", "BSIT", 3, "Full Scholar");

        System.out.println("===== STUDENT INFORMATION =====");
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();

        System.out.println("\n===== COLLEGE STUDENT =====");
        student3.displayInfo();

        student1.setYearLevel(4);
        System.out.println("\n===== UPDATED INFORMATION =====");
        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());
    }
}

/*
Reflection:
1. Private attributes protect the data because they can only be accessed
   through getters and setters.
2. The child constructor must call super(...) to initialize the parent
   Student information.
3. Overriding lets CollegeStudent display the basic student information
   and its own scholarship status in one method.
*/
