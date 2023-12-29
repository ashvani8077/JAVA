import java.util.Scanner;

//Write a Java program to swap first and last digits of a number.
public class LoopQ13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int power=(int) Math.log10(num);
        int last =num%10;
        int first=(int)(num/Math.pow(10,power));
        int a=first* (int)Math.pow(10,power);
        int b=num%a;
        int number=b/10;

        int newNum=(last*(int)Math.pow(10,power))+number*10+first;
        System.out.println(newNum);
    }
}
