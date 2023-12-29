import java.util.Scanner;

//Write a Java program to find sum of all even numbers between 1 to n.
public class LoopQ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
