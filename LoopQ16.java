import java.util.Scanner;

//Write a Java program to enter a number and print its reverse.
public class LoopQ16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int last;
        while (num>0){
            last=num%10;
            System.out.print(last);
            num=num/10;
        }
    }
}
