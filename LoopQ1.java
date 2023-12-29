import java.util.Scanner;

//Write a Java program to print all natural numbers from 1 to n using while loop.
public class LoopQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num= sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
