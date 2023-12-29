import java.util.Scanner;

//Write a Java program to find first and last digit of a number.
public class LoopQ11 {
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
    }
}
