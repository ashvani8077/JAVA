import java.util.Scanner;

//Write a Java program to check whether a number is Armstrong number or not.
public class LoopQ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int l=str.length();
        int temp = num;
        int sum = 0;
        while (temp != 0){
            int r = temp%10;
sum=sum+((int)Math.pow(r,l));
temp/=10;
    }if(sum==num)
System.out.println("yes");
else
System.out.println("No");
}}