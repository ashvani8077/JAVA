import java.util.Scanner;

//Write a Java program to check whether a number is palindrome or not.
public class LoopQ17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number: ");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0){
            int last=num%10;
            rev=(rev*10)+last;
            num=num/10;
        }
        if (temp==rev){
            System.out.println("Yes, Palindrome Number.");
        }
        else {
            System.out.println("No, not a Palindrome Number.");
        }
    }
}
