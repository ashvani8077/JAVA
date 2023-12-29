import java.util.Scanner;

//Write a Java program to find sum of all natural numbers between 1 to n.
public class LoopQ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
