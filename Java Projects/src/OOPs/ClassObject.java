package OOPs;
import java.util.Scanner;

  public class ClassObject{
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the name of the student");
        student.StudentName = ob.nextLine();
        System.out.println("Enter your technology");

        student.StudentEnrolledTechnology = ob.nextLine();
        System.out.println("Your Name is " +student. StudentName+ " and your technology is " +student.StudentEnrolledTechnology );


   }

  }
  class Student{
      String StudentName;

      String StudentEnrolledTechnology;
  }

