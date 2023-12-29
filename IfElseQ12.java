import java.util.Scanner;

//Write a Java program to input week number and print week day.
public class IfElseQ12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Week Number Between 1-7 ONLY:");
        int num=sc.nextInt();
        if (num==1){
            System.out.println("SUNDAY");
        } else if (num==2) {
            System.out.println("MONDAY");
        } else if (num==3) {
            System.out.println("TUESDAY");
        } else if (num==4) {
            System.out.println("WEDNESDAY");
        } else if (num==5) {
            System.out.println("THURSDAY");
        } else if (num==6) {
            System.out.println("FRIDAY");
        } else if (num==7) {
            System.out.println("SATURDAY");
        }
        else {
            System.out.println("PLEASE SELECT WEEK NUMBER ONLY BETWEEN 1-7.");
        }
    }
}
