package gr.aueb.cf.ch12;

public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();                                // Invoke default constructor;
        Student bob = new Student(2, "Bob", "D.");  // Invoke Overloaded constructor; Inject values.



        student.setId(1);                       // student.id = 1;
        student.setFirstname("Alice");          // student.firstname = "Alice";
        student.setLastname("W.");              // student.lastname = "W.";

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname " + student.getFirstname());
        System.out.println("Lastname " + student.getLastname());

    //        System.out.println("Id: " + student.id);
    //        System.out.println("Firstname: " + student.firstname);
    //        System.out.println("Lastname: " + student.lastname);

        System.out.println("Student instances' count: " + Student.getStudentsCount());
    }
}
