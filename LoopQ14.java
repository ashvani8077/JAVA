import java.util.Scanner;
//Write a Java program to calculate sum of digits of a number.
public class LoopQ14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int count=1;
        int sum=0;
        while (num>0){
            sum=sum+count;
            num=num/10;

            count++;
        }
        System.out.println(sum);
    }
}
