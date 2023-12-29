import java.util.Scanner;

//Write a Java program to check whether a year is leap year or not.
public class IfElseQ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Year:");
        int year= sc.nextInt();
        String result;
        result=(year%400==0 || year%4==0 && year%100!=0)?"LEAP YEAR":"NOT A LEAP YEAR";
        System.out.println(result);
    }
}
