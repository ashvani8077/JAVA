import java.util.Scanner;

//Write a Java program to find power of a number using for loop.
public class LoopQ21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num=sc.nextInt();
        int power=0;
        while (num>9){
            power=power+1;
            num=num/10;
        }
        System.out.println("Power: "+power);

    }
}
