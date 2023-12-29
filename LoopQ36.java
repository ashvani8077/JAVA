import java.util.Scanner;

//Write a Java program to print Fibonacci series up to n terms.
public class LoopQ36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nth Term:");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(a);
        }
    }
}
