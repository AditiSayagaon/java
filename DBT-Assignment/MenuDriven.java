package sunbeam.com;
import java.util.*;

class Student {
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollno + "  " + name + "  " + marks;
    }
}

public class MenuDriven{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int ch;

        do {
            System.out.println("Student Management");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int m = sc.nextInt();

                    students.add(new Student(r, n, m));
                    System.out.println("Student added successfully!");
                    break;

                case 2: 
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("RollNo  Name  Marks");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Enter Roll No to search: ");
                    int sr = sc.nextInt();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.rollno == sr) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: 
                    students.sort(Comparator.comparingInt(s -> s.rollno));
                    System.out.println("Students sorted by Roll No.");
                    break;

                case 5: 
                    students.sort(Comparator.comparing(s -> s.name));
                    System.out.println("Students sorted by Name.");
                    break;

                case 6: 
                    students.sort((s1, s2) -> s2.marks - s1.marks);
                    System.out.println("Students sorted by Marks.");
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 7);

        sc.close();
    }
}
