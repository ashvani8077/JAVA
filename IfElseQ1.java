import java.util.Scanner;

//Write a Java program to find maximum between two numbers.
public class IfElseQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("No.1:");
        int n1= sc.nextInt();
        System.out.print("No.2:");
        int n2=sc.nextInt();
        if (n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else if (n2>n1) {
            System.out.println(n2+" is greater than "+n1);
        }
        else {
            System.out.print("Both Are equal");
        }
    }
}
