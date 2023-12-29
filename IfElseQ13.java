import java.util.Scanner;

//Write a Java program to input month number and print number of days in that month.
public class IfElseQ13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Month Number Between 1-12 ONLY:");
        int num=sc.nextInt();
        if (num==1||num==3||num==5||num==7||num==8||num==10||num==12){
            System.out.println(num+" month have 31 days.");
        } else if (num==4||num==6||num==9||num==11) {
            System.out.println(num+" month have 30 days.");
        } else if (num==2) {
            System.out.println(num+" month have 28 or 29 days.");
        }
        else {
            System.out.println("PLEASE ENTER MONTH NUMBER BETWEEN 1-12 ONLY.");
        }
    }
}
