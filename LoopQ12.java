//Write a Java program to find sum of first and last digit of a number.
import java.util.Scanner;
public class LoopQ12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int last =num%10;
        int first=num;
        while (first>=10){
            first=first/10;
        }
        System.out.println("First Number: "+first);
        System.out.println("Last Number: "+last);
        System.out.println("Sum of first and last: "+(first+last));
    }
}
