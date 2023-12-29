import java.util.Scanner;

//Write a Java program to calculate factorial of a number.
public class LoopQ23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num=sc.nextInt();
        int fact=1;
        while (num>0){
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
