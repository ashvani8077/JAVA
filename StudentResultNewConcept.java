// wap to calculate a student result and take user input and display them using static and instance variable.
import java.util.Scanner;
public class StudentResultNewConcept {
    Scanner sc=new Scanner(System.in);
    String name;
    int clas;
    int roll;
    String email;
    int num;
    int math;
    int english;
    int physics;
    int hindi;
    int chemistry;
    int total;
    double per;
    void get(){
        System.out.print("Student Name:");
        name=sc.nextLine();
        System.out.print("Class:");
        clas=sc.nextInt();
        System.out.print("Roll Number:");
        roll=sc.nextInt();
        System.out.print("Email ID:");
        sc.next();
        email=sc.nextLine();
        System.out.print("Contact Number:");
        num=sc.nextInt();
        System.out.print("Math Marks:");
        math=sc.nextInt();
        System.out.print("English Marks:");
        english=sc.nextInt();
        System.out.print("Physics Marks:");
        physics=sc.nextInt();
        System.out.print("Hindi Marks:");
        hindi=sc.nextInt();
        System.out.print("Chemistry Marks:");
        chemistry=sc.nextInt();
        total=math+english+physics+hindi+chemistry;
        per=total/5;
    }
    void display(){
        System.out.println("NAME:"+name);
        System.out.println("CLASS:"+clas);
        System.out.println("ROLL NO.:"+roll);
        System.out.println("EMAIL-ID:"+email);
        System.out.println("CONTACT NUMBER:"+num);
        System.out.println("MATH:"+math);
        System.out.println("ENGLISH:"+english);
        System.out.println("PHYSICS:"+physics);
        System.out.println("HINDI:"+hindi);
        System.out.println("CHEMISTRY:"+chemistry);
        System.out.println("TOTAL MARKS:"+total);
        System.out.println("PERCENTAGE:"+per);

    }
    public static void main(String args[]){
        StudentResultNewConcept s=new StudentResultNewConcept();
        s.get();
        s.display();
    }
}




//Ashvani Sharma
//2215000401

