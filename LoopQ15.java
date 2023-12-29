import java.util.Scanner;
//Write a Java program to calculate product of digits of a number.
public class LoopQ15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int count=1;
        int pro=1;
        while (num>0){
            pro=pro*count;
            num=num/10;
            count++;
        }
        System.out.println(pro);
    }
}
