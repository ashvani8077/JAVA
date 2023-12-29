import java.util.Scanner;

//Write a Java program to check whether a number is even or odd.
public class IfElseQ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("No.:");
        int num= sc.nextInt();
        String result;
        result=(num%2==0)?"EVEN":"ODD";
        System.out.println(result);
    }
}
