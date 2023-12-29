import java.util.Scanner;

//Write a Java program to count number of digits in a number.
public class LoopQ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int count=0;
        while (num>0){
            count=count+1;
            num=num/10;
        }
        System.out.println(count);
    }
}
